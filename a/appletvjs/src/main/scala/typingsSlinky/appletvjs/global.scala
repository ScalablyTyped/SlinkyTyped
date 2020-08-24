package typingsSlinky.appletvjs

import typingsSlinky.appletvjs.AppleTVJS.NavigationDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var App: typingsSlinky.appletvjs.AppleTVJS.App = js.native
  var Device: typingsSlinky.appletvjs.AppleTVJS.Device = js.native
  var Settings: typingsSlinky.appletvjs.AppleTVJS.Settings = js.native
  var navigationDocument: NavigationDocument = js.native
  def evaluateScripts(scripts: js.Array[String], complete: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  @js.native
  object AppleTVJS extends js.Object {
    @js.native
    class Highlight ()
      extends typingsSlinky.appletvjs.AppleTVJS.Highlight
    
    @js.native
    class HighlightGroup ()
      extends typingsSlinky.appletvjs.AppleTVJS.HighlightGroup
    
    @js.native
    class Interstitial ()
      extends typingsSlinky.appletvjs.AppleTVJS.Interstitial
    
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
    
    @js.native
    class Player ()
      extends typingsSlinky.appletvjs.AppleTVJS.Player
    
    @js.native
    class Playlist ()
      extends typingsSlinky.appletvjs.AppleTVJS.Playlist
    
    @js.native
    class TVError ()
      extends typingsSlinky.appletvjs.AppleTVJS.TVError
    
  }
  
}

