package typingsSlinky.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
  /**
    * Whether or not the proxy should override the Host header using the host from the target
    * @defult false
    */
  var changeOrigin: js.UndefOr[Boolean] = js.native
  /** The target url or path (mandatory) */
  var target: String = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(target: String): ProxyOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOrigin")(js.undefined)
        ret
    }
  }
  
}

