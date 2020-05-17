package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewState extends js.Object {
  /**
    * Represents the view's center point as an array of two numbers `[x, y]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#center)
    */
  val center: js.Array[Double] = js.native
  /**
    * The extent represents the visible portion of a map within the view as an instance of Extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#extent)
    */
  val extent: Extent = js.native
  /**
    * Represents the size of one pixel in map units. The value of `resolution` is the result of the division of the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#extent) width by the [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#size).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#resolution)
    */
  val resolution: Double = js.native
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#rotation)
    */
  val rotation: Double = js.native
  /**
    * Represents the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#scale)
    */
  val scale: Double = js.native
  /**
    * Represents the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#size)
    */
  val size: js.Array[Double] = js.native
  /**
    * Copies the properties from a given view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#copy)
    *
    * @param state The view state to copy the properties from.
    *
    */
  def copy(state: ViewState): ViewState = js.native
  /**
    * Converts the x and y screen coordinates to map coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toMap)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toMap(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
  /**
    * Converts the x and y map coordinates to screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreen)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toScreen(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
  /**
    * Converts the x and y map coordinates to screen coordinates. This method is similar to [toScreen](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreen), without applying the view state rotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html#toScreenNoRotation)
    *
    * @param out The receiving array of the conversion.
    * @param x The horizontal screen coordinate to convert.
    * @param y The vertical screen coordinate to convert.
    *
    */
  def toScreenNoRotation(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
}

object ViewState {
  @scala.inline
  def apply(
    center: js.Array[Double],
    copy: ViewState => ViewState,
    extent: Extent,
    resolution: Double,
    rotation: Double,
    scale: Double,
    size: js.Array[Double],
    toMap: (js.Array[Double], Double, Double) => js.Array[Double],
    toScreen: (js.Array[Double], Double, Double) => js.Array[Double],
    toScreenNoRotation: (js.Array[Double], Double, Double) => js.Array[Double]
  ): ViewState = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), extent = extent.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toMap = js.Any.fromFunction3(toMap), toScreen = js.Any.fromFunction3(toScreen), toScreenNoRotation = js.Any.fromFunction3(toScreenNoRotation))
    __obj.asInstanceOf[ViewState]
  }
  @scala.inline
  implicit class ViewStateOps[Self <: ViewState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: ViewState => ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtent(value: Extent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToMap(value: (js.Array[Double], Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToScreen(value: (js.Array[Double], Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toScreen")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToScreenNoRotation(value: (js.Array[Double], Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toScreenNoRotation")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

