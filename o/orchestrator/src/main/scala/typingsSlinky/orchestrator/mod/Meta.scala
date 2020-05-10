package typingsSlinky.orchestrator.mod

import typingsSlinky.orchestrator.orchestratorStrings.`catch`
import typingsSlinky.orchestrator.orchestratorStrings.callback
import typingsSlinky.orchestrator.orchestratorStrings.promise
import typingsSlinky.orchestrator.orchestratorStrings.stream
import typingsSlinky.orchestrator.orchestratorStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var duration: Double = js.native
  var hrDuration: js.Tuple2[Double, Double] = js.native
  var runMethod: callback | `catch` | promise | stream | sync = js.native
}

object Meta {
  @scala.inline
  def apply(
    duration: Double,
    hrDuration: js.Tuple2[Double, Double],
    runMethod: callback | `catch` | promise | stream | sync
  ): Meta = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hrDuration = hrDuration.asInstanceOf[js.Any], runMethod = runMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHrDuration(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunMethod(value: callback | `catch` | promise | stream | sync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runMethod")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

