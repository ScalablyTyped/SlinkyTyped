package typingsSlinky.leafletGridlayerGooglemutant.mod.gridLayer

import typingsSlinky.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMutantOptions extends TileLayerOptions {
  var continuousWorld: js.UndefOr[Boolean] = js.native
  /**
    * Google's map styles.
    */
  var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.native
  /**
    * Google's map type. 'hybrid' is not really supported.
    */
  var `type`: js.UndefOr[GoogleMutantType] = js.native
}

object GoogleMutantOptions {
  @scala.inline
  def apply(): GoogleMutantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMutantOptions]
  }
  @scala.inline
  implicit class GoogleMutantOptionsOps[Self <: GoogleMutantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuousWorld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[GoogleMutantStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleMutantType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

