package typingsSlinky.heremaps.global.H.map

import typingsSlinky.heremaps.H.map.SpatialStyle.Options
import org.scalablytyped.runtime.StObject
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
@JSGlobal("H.map.SpatialStyle")
@js.native
/**
  * Constructor
  * @param opt_options {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - The optional style attributes
  */
class SpatialStyle ()
  extends typingsSlinky.heremaps.H.map.SpatialStyle {
  def this(opt_options: typingsSlinky.heremaps.H.map.SpatialStyle) = this()
  def this(opt_options: Options) = this()
}
object SpatialStyle {
  
  @JSGlobal("H.map.SpatialStyle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("H.map.SpatialStyle.DEFAULT_STYLE")
  @js.native
  def DEFAULT_STYLE: typingsSlinky.heremaps.H.map.SpatialStyle = js.native
  @scala.inline
  def DEFAULT_STYLE_=(x: typingsSlinky.heremaps.H.map.SpatialStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_STYLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("H.map.SpatialStyle.MAX_LINE_WIDTH")
  @js.native
  def MAX_LINE_WIDTH: Double = js.native
  @scala.inline
  def MAX_LINE_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LINE_WIDTH")(x.asInstanceOf[js.Any])
}
