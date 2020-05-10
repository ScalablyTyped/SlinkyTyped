package typingsSlinky.leafletAwesomeMarkers.mod.AwesomeMarkers

import typingsSlinky.leaflet.mod.BaseIconOptions
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.black
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.blue
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.cadetblue
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkgreen
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkpurple
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkred
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.fa
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.glyphicon
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.green
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.orange
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.purple
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.red
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwesomeMarkersIconOptions extends BaseIconOptions {
  /**
    * Additional classes in the created tag
    */
  var extraClasses: js.UndefOr[String] = js.native
  /**
    * Name of the icon. See glyphicons or font-awesome.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
    */
  var iconColor: js.UndefOr[white | black | String] = js.native
  /**
    * Color of the marker
    */
  var markerColor: js.UndefOr[
    red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue
  ] = js.native
  /**
    * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
    */
  var prefix: js.UndefOr[fa | glyphicon] = js.native
  /**
    * Make the icon spin. true or false. Font-awesome required
    */
  var spin: js.UndefOr[Boolean] = js.native
}

object AwesomeMarkersIconOptions {
  @scala.inline
  def apply(): AwesomeMarkersIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwesomeMarkersIconOptions]
  }
  @scala.inline
  implicit class AwesomeMarkersIconOptionsOps[Self <: AwesomeMarkersIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColor(value: white | black | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerColor(value: red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: fa | glyphicon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSpin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
  }
  
}

