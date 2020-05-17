package typingsSlinky.qiniuJs.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.qiniuJs.anon.PartialConfig
import typingsSlinky.qiniuJs.anon.PartialExtra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "upload")
@js.native
object upload extends js.Object {
  def apply(
    file: Blob,
    key: js.UndefOr[Null | String],
    token: String,
    putExtra: PartialExtra,
    config: PartialConfig
  ): Observable = js.native
}

