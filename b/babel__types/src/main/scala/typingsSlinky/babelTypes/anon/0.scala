package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends js.Object {
  
  var body: BlockStatement_ | Statement | Expression = js.native
}
object `0` {
  
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): `0` = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    
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
    def setBody(value: BlockStatement_ | Statement | Expression): Self = this.set("body", value.asInstanceOf[js.Any])
  }
}
