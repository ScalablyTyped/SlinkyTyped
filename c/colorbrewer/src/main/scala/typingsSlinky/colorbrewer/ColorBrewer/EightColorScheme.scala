package typingsSlinky.colorbrewer.ColorBrewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EightColorScheme extends ColorScheme {
  
  var `3`: js.Tuple3[String, String, String] = js.native
  
  var `4`: js.Tuple4[String, String, String, String] = js.native
  
  var `5`: js.Tuple5[String, String, String, String, String] = js.native
  
  var `6`: js.Tuple6[String, String, String, String, String, String] = js.native
  
  var `7`: js.Tuple7[String, String, String, String, String, String, String] = js.native
  
  var `8`: js.Tuple8[String, String, String, String, String, String, String, String] = js.native
}
object EightColorScheme {
  
  @scala.inline
  def apply(
    `3`: js.Tuple3[String, String, String],
    `4`: js.Tuple4[String, String, String, String],
    `5`: js.Tuple5[String, String, String, String, String],
    `6`: js.Tuple6[String, String, String, String, String, String],
    `7`: js.Tuple7[String, String, String, String, String, String, String],
    `8`: js.Tuple8[String, String, String, String, String, String, String, String]
  ): EightColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EightColorScheme]
  }
  
  @scala.inline
  implicit class EightColorSchemeOps[Self <: EightColorScheme] (val x: Self) extends AnyVal {
    
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
    def set3(value: js.Tuple3[String, String, String]): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: js.Tuple4[String, String, String, String]): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: js.Tuple5[String, String, String, String, String]): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set6(value: js.Tuple6[String, String, String, String, String, String]): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set7(value: js.Tuple7[String, String, String, String, String, String, String]): Self = this.set("7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: js.Tuple8[String, String, String, String, String, String, String, String]): Self = this.set("8", value.asInstanceOf[js.Any])
  }
}
