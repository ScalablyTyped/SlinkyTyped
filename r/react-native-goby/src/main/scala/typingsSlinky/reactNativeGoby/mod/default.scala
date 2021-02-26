package typingsSlinky.reactNativeGoby.mod

import typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus
import typingsSlinky.reactNativeGoby.mod.Goby.UpdateState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  /**
    * Decorates a React Component configuring it to sync for updates with the Goby server.
    *
    * @param options Options used to configure the end-user sync and update experience (e.g. when to check for updates?, show an prompt?, install the update immediately?).
    */
  @JSImport("react-native-goby", JSImport.Default)
  @js.native
  def apply(): js.Function = js.native
  @JSImport("react-native-goby", JSImport.Default)
  @js.native
  def apply(options: GobyOptions): js.Function = js.native
  @JSImport("react-native-goby", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates when you would like to check for (and install) updates from the Goby server.
    */
  @JSImport("react-native-goby", "default.CheckFrequency")
  @js.native
  object CheckFrequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeGoby.mod.Goby.CheckFrequency with Double] = js.native
    
    /* 2 */ val MANUAL: typingsSlinky.reactNativeGoby.mod.Goby.CheckFrequency.MANUAL with Double = js.native
    
    /* 1 */ val ON_APP_RESUME: typingsSlinky.reactNativeGoby.mod.Goby.CheckFrequency.ON_APP_RESUME with Double = js.native
    
    /* 0 */ val ON_APP_START: typingsSlinky.reactNativeGoby.mod.Goby.CheckFrequency.ON_APP_START with Double = js.native
  }
  
  /**
    * Represents the default settings that will be used by the sync method if
    * an update dialog is configured to be displayed.
    */
  @JSImport("react-native-goby", "default.DEFAULT_UPDATE_DIALOG")
  @js.native
  def DEFAULT_UPDATE_DIALOG: UpdateDialog = js.native
  @scala.inline
  def DEFAULT_UPDATE_DIALOG_=(x: UpdateDialog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UPDATE_DIALOG")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates the status of a deployment (after installing and restarting).
    */
  @JSImport("react-native-goby", "default.DeploymentStatus")
  @js.native
  object DeploymentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeGoby.mod.Goby.DeploymentStatus with Double] = js.native
    
    /* 0 */ val FAILED: typingsSlinky.reactNativeGoby.mod.Goby.DeploymentStatus.FAILED with Double = js.native
    
    /* 1 */ val SUCCEEDED: typingsSlinky.reactNativeGoby.mod.Goby.DeploymentStatus.SUCCEEDED with Double = js.native
  }
  
  /**
    * Indicates when you would like an installed update to actually be applied.
    */
  @JSImport("react-native-goby", "default.InstallMode")
  @js.native
  object InstallMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeGoby.mod.Goby.InstallMode with Double] = js.native
    
    /* 0 */ val IMMEDIATE: typingsSlinky.reactNativeGoby.mod.Goby.InstallMode.IMMEDIATE with Double = js.native
    
    /* 1 */ val ON_NEXT_RESTART: typingsSlinky.reactNativeGoby.mod.Goby.InstallMode.ON_NEXT_RESTART with Double = js.native
    
    /* 2 */ val ON_NEXT_RESUME: typingsSlinky.reactNativeGoby.mod.Goby.InstallMode.ON_NEXT_RESUME with Double = js.native
  }
  
  /**
    * Indicates the current status of a sync operation.
    */
  @JSImport("react-native-goby", "default.SyncStatus")
  @js.native
  object SyncStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus with Double] = js.native
    
    /* 1 */ val AWAITING_USER_ACTION: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.AWAITING_USER_ACTION with Double = js.native
    
    /* 0 */ val CHECKING_FOR_UPDATE: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.CHECKING_FOR_UPDATE with Double = js.native
    
    /* 2 */ val DOWNLOADING_PACKAGE: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.DOWNLOADING_PACKAGE with Double = js.native
    
    /* 3 */ val INSTALLING_UPDATE: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.INSTALLING_UPDATE with Double = js.native
    
    /* 7 */ val SYNC_IN_PROGRESS: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.SYNC_IN_PROGRESS with Double = js.native
    
    /* 8 */ val UNKNOWN_ERROR: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.UNKNOWN_ERROR with Double = js.native
    
    /* 5 */ val UPDATE_IGNORED: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.UPDATE_IGNORED with Double = js.native
    
    /* 6 */ val UPDATE_INSTALLED: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.UPDATE_INSTALLED with Double = js.native
    
    /* 4 */ val UP_TO_DATE: typingsSlinky.reactNativeGoby.mod.Goby.SyncStatus.UP_TO_DATE with Double = js.native
  }
  
  /**
    * Indicates the state that an update is currently in.
    */
  @JSImport("react-native-goby", "default.UpdateState")
  @js.native
  object UpdateState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeGoby.mod.Goby.UpdateState with Double] = js.native
    
    /* 2 */ val LATEST: typingsSlinky.reactNativeGoby.mod.Goby.UpdateState.LATEST with Double = js.native
    
    /* 1 */ val PENDING: typingsSlinky.reactNativeGoby.mod.Goby.UpdateState.PENDING with Double = js.native
    
    /* 0 */ val RUNNING: typingsSlinky.reactNativeGoby.mod.Goby.UpdateState.RUNNING with Double = js.native
  }
  
  /**
    * Allow Goby to restart the app.
    */
  @JSImport("react-native-goby", "default.allowRestart")
  @js.native
  def allowRestart(): Unit = js.native
  
  /**
    * Asks the Goby service whether the configured app deployment has an update available.
    *
    * @param deploymentKey The deployment key to use to query the Goby server for an update.
    */
  @JSImport("react-native-goby", "default.checkForUpdate")
  @js.native
  def checkForUpdate(): js.Promise[RemotePackage] = js.native
  @JSImport("react-native-goby", "default.checkForUpdate")
  @js.native
  def checkForUpdate(deploymentKey: String): js.Promise[RemotePackage] = js.native
  
  /**
    * Forbid Goby to restart the app.
    */
  @JSImport("react-native-goby", "default.disallowRestart")
  @js.native
  def disallowRestart(): Unit = js.native
  
  /**
    * Retrieves the metadata for an installed update (e.g. description, mandatory).
    *
    * @param updateState The state of the update you want to retrieve the metadata for. Defaults to UpdateState.RUNNING.
    */
  @JSImport("react-native-goby", "default.getUpdateMetadata")
  @js.native
  def getUpdateMetadata(): js.Promise[LocalPackage] = js.native
  @JSImport("react-native-goby", "default.getUpdateMetadata")
  @js.native
  def getUpdateMetadata(updateState: UpdateState): js.Promise[LocalPackage] = js.native
  
  /**
    * Notifies the Goby runtime that an installed update is considered successful.
    */
  @JSImport("react-native-goby", "default.notifyAppReady")
  @js.native
  def notifyAppReady(): js.Promise[StatusReport] = js.native
  
  /**
    * Immediately restarts the app.
    *
    * @param onlyIfUpdateIsPending Indicates whether you want the restart to no-op if there isn't currently a pending update.
    */
  @JSImport("react-native-goby", "default.restartApp")
  @js.native
  def restartApp(): Unit = js.native
  @JSImport("react-native-goby", "default.restartApp")
  @js.native
  def restartApp(onlyIfUpdateIsPending: Boolean): Unit = js.native
  
  /**
    * Allows checking for an update, downloading it and installing it, all with a single call.
    *
    * @param options Options used to configure the end-user update experience (e.g. show an prompt?, install the update immediately?).
    * @param syncStatusChangedCallback An optional callback that allows tracking the status of the sync operation, as opposed to simply checking the resolved state via the returned Promise.
    * @param downloadProgressCallback An optional callback that allows tracking the progress of an update while it is being downloaded.
    */
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(
    options: js.UndefOr[scala.Nothing],
    syncStatusChangedCallback: js.UndefOr[scala.Nothing],
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(options: js.UndefOr[scala.Nothing], syncStatusChangedCallback: SyncStatusChangedCallback): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(
    options: js.UndefOr[scala.Nothing],
    syncStatusChangedCallback: SyncStatusChangedCallback,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(options: SyncOptions): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(
    options: SyncOptions,
    syncStatusChangedCallback: js.UndefOr[scala.Nothing],
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(options: SyncOptions, syncStatusChangedCallback: SyncStatusChangedCallback): js.Promise[SyncStatus] = js.native
  @JSImport("react-native-goby", "default.sync")
  @js.native
  def sync(
    options: SyncOptions,
    syncStatusChangedCallback: SyncStatusChangedCallback,
    downloadProgressCallback: DownloadProgressCallback
  ): js.Promise[SyncStatus] = js.native
}
