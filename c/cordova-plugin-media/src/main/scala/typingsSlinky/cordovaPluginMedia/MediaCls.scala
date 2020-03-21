package typingsSlinky.cordovaPluginMedia

import org.scalajs.dom.raw.MediaError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Media")
@js.native
class MediaCls protected () extends Media {
  def this(src: String, mediaSuccess: js.Function0[Unit]) = this()
  def this(src: String, mediaSuccess: js.Function0[Unit], mediaError: js.Function1[/* error */ MediaError, _]) = this()
  def this(
    src: String,
    mediaSuccess: js.Function0[Unit],
    mediaError: js.Function1[/* error */ MediaError, _],
    mediaStatus: js.Function1[/* status */ Double, Unit]
  ) = this()
}

