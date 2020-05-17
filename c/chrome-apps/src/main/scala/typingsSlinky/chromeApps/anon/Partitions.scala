package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.runtime.WebViewPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partitions extends js.Object {
  /** Webview partition list */
  var partitions: js.Array[WebViewPartition] = js.native
}

object Partitions {
  @scala.inline
  def apply(partitions: js.Array[WebViewPartition]): Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partitions]
  }
  @scala.inline
  implicit class PartitionsOps[Self <: Partitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitions(value: js.Array[WebViewPartition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

