package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.anon.AUDIO
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.SCREEN
import typingsSlinky.chromeApps.chromeAppsStrings.TAB
import typingsSlinky.chromeApps.chromeAppsStrings.WINDOW
import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.screen_
import typingsSlinky.chromeApps.chromeAppsStrings.tab_
import typingsSlinky.chromeApps.chromeAppsStrings.window_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.desktopCapture
/////////////////////
// Desktop Capture //
/////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen or individual windows.
  * @since Chrome 34.
  * @requires Permissions: 'desktopCapture'
  */
@JSGlobal("chrome.desktopCapture")
@js.native
object desktopCapture extends js.Object {
  
  /**
    * Hides desktop media picker dialog shown by chooseDesktopMedia().
    * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
    */
  def cancelChooseDesktopMedia(desktopMediaRequestId: integer): Unit = js.native
  
  /**
    * Shows desktop media picker UI with the specified set of sources.
    * @param sources Set of sources that should be shown to the user.
    * @param callback Provides an opaque string that can be passed to getUserMedia() API to generate media stream that corresponds to the source selected by the user.
    *                 If user didn't select any source (i.e. canceled the prompt) then the callback is called with an empty streamId.
    *                 The created streamId can be used only once and expires after a few seconds when it is not used.
    * @return Request ID to be used by cancelChooseDesktopMedia
    */
  def chooseDesktopMedia(
    sources: js.Array[
      ToStringLiteral[
        AUDIO, 
        /* keyof chrome-apps.anon.AUDIO */ SCREEN | WINDOW | TAB | typingsSlinky.chromeApps.chromeAppsStrings.AUDIO, 
        Exclude[
          /* keyof chrome-apps.anon.AUDIO */ SCREEN | WINDOW | TAB | typingsSlinky.chromeApps.chromeAppsStrings.AUDIO, 
          screen_ | window_ | tab_ | audio_
        ]
      ]
    ],
    callback: js.Function1[/* streamId */ String, Unit]
  ): integer = js.native
  
  @js.native
  object DesktopCaptureSourceType extends js.Object {
    
    var AUDIO: audio_ = js.native
    
    var SCREEN: screen_ = js.native
    
    var TAB: tab_ = js.native
    
    var WINDOW: window_ = js.native
  }
}
