package typingsSlinky.cordovaPluginMedia

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.MediaError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
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
  @js.native
  object Media
    extends Instantiable2[
          /* src */ String, 
          /* mediaSuccess */ js.Function0[Unit], 
          typingsSlinky.cordovaPluginMedia.Media
        ]
       with Instantiable3[
          /* src */ String, 
          /* mediaSuccess */ js.Function0[Unit], 
          /* mediaError */ js.Function1[/* error */ MediaError, js.Any], 
          typingsSlinky.cordovaPluginMedia.Media
        ]
       with Instantiable4[
          /* src */ String, 
          /* mediaSuccess */ js.Function0[Unit], 
          js.UndefOr[/* mediaError */ js.Function1[/* error */ MediaError, js.Any]], 
          /* mediaStatus */ js.Function1[/* status */ Double, Unit], 
          typingsSlinky.cordovaPluginMedia.Media
        ] {
    
    //Media statuses
    var MEDIA_NONE: Double = js.native
    
    var MEDIA_PAUSED: Double = js.native
    
    var MEDIA_RUNNING: Double = js.native
    
    var MEDIA_STARTING: Double = js.native
    
    var MEDIA_STOPPED: Double = js.native
  }
}
