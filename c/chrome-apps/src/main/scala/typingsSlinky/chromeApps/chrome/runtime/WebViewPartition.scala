package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewPartition extends js.Object {
  /**
    * Path to files, relative, absolute or pattern
    * @example
    * ['local_*.html', '*.png', '*.js']
    * ['img/epic.html']
    *
    */
  var accessible_resources: js.Array[String] = js.native
  var name: String = js.native
}

object WebViewPartition {
  @scala.inline
  def apply(accessible_resources: js.Array[String], name: String): WebViewPartition = {
    val __obj = js.Dynamic.literal(accessible_resources = accessible_resources.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewPartition]
  }
  @scala.inline
  implicit class WebViewPartitionOps[Self <: WebViewPartition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessible_resources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible_resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

