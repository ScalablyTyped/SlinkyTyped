package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRuleMod._Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LifecycleConfiguration extends js.Object {
  /**
    * _Rules shape
    */
  var Rules: js.Array[_Rule] | js.Iterable[_Rule]
}

object _LifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_Rule] | js.Iterable[_Rule]): _LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_LifecycleConfiguration]
  }
}

