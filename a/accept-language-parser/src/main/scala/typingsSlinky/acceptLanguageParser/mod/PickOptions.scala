package typingsSlinky.acceptLanguageParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickOptions extends js.Object {
  
  var loose: js.UndefOr[Boolean] = js.native
}
object PickOptions {
  
  @scala.inline
  def apply(): PickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptions]
  }
  
  @scala.inline
  implicit class PickOptionsOps[Self <: PickOptions] (val x: Self) extends AnyVal {
    
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
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
  }
}
