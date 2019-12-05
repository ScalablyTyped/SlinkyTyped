package typingsSlinky.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxOverridesPosition extends js.Object

@JSImport("rox-browser", "RoxOverridesPosition")
@js.native
object RoxOverridesPosition extends js.Object {
  @js.native
  sealed trait BottomLeft extends RoxOverridesPosition
  
  @js.native
  sealed trait BottomRight extends RoxOverridesPosition
  
  @js.native
  sealed trait TopLeft extends RoxOverridesPosition
  
  @js.native
  sealed trait TopRight extends RoxOverridesPosition
  
  /* "bottom left" */ val BottomLeft: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxOverridesPosition.BottomLeft with String = js.native
  /* "bottom right" */ val BottomRight: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxOverridesPosition.BottomRight with String = js.native
  /* "top left" */ val TopLeft: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxOverridesPosition.TopLeft with String = js.native
  /* "top right" */ val TopRight: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxOverridesPosition.TopRight with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxOverridesPosition with String] = js.native
}

