package typingsSlinky.diff2html.lineByLineRendererMod

import typingsSlinky.diff2html.renderUtilsMod.CSSLineClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffPreparedLine extends js.Object {
  
  var content: String = js.native
  
  var newNumber: js.UndefOr[Double] = js.native
  
  var oldNumber: js.UndefOr[Double] = js.native
  
  var prefix: String = js.native
  
  var `type`: CSSLineClass = js.native
}
object DiffPreparedLine {
  
  @scala.inline
  def apply(content: String, prefix: String, `type`: CSSLineClass): DiffPreparedLine = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffPreparedLine]
  }
  
  @scala.inline
  implicit class DiffPreparedLineOps[Self <: DiffPreparedLine] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CSSLineClass): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNumber(value: Double): Self = this.set("newNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewNumber: Self = this.set("newNumber", js.undefined)
    
    @scala.inline
    def setOldNumber(value: Double): Self = this.set("oldNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldNumber: Self = this.set("oldNumber", js.undefined)
  }
}
