package typingsSlinky.kikBrowser.anon

import typingsSlinky.kikBrowser.KikGetFromCameraCallbacks
import typingsSlinky.kikBrowser.KikGetFromCameraOptions
import typingsSlinky.kikBrowser.KikGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends js.Object {
  
  def get(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def get(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  
  def getFromCamera(callbacks: KikGetFromCameraCallbacks): Unit = js.native
  def getFromCamera(options: KikGetFromCameraOptions, callbacks: KikGetFromCameraCallbacks): Unit = js.native
  
  def getFromGallery(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def getFromGallery(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  
  def saveToGallery(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
}
