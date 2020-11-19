package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExpression
  extends BaseNode
     with Expression {
  
  var source: Expression = js.native
  
  @JSName("type")
  var type_ImportExpression: typingsSlinky.estree.estreeStrings.ImportExpression = js.native
}
object ImportExpression {
  
  @scala.inline
  def apply(source: Expression, `type`: typingsSlinky.estree.estreeStrings.ImportExpression): ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportExpression]
  }
  
  @scala.inline
  implicit class ImportExpressionOps[Self <: ImportExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSource(value: Expression): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ImportExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
