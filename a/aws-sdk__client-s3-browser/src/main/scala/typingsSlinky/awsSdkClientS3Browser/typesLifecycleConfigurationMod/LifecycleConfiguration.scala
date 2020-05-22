package typingsSlinky.awsSdkClientS3Browser.typesLifecycleConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesRuleMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleConfiguration extends js.Object {
  /**
    * _Rules shape
    */
  var Rules: js.Array[Rule] | js.Iterable[Rule]
}

object LifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[Rule] | js.Iterable[Rule]): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
}

