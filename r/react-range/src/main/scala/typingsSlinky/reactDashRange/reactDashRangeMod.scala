package typingsSlinky.reactDashRange

import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashRange.libRangeMod.default
import typingsSlinky.reactDashRange.libTypesMod.IProps
import typingsSlinky.reactDashRange.libTypesMod.ITrackBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range", JSImport.Namespace)
@js.native
object reactDashRangeMod extends js.Object {
  @js.native
  class Range protected () extends default {
    def this(props: IProps) = this()
  }
  
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @js.native
  object Direction extends js.Object {
    /* "to bottom" */ val Down: typingsSlinky.reactDashRange.libTypesMod.Direction.Down with String = js.native
    /* "to left" */ val Left: typingsSlinky.reactDashRange.libTypesMod.Direction.Left with String = js.native
    /* "to right" */ val Right: typingsSlinky.reactDashRange.libTypesMod.Direction.Right with String = js.native
    /* "to top" */ val Up: typingsSlinky.reactDashRange.libTypesMod.Direction.Up with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactDashRange.libTypesMod.Direction with String] = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var defaultProps: Anon_AllowOverlap = js.native
  }
  
}

