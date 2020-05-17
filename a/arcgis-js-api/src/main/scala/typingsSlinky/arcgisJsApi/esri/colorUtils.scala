package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorUtils extends js.Object {
  /**
    * Returns the average color of the view's background within the view's [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent). The view's background includes the non-reference [base layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers) of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#map)'s basemap, the [background color](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#background) of the web map (if applicable), and the background color of the view's [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#container).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColor)
    *
    * @param view The MapView instance from which to calculate the average color of the background.
    *
    */
  def getBackgroundColor(view: MapView): js.Promise[Color_] = js.native
  /**
    * This method inspects the basemap and background of a MapView and returns either `light` or `dark` as the theme of the background depending on if the average color of the basemap and the view's background is light or dark.  The background theme is determined by taking the average color of the view's background and basemap and determining its brightness based on [this algorithm for determining color visibility](https://www.w3.org/TR/AERT/#color-contrast).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColorTheme)
    *
    * @param view The MapView instance from which to get the background color theme.
    *
    */
  def getBackgroundColorTheme(view: MapView): js.Promise[String] = js.native
}

object colorUtils {
  @scala.inline
  def apply(
    getBackgroundColor: MapView => js.Promise[Color_],
    getBackgroundColorTheme: MapView => js.Promise[String]
  ): colorUtils = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction1(getBackgroundColor), getBackgroundColorTheme = js.Any.fromFunction1(getBackgroundColorTheme))
    __obj.asInstanceOf[colorUtils]
  }
  @scala.inline
  implicit class colorUtilsOps[Self <: colorUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBackgroundColor(value: MapView => js.Promise[Color_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBackgroundColorTheme(value: MapView => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundColorTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

