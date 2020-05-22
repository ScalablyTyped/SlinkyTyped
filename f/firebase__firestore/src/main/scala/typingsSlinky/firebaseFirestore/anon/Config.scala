package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.specTestRunnerMod.SpecConfig
import typingsSlinky.firebaseFirestore.specTestRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: SpecConfig
  var steps: js.Array[SpecStep]
}

object Config {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

