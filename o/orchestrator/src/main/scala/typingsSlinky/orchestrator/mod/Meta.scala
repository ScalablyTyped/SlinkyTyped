package typingsSlinky.orchestrator.mod

import typingsSlinky.orchestrator.orchestratorStrings.`catch`
import typingsSlinky.orchestrator.orchestratorStrings.callback
import typingsSlinky.orchestrator.orchestratorStrings.promise
import typingsSlinky.orchestrator.orchestratorStrings.stream
import typingsSlinky.orchestrator.orchestratorStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var duration: Double
  var hrDuration: js.Tuple2[Double, Double]
  var runMethod: callback | `catch` | promise | stream | sync
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
}

