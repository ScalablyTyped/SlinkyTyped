package typingsSlinky.nivoBar.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarLayerType extends js.Object
@JSImport("@nivo/bar", "BarLayerType")
@js.native
object BarLayerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarLayerType with String] = js.native
  
  @js.native
  sealed trait Axes extends BarLayerType
  /* "axes" */ @js.native
  object Axes extends TopLevel[Axes with String]
  
  @js.native
  sealed trait Bars extends BarLayerType
  /* "bars" */ @js.native
  object Bars extends TopLevel[Bars with String]
  
  @js.native
  sealed trait Grid extends BarLayerType
  /* "grid" */ @js.native
  object Grid extends TopLevel[Grid with String]
  
  @js.native
  sealed trait Legends extends BarLayerType
  /* "legends" */ @js.native
  object Legends extends TopLevel[Legends with String]
  
  @js.native
  sealed trait Markers extends BarLayerType
  /* "markers" */ @js.native
  object Markers extends TopLevel[Markers with String]
}
