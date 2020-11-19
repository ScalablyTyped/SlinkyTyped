package typingsSlinky.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneBoolean extends js.Object {
  
  var done: Boolean = js.native
  
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.native
}
object DoneBoolean {
  
  @scala.inline
  def apply(done: Boolean): DoneBoolean = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneBoolean]
  }
  
  @scala.inline
  implicit class DoneBooleanOps[Self <: DoneBoolean] (val x: Self) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
