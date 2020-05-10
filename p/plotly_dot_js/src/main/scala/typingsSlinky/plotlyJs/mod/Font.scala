package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  var color: Color = js.native
  /**
  	 * HTML font family - the typeface that will be applied by the web browser.
  	 * The web browser will only be able to apply a font if it is available on the system
  	 * which it operates. Provide multiple font families, separated by commas, to indicate
  	 * the preference in which to apply fonts if they aren't available on the system.
  	 * The plotly service (at https://plot.ly or on-premise) generates images on a server,
  	 * where only a select number of fonts are installed and supported.
  	 * These include *Arial*, *Balto*, *Courier New*, *Droid Sans*, *Droid Serif*,
  	 * *Droid Sans Mono*, *Gravitas One*, *Old Standard TT*, *Open Sans*, *Overpass*,
  	 * *PT Sans Narrow*, *Raleway*, *Times New Roman*.
  	 */
  var family: String = js.native
  var size: Double = js.native
}

object Font {
  @scala.inline
  def apply(color: Color, family: String, size: Double): Font = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

