package typingsSlinky.nodeZookeeperClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-zookeeper-client.node-zookeeper-client.Option> */
@js.native
trait PartialOption extends js.Object {
  var retries: js.UndefOr[Double] = js.native
  var sessionTimeout: js.UndefOr[Double] = js.native
  var spinDelay: js.UndefOr[Double] = js.native
}

object PartialOption {
  @scala.inline
  def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  @scala.inline
  implicit class PartialOptionOps[Self <: PartialOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelay")(js.undefined)
        ret
    }
  }
  
}

