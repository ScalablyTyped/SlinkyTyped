package typingsSlinky.cordovaPluginMedia

import org.scalajs.dom.raw.MediaError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Media")
  @js.native
  class Media protected ()
    extends typingsSlinky.cordovaPluginMedia.Media {
    def this(src: String, mediaSuccess: js.Function0[Unit]) = this()
    def this(src: String, mediaSuccess: js.Function0[Unit], mediaError: js.Function1[/* error */ MediaError, _]) = this()
    def this(
      src: String,
      mediaSuccess: js.Function0[Unit],
      mediaError: js.UndefOr[scala.Nothing],
      mediaStatus: js.Function1[/* status */ Double, Unit]
    ) = this()
    def this(
      src: String,
      mediaSuccess: js.Function0[Unit],
      mediaError: js.Function1[/* error */ MediaError, _],
      mediaStatus: js.Function1[/* status */ Double, Unit]
    ) = this()
  }
  object Media {
    
    @JSGlobal("Media")
    @js.native
    val ^ : js.Any = js.native
    
    //Media statuses
    @JSGlobal("Media.MEDIA_NONE")
    @js.native
    def MEDIA_NONE: Double = js.native
    @scala.inline
    def MEDIA_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_NONE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_PAUSED")
    @js.native
    def MEDIA_PAUSED: Double = js.native
    @scala.inline
    def MEDIA_PAUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_PAUSED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_RUNNING")
    @js.native
    def MEDIA_RUNNING: Double = js.native
    @scala.inline
    def MEDIA_RUNNING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_RUNNING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_STARTING")
    @js.native
    def MEDIA_STARTING: Double = js.native
    @scala.inline
    def MEDIA_STARTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STARTING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Media.MEDIA_STOPPED")
    @js.native
    def MEDIA_STOPPED: Double = js.native
    @scala.inline
    def MEDIA_STOPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STOPPED")(x.asInstanceOf[js.Any])
  }
}
