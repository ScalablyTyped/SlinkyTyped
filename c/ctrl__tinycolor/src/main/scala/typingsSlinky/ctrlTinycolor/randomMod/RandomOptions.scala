package typingsSlinky.ctrlTinycolor.randomMod

import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.blue
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.bright
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.dark
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.green
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.light
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.monochrome
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.orange
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.pink
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.purple
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.red
import typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomOptions extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var hue: js.UndefOr[
    Double | String | red | orange | yellow | green | blue | purple | pink | monochrome
  ] = js.native
  
  var luminosity: js.UndefOr[typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.random | bright | dark | light] = js.native
  
  var seed: js.UndefOr[Double] = js.native
}
object RandomOptions {
  
  @scala.inline
  def apply(): RandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomOptions]
  }
  
  @scala.inline
  implicit class RandomOptionsOps[Self <: RandomOptions] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setHue(value: Double | String | red | orange | yellow | green | blue | purple | pink | monochrome): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setLuminosity(value: typingsSlinky.ctrlTinycolor.ctrlTinycolorStrings.random | bright | dark | light): Self = this.set("luminosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuminosity: Self = this.set("luminosity", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
