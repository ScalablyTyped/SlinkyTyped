package typingsSlinky.amqpConnectionManager.mod

import typingsSlinky.amqplib.mod.ConfirmChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelOpts extends js.Object {
  /**
  	 * if true, then ChannelWrapper assumes all messages passed to publish() and sendToQueue() are plain JSON objects.
  	 * These will be encoded automatically before being sent.
  	 */
  var json: js.UndefOr[Boolean] = js.native
  /**
  	 * Name for this channel. Used for debugging.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * A function to call whenever we reconnect to the broker (and therefore create a new underlying channel.)
  	 * This function should either accept a callback, or return a Promise. See addSetup below
  	 */
  var setup: js.UndefOr[SetupFunc] = js.native
}

object CreateChannelOpts {
  @scala.inline
  def apply(): CreateChannelOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelOpts]
  }
  @scala.inline
  implicit class CreateChannelOptsOps[Self <: CreateChannelOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupFunction2(
      value: (/* channel */ ConfirmChannel, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetupFunction1(value: /* channel */ ConfirmChannel => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetup(value: SetupFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
  }
  
}

