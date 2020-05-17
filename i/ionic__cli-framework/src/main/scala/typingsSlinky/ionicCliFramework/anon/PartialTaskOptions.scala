package typingsSlinky.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/tasks.TaskOptions> */
@js.native
trait PartialTaskOptions extends js.Object {
  var msg: js.UndefOr[String] = js.native
  var tickInterval: js.UndefOr[Double] = js.native
}

object PartialTaskOptions {
  @scala.inline
  def apply(): PartialTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTaskOptions]
  }
  @scala.inline
  implicit class PartialTaskOptionsOps[Self <: PartialTaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withTickInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(js.undefined)
        ret
    }
  }
  
}

