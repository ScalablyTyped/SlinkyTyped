package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core.Color> */
@js.native
trait ColorPartial extends PaletteColorOptions {
  
  var `100`: js.UndefOr[String] = js.native
  
  var `200`: js.UndefOr[String] = js.native
  
  var `300`: js.UndefOr[String] = js.native
  
  var `400`: js.UndefOr[String] = js.native
  
  var `50`: js.UndefOr[String] = js.native
  
  var `500`: js.UndefOr[String] = js.native
  
  var `600`: js.UndefOr[String] = js.native
  
  var `700`: js.UndefOr[String] = js.native
  
  var `800`: js.UndefOr[String] = js.native
  
  var `900`: js.UndefOr[String] = js.native
  
  var A100: js.UndefOr[String] = js.native
  
  var A200: js.UndefOr[String] = js.native
  
  var A400: js.UndefOr[String] = js.native
  
  var A700: js.UndefOr[String] = js.native
}
object ColorPartial {
  
  @scala.inline
  def apply(): ColorPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPartial]
  }
  
  @scala.inline
  implicit class ColorPartialOps[Self <: ColorPartial] (val x: Self) extends AnyVal {
    
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
    def set100(value: String): Self = this.set("100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete100: Self = this.set("100", js.undefined)
    
    @scala.inline
    def set200(value: String): Self = this.set("200", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete200: Self = this.set("200", js.undefined)
    
    @scala.inline
    def set300(value: String): Self = this.set("300", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete300: Self = this.set("300", js.undefined)
    
    @scala.inline
    def set400(value: String): Self = this.set("400", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete400: Self = this.set("400", js.undefined)
    
    @scala.inline
    def set50(value: String): Self = this.set("50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete50: Self = this.set("50", js.undefined)
    
    @scala.inline
    def set500(value: String): Self = this.set("500", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete500: Self = this.set("500", js.undefined)
    
    @scala.inline
    def set600(value: String): Self = this.set("600", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete600: Self = this.set("600", js.undefined)
    
    @scala.inline
    def set700(value: String): Self = this.set("700", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete700: Self = this.set("700", js.undefined)
    
    @scala.inline
    def set800(value: String): Self = this.set("800", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete800: Self = this.set("800", js.undefined)
    
    @scala.inline
    def set900(value: String): Self = this.set("900", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete900: Self = this.set("900", js.undefined)
    
    @scala.inline
    def setA100(value: String): Self = this.set("A100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA100: Self = this.set("A100", js.undefined)
    
    @scala.inline
    def setA200(value: String): Self = this.set("A200", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA200: Self = this.set("A200", js.undefined)
    
    @scala.inline
    def setA400(value: String): Self = this.set("A400", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA400: Self = this.set("A400", js.undefined)
    
    @scala.inline
    def setA700(value: String): Self = this.set("A700", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA700: Self = this.set("A700", js.undefined)
  }
}
