package typingsSlinky.reactRange

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactRange.anon.AllowOverlap
import typingsSlinky.reactRange.rangeMod.default
import typingsSlinky.reactRange.typesMod.IProps
import typingsSlinky.reactRange.typesMod.ITrackBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Range protected () extends default {
    def this(props: IProps) = this()
  }
  
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  def relativeValue(value: Double, min: Double, max: Double): Double = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @js.native
  object Direction extends js.Object {
    /* "to bottom" */ val Down: typingsSlinky.reactRange.typesMod.Direction.Down with String = js.native
    /* "to left" */ val Left: typingsSlinky.reactRange.typesMod.Direction.Left with String = js.native
    /* "to right" */ val Right: typingsSlinky.reactRange.typesMod.Direction.Right with String = js.native
    /* "to top" */ val Up: typingsSlinky.reactRange.typesMod.Direction.Up with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactRange.typesMod.Direction with String] = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var defaultProps: AllowOverlap = js.native
  }
  
}

