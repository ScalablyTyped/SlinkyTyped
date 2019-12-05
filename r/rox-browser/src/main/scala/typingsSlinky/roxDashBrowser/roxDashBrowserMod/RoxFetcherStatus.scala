package typingsSlinky.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFetcherStatus extends js.Object

@JSImport("rox-browser", "RoxFetcherStatus")
@js.native
object RoxFetcherStatus extends js.Object {
  @js.native
  sealed trait AppliedFromCache extends RoxFetcherStatus
  
  @js.native
  sealed trait AppliedFromEmbedded extends RoxFetcherStatus
  
  @js.native
  sealed trait AppliedFromNetwork extends RoxFetcherStatus
  
  @js.native
  sealed trait ErrorFetchFailed extends RoxFetcherStatus
  
  /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromCache with String = js.native
  /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
  /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
  /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typingsSlinky.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
}

