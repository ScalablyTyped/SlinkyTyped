package typingsSlinky.heremaps.H.map

import typingsSlinky.heremaps.H.map.SpatialStyle.LineCap
import typingsSlinky.heremaps.H.map.SpatialStyle.LineJoin
import typingsSlinky.heremaps.H.map.SpatialStyle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SpatialStyle class represents a style with which spatial objects like polylines and polygons are drawn. A SpatialStyle instance is always treated as immutable to avoid inconstiencies
  * and must not modified.
  * @property strokeColor {string} - The color of the stroke in CSS syntax, default is 'rgba(0, 85, 170, 0.6)'.
  * @property fillColor {string} - The filling color in CSS syntax, default is 'rgba(0, 85, 170, 0.4)'.
  * @property lineWidth {number} - The width of the line in pixels, default is 2.
  * @property lineCap {H.map.SpatialStyle.LineCap} - The style of the end caps for a line, default is 'round'.
  * @property lineJoin {H.map.SpatialStyle.LineJoin} - The type of corner created, when two lines meet, default is 'miter'.
  * @property miterLimit {number} - The miter length is the distance between the inner corner and the outer corner where two lines meet. The default is 10.
  * @property lineDash {Array<number>} - The line dash pattern as an even numbered list of distances to alternately produce a line and a space. The default is [].
  * @property lineDashOffset {number} - The phase offset of the line dash pattern The default is 0.
  * @property MAX_LINE_WIDTH {number} - This constant represents the maximum line width which can be used for rendering.
  * @property DEFAULT_STYLE {H.map.SpatialStyle} - This static member defines the default style for spatial objects on the map. It's value is
  * { strokeColor: '#05A', fillColor: 'rgba(0, 85, 170, 0.4)', lineWidth: 1, lineCap: 'round', lineJoin: 'miter', miterLimit: 10, lineDash: [], lineDashOffset: 0 }
  */
@js.native
trait SpatialStyle_ extends js.Object {
  
  /**
    * This method checks value-equality with another style.
    * @param other {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to compare with
    * @returns {boolean} - true if the styles are value-equal, otherwise false
    */
  def equals(other: SpatialStyle): Boolean = js.native
  def equals(other: Options): Boolean = js.native
  
  var fillColor: String = js.native
  
  /**
    * Returns a copy of spatial style object and replaces the passed style attributes into it.
    * @param opt_attributes {H.map.SpatialStyle.Options=} - The style attributes to set on the copied style instance
    * @returns {H.map.SpatialStyle}
    */
  def getCopy(): SpatialStyle = js.native
  def getCopy(opt_attributes: Options): SpatialStyle = js.native
  
  var lineCap: LineCap = js.native
  
  var lineDash: js.Array[Double] = js.native
  
  var lineDashOffset: Double = js.native
  
  var lineJoin: LineJoin = js.native
  
  var lineWidth: Double = js.native
  
  var miterLimit: Double = js.native
  
  var strokeColor: String = js.native
}
