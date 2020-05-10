package typingsSlinky.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandData extends js.Object {
  var cas: js.UndefOr[String] = js.native
  var command: String = js.native
  var execution: Double = js.native
  var key: js.UndefOr[String] = js.native
  var lifetime: js.UndefOr[Double] = js.native
  var redundancyEnabled: js.UndefOr[Boolean] = js.native
  var start: Double = js.native
  var `type`: String = js.native
  var validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]] = js.native
  var value: js.UndefOr[js.Any] = js.native
  def callback(args: js.Any*): js.Any = js.native
}

object CommandData {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => js.Any,
    command: String,
    execution: Double,
    start: Double,
    `type`: String,
    validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]]
  ): CommandData = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandData]
  }
  @scala.inline
  implicit class CommandDataOps[Self <: CommandData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withRedundancyEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedundancyEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

