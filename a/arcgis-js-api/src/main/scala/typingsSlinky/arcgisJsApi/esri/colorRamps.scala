package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides convenience methods for querying color ramps (arrays of colors) used in the smart mapping [color symbology](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) module.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html)
  */
@js.native
trait colorRamps extends js.Object {
  
  /**
    * Returns all color ramps available in smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#all)
    */
  def all(): js.Array[colorRampsColorRamp] = js.native
  
  /**
    * Returns the color ramp available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) matching the given name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byName)
    */
  def byName(name: String): colorRampsColorRamp = js.native
  
  /**
    * Returns the color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html) matching the given tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  def byTag(params: colorRampsByTagParams): js.Array[colorRampsColorRamp] = js.native
  
  /**
    * Returns the names of all color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#names)
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: () => js.Array[colorRampsColorRamp]): Self = this.set("all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setByName(value: String => colorRampsColorRamp): Self = this.set("byName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setByTag(value: colorRampsByTagParams => js.Array[colorRampsColorRamp]): Self = this.set("byTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNames(value: () => js.Array[String]): Self = this.set("names", js.Any.fromFunction0(value))
  }
}
