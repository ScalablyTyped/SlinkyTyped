package typingsSlinky.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorsComponentsSpacing extends js.Object {
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[Tag] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object ColorsComponentsSpacing {
  
  @scala.inline
  def apply(): ColorsComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsComponentsSpacing]
  }
  
  @scala.inline
  implicit class ColorsComponentsSpacingOps[Self <: ColorsComponentsSpacing] (val x: Self) extends AnyVal {
    
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
    def setColors(value: js.Object): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setComponents(value: Tag): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
