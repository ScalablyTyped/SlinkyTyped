package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorRamps extends js.Object {
  /**
    * Returns all color ramps available in smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#all)
    *
    *
    */
  def all(): js.Array[colorRampsColorRamp] = js.native
  /**
    * Returns the color ramp available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html) matching the given name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byName)
    *
    * @param name The name of the desired color ramp.
    *
    */
  def byName(name: String): colorRampsColorRamp = js.native
  /**
    * Returns the color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html) matching the given tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only ramps containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    * @param params.excludedTags When provided, only ramps missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    */
  def byTag(params: colorRampsByTagParams): js.Array[colorRampsColorRamp] = js.native
  /**
    * Returns the names of all color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html). Any of the returned names can be used to query for color schemes using [colorSchemes.getSchemeByName()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemeByName) or the color ramp using [byName()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byName).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#names)
    *
    *
    */
  def names(): js.Array[String] = js.native
}

object colorRamps {
  @scala.inline
  def apply(
    all: () => js.Array[colorRampsColorRamp],
    byName: String => colorRampsColorRamp,
    byTag: colorRampsByTagParams => js.Array[colorRampsColorRamp],
    names: () => js.Array[String]
  ): colorRamps = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), byName = js.Any.fromFunction1(byName), byTag = js.Any.fromFunction1(byTag), names = js.Any.fromFunction0(names))
    __obj.asInstanceOf[colorRamps]
  }
  @scala.inline
  implicit class colorRampsOps[Self <: colorRamps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: () => js.Array[colorRampsColorRamp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByName(value: String => colorRampsColorRamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withByTag(value: colorRampsByTagParams => js.Array[colorRampsColorRamp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

