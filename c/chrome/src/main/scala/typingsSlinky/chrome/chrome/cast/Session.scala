package typingsSlinky.chrome.chrome.cast

import typingsSlinky.chrome.anon.Name
import typingsSlinky.chrome.chrome.cast.media.LoadRequest
import typingsSlinky.chrome.chrome.cast.media.Media
import typingsSlinky.chrome.chrome.cast.media.QueueLoadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  /**
    * @param {function(!chrome.cast.media.Media)} listener
    */
  def addMediaListener(listener: js.Function1[/* media */ Media, Unit]): Unit = js.native
  
  /**
    * @param {string} namespace
    * @param {function(string,string)} listener
    */
  def addMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  
  /**
    * @param {function(boolean)} listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  
  var appId: String = js.native
  
  var appImages: js.Array[Image] = js.native
  
  var displayName: String = js.native
  
  /**
    * @param {function()} successCallback
    * @param {function(chrome.cast.Error)} errorCallback
    */
  def leave(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * @param {!chrome.cast.media.LoadRequest} loadRequest
    * @param {function(!chrome.cast.media.Media)} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def loadMedia(
    loadRequest: LoadRequest,
    successCallback: js.Function1[/* media */ Media, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var media: js.Array[Media] = js.native
  
  var namespaces: js.Array[Name] = js.native
  
  /**
    * @param {!chrome.cast.media.QueueLoadRequest} queueLoadRequest
    * @param {function(!chrome.cast.media.Media)} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueLoad(
    queueLoadRequest: QueueLoadRequest,
    successCallback: js.Function1[/* media */ Media, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var receiver: Receiver = js.native
  
  /**
    * @param {function(!chrome.cast.media.Media)} listener
    */
  def removeMediaListener(listener: js.Function1[/* media */ Media, Unit]): Unit = js.native
  
  /**
    * @param {string} namespace
    * @param {function(string,string)} listener
    */
  def removeMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  
  /**
    * @param {function(boolean)} listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  
  /**
    * @param {string} namespace
    * @param {!Object|string} message
    * @param {!function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def sendMessage(
    namespace: String,
    message: String,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def sendMessage(
    namespace: String,
    message: js.Object,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var senderApps: js.Array[SenderApplication] = js.native
  
  var sessionId: String = js.native
  
  /**
    * @param {boolean} muted
    * @param {function()} successCallback
    * @param {function(chrome.cast.Error)} errorCallback
    */
  def setReceiverMuted(muted: Boolean, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * @param {number} newLevel
    * @param {function()} successCallback
    * @param {function(chrome.cast.Error)} errorCallback
    */
  def setReceiverVolumeLevel(
    newLevel: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var status: SessionStatus = js.native
  
  var statusText: String | Null = js.native
  
  /**
    * @param {function()} successCallback
    * @param {function(chrome.cast.Error)} errorCallback
    */
  def stop(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  var transportId: String = js.native
}
