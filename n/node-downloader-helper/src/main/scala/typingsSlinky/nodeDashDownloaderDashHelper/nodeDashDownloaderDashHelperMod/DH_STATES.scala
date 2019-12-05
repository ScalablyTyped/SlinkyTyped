package typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DH_STATES extends js.Object

@JSImport("node-downloader-helper", "DH_STATES")
@js.native
object DH_STATES extends js.Object {
  @js.native
  sealed trait DOWNLOADING extends DH_STATES
  
  @js.native
  sealed trait FAILED extends DH_STATES
  
  @js.native
  sealed trait FINISHED extends DH_STATES
  
  @js.native
  sealed trait IDLE extends DH_STATES
  
  @js.native
  sealed trait PAUSED extends DH_STATES
  
  @js.native
  sealed trait RESUMED extends DH_STATES
  
  @js.native
  sealed trait STARTED extends DH_STATES
  
  @js.native
  sealed trait STOPPED extends DH_STATES
  
  /* "DOWNLOADING" */ val DOWNLOADING: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.DOWNLOADING with String = js.native
  /* "FAILED" */ val FAILED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.FAILED with String = js.native
  /* "FINISHED" */ val FINISHED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.FINISHED with String = js.native
  /* "IDLE" */ val IDLE: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.IDLE with String = js.native
  /* "PAUSED" */ val PAUSED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.PAUSED with String = js.native
  /* "RESUMED" */ val RESUMED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.RESUMED with String = js.native
  /* "STARTED" */ val STARTED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.STARTED with String = js.native
  /* "STOPPED" */ val STOPPED: typingsSlinky.nodeDashDownloaderDashHelper.nodeDashDownloaderDashHelperMod.DH_STATES.STOPPED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DH_STATES with String] = js.native
}

