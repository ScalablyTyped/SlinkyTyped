package typingsSlinky.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument object for an activity timeout.
  *
  */
@js.native
trait IArguments[Sender, Args] extends js.Object {
  /**
    * The most recent argument object.
    */
  var args: Args = js.native
  /**
    * The most recent sender object.
    */
  var sender: Sender = js.native
}

object IArguments {
  @scala.inline
  def apply[Sender, Args](args: Args, sender: Sender): IArguments[Sender, Args] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArguments[Sender, Args]]
  }
  @scala.inline
  implicit class IArgumentsOps[Self[sender, args] <: IArguments[sender, args], Sender, Args] (val x: Self[Sender, Args]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Sender, Args] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Sender, Args]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Sender, Args]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Sender, Args]) with Other]
    @scala.inline
    def withArgs(value: Args): Self[Sender, Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: Sender): Self[Sender, Args] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

