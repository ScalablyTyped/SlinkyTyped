package typingsSlinky.oracleOraclejet.ojvalidationBaseMod.ColorConverter

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hex
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hex3
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hsl
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hsv
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ConverterOptions extends js.Object {
  
  var format: js.UndefOr[rgb | hsl | hsv | hex | hex3] = js.native
}
object ConverterOptions {
  
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: rgb | hsl | hsv | hex | hex3): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
