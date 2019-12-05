package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreBucketLifecycleConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleMod._LifecycleRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BucketLifecycleConfiguration extends js.Object {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.Array[_LifecycleRule] | js.Iterable[_LifecycleRule]
}

object _BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_LifecycleRule] | js.Iterable[_LifecycleRule]): _BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_BucketLifecycleConfiguration]
  }
}

