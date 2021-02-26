package typingsSlinky.appletvjs

import typingsSlinky.appletvjs.AppleTVJS.App
import typingsSlinky.appletvjs.AppleTVJS.Device
import typingsSlinky.appletvjs.AppleTVJS.NavigationDocument
import typingsSlinky.appletvjs.AppleTVJS.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App: typingsSlinky.appletvjs.AppleTVJS.App = js.native
  @scala.inline
  def App_=(x: App): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
  
  object AppleTVJS {
    
    @JSGlobal("AppleTVJS.Highlight")
    @js.native
    class Highlight ()
      extends typingsSlinky.appletvjs.AppleTVJS.Highlight
    
    @JSGlobal("AppleTVJS.HighlightGroup")
    @js.native
    class HighlightGroup ()
      extends typingsSlinky.appletvjs.AppleTVJS.HighlightGroup
    
    @JSGlobal("AppleTVJS.Interstitial")
    @js.native
    class Interstitial ()
      extends typingsSlinky.appletvjs.AppleTVJS.Interstitial
    
    @JSGlobal("AppleTVJS.MediaItem")
    @js.native
    class MediaItem protected ()
      extends typingsSlinky.appletvjs.AppleTVJS.MediaItem {
      /**
        * Creates a new MediaItem object from the information stored in the URL location.
        * @type: Valid values are: audio, video. Defaults to video.
        * @url: The URL pointing to the media item information.
        * */
      def this(`type`: String) = this()
      def this(`type`: String, url: String) = this()
    }
    
    @JSGlobal("AppleTVJS.Player")
    @js.native
    class Player ()
      extends typingsSlinky.appletvjs.AppleTVJS.Player
    
    @JSGlobal("AppleTVJS.Playlist")
    @js.native
    class Playlist ()
      extends typingsSlinky.appletvjs.AppleTVJS.Playlist
    
    @JSGlobal("AppleTVJS.TVError")
    @js.native
    class TVError ()
      extends typingsSlinky.appletvjs.AppleTVJS.TVError
  }
  
  @JSGlobal("Device")
  @js.native
  def Device: typingsSlinky.appletvjs.AppleTVJS.Device = js.native
  @scala.inline
  def Device_=(x: Device): Unit = js.Dynamic.global.updateDynamic("Device")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Settings")
  @js.native
  def Settings: typingsSlinky.appletvjs.AppleTVJS.Settings = js.native
  @scala.inline
  def Settings_=(x: Settings): Unit = js.Dynamic.global.updateDynamic("Settings")(x.asInstanceOf[js.Any])
  
  @JSGlobal("evaluateScripts")
  @js.native
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("navigationDocument")
  @js.native
  def navigationDocument: NavigationDocument = js.native
  @scala.inline
  def navigationDocument_=(x: NavigationDocument): Unit = js.Dynamic.global.updateDynamic("navigationDocument")(x.asInstanceOf[js.Any])
}
