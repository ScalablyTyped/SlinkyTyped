package typingsSlinky.dropboxjs.Dropbox

import org.scalajs.dom.raw.Blob
import typingsSlinky.dropboxjs.Dropbox.File.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadThumbnailCallback extends js.Object {
  def apply(err: ApiError, imageData: String, stat: Stat): Unit = js.native
  def apply(err: ApiError, imageData: Blob, stat: Stat): Unit = js.native
}

