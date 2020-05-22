package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecConfig
import typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Steps extends js.Object {
  var config: SpecConfig
  var steps: js.Array[SpecStep]
}

object Steps {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): Steps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
}

