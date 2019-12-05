package typingsSlinky.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFlagFreezeLevel extends js.Object

@JSImport("rox-browser", "RoxFlagFreezeLevel")
@js.native
object RoxFlagFreezeLevel extends js.Object {
  @js.native
  sealed trait None extends RoxFlagFreezeLevel
  
  @js.native
  sealed trait UntilForeground extends RoxFlagFreezeLevel
  
  @js.native
  sealed trait UntilLaunch extends RoxFlagFreezeLevel
  
  /* "none" */ val None: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.None with String = js.native
  /* "untilForeground" */ val UntilForeground: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilForeground with String = js.native
  /* "untilLaunch" */ val UntilLaunch: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilLaunch with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFlagFreezeLevel with String] = js.native
}

