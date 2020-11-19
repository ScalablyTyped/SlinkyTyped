package typingsSlinky.realm.Realm.Sync

import typingsSlinky.realm.realmStrings.active
import typingsSlinky.realm.realmStrings.inactive
import typingsSlinky.realm.realmStrings.invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Session
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Session.html }
  */
@js.native
trait Session extends js.Object {
  
  def addConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
  
  def addProgressNotification(direction: ProgressDirection, mode: ProgressMode, progressCallback: ProgressNotificationCallback): Unit = js.native
  
  val config: SyncConfiguration = js.native
  
  val connectionState: ConnectionState = js.native
  
  def downloadAllServerChanges(): js.Promise[Unit] = js.native
  def downloadAllServerChanges(timeoutMs: Double): js.Promise[Unit] = js.native
  
  def isConnected(): Boolean = js.native
  
  def pause(): Unit = js.native
  
  def removeConnectionNotification(callback: ConnectionNotificationCallback): Unit = js.native
  
  def removeProgressNotification(progressCallback: ProgressNotificationCallback): Unit = js.native
  
  def resume(): Unit = js.native
  
  val state: invalid | active | inactive = js.native
  
  def uploadAllLocalChanges(): js.Promise[Unit] = js.native
  def uploadAllLocalChanges(timeoutMs: Double): js.Promise[Unit] = js.native
  
  val url: String = js.native
  
  val user: User = js.native
}
