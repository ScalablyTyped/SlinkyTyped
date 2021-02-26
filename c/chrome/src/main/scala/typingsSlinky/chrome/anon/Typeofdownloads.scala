package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.downloads.DownloadChangedEvent
import typingsSlinky.chrome.chrome.downloads.DownloadCreatedEvent
import typingsSlinky.chrome.chrome.downloads.DownloadDeterminingFilenameEvent
import typingsSlinky.chrome.chrome.downloads.DownloadErasedEvent
import typingsSlinky.chrome.chrome.downloads.DownloadItem
import typingsSlinky.chrome.chrome.downloads.DownloadOptions
import typingsSlinky.chrome.chrome.downloads.DownloadQuery
import typingsSlinky.chrome.chrome.downloads.GetFileIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdownloads extends StObject {
  
  def acceptDanger(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def cancel(downloadId: Double): Unit = js.native
  def cancel(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def download(options: DownloadOptions): Unit = js.native
  def download(options: DownloadOptions, callback: js.Function1[/* downloadId */ Double, Unit]): Unit = js.native
  
  def drag(downloadId: Double): Unit = js.native
  
  def erase(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[Double], Unit]): Unit = js.native
  
  def getFileIcon(downloadId: Double, callback: js.Function1[/* iconURL */ String, Unit]): Unit = js.native
  def getFileIcon(
    downloadId: Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ String, Unit]
  ): Unit = js.native
  
  var onChanged: DownloadChangedEvent = js.native
  
  var onCreated: DownloadCreatedEvent = js.native
  
  var onDeterminingFilename: DownloadDeterminingFilenameEvent = js.native
  
  var onErased: DownloadErasedEvent = js.native
  
  def open(downloadId: Double): Unit = js.native
  
  def pause(downloadId: Double): Unit = js.native
  def pause(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def removeFile(downloadId: Double): Unit = js.native
  def removeFile(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def resume(downloadId: Double): Unit = js.native
  def resume(downloadId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def search(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], Unit]): Unit = js.native
  
  def setShelfEnabled(enabled: Boolean): Unit = js.native
  
  def show(downloadId: Double): Unit = js.native
  
  def showDefaultFolder(): Unit = js.native
}
