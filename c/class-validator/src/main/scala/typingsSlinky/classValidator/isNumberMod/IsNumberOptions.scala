package typingsSlinky.classValidator.isNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsNumberOptions extends js.Object {
  
  var allowInfinity: js.UndefOr[Boolean] = js.native
  
  var allowNaN: js.UndefOr[Boolean] = js.native
  
  var maxDecimalPlaces: js.UndefOr[Double] = js.native
}
object IsNumberOptions {
  
  @scala.inline
  def apply(): IsNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsNumberOptions]
  }
  
  @scala.inline
  implicit class IsNumberOptionsOps[Self <: IsNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowInfinity(value: Boolean): Self = this.set("allowInfinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInfinity: Self = this.set("allowInfinity", js.undefined)
    
    @scala.inline
    def setAllowNaN(value: Boolean): Self = this.set("allowNaN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNaN: Self = this.set("allowNaN", js.undefined)
    
    @scala.inline
    def setMaxDecimalPlaces(value: Double): Self = this.set("maxDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDecimalPlaces: Self = this.set("maxDecimalPlaces", js.undefined)
  }
}
