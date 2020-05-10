package typingsSlinky.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishOptions extends js.Object {
  /**
    * If you wish to notify the subscribers but return from the publish() call before
    * the subscriber functions execute, use asynchronous mode
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * By default, subscribers can return "false" to prevent subsequent subscribers from
    * receiving the message. By passing cancelable:false in the options, the publisher
    * can prevent canceling.
    */
  var cancelable: js.UndefOr[Boolean] = js.native
  /**
    * If the publishers wants subscribers to be notified even if they subscribe later,
    * setting the persist flag will do that.
    */
  var persist: js.UndefOr[Boolean] = js.native
}

object PublishOptions {
  @scala.inline
  def apply(): PublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOptions]
  }
  @scala.inline
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
  }
  
}

