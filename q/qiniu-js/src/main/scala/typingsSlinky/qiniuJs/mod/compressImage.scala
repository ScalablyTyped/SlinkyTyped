package typingsSlinky.qiniuJs.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.qiniuJs.AnonDist
import typingsSlinky.qiniuJs.PartialCompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "compressImage")
@js.native
object compressImage extends js.Object {
  def apply(file: Blob, options: PartialCompressOptions): js.Promise[AnonDist] = js.native
}

