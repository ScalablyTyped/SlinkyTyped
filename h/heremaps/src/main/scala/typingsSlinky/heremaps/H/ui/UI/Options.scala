package typingsSlinky.heremaps.H.ui.UI

import typingsSlinky.heremaps.H.ui.UnitSystem
import typingsSlinky.heremaps.H.ui.i18n.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameters to be passed to the UI constructor.
  * @property unitSystem {H.ui.UnitSystem=} - An optional unit system to be used by the UI, default is H.ui.UnitSystem.METRIC
  * @property zoom {(H.ui.ZoomControl.Options | boolean)=} -
  * @property zoomrectangle {(H.ui.ZoomRectangle.Options | boolean)=} -
  * @property mapsettings {(H.ui.MapSettingsControl.Options | boolean)=} -
  * @property scalebar {(H.ui.ScaleBar.Options | boolean)=} -
  * @property panorama {(H.ui.Pano.Options | boolean)=} -
  * @property distancemeasurement {(H.ui.DistanceMeasurement.Options | boolean)=} -
  * @property locale {(H.ui.i18n.Localization | string)=} - defines language in which UI can be rendered. It can be predefined H.ui.i18n.Localization object with custom translation map,
  * or a string one of following 'en-US', 'de-DE', 'es-ES', 'fi-FI', 'fr-FR', 'it-IT', 'nl-NL', 'pl-PL', 'pt-BR', 'pt-PT', 'ru-RU', 'tr-TR', 'zh-CN'. If not defined ui will use 'en-US'
  * by default
  */
@js.native
trait Options extends js.Object {
  var distancemeasurement: js.UndefOr[typingsSlinky.heremaps.H.ui.DistanceMeasurement.Options | Boolean] = js.native
  var locale: js.UndefOr[Localization | String] = js.native
  var mapsettings: js.UndefOr[typingsSlinky.heremaps.H.ui.MapSettingsControl.Options | Boolean] = js.native
  var panorama: js.UndefOr[typingsSlinky.heremaps.H.ui.Pano.Options | Boolean] = js.native
  var scalebar: js.UndefOr[typingsSlinky.heremaps.H.ui.ScaleBar.Options | Boolean] = js.native
  var unitSystem: js.UndefOr[UnitSystem] = js.native
  var zoom: js.UndefOr[typingsSlinky.heremaps.H.ui.ZoomControl.Options | Boolean] = js.native
  var zoomrectangle: js.UndefOr[typingsSlinky.heremaps.H.ui.ZoomRectangle.Options | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistancemeasurement(value: typingsSlinky.heremaps.H.ui.DistanceMeasurement.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distancemeasurement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistancemeasurement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distancemeasurement")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Localization | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMapsettings(value: typingsSlinky.heremaps.H.ui.MapSettingsControl.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapsettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPanorama(value: typingsSlinky.heremaps.H.ui.Pano.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panorama")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanorama: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panorama")(js.undefined)
        ret
    }
    @scala.inline
    def withScalebar(value: typingsSlinky.heremaps.H.ui.ScaleBar.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalebar")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitSystem(value: UnitSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: typingsSlinky.heremaps.H.ui.ZoomControl.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomrectangle(value: typingsSlinky.heremaps.H.ui.ZoomRectangle.Options | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomrectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomrectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomrectangle")(js.undefined)
        ret
    }
  }
  
}

