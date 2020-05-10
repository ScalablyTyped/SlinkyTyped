package typingsSlinky.awsSdkClientS3Browser.typesBucketLifecycleConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesLifecycleRuleMod.LifecycleRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleConfiguration extends js.Object {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule] = js.native
}

object BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
  @scala.inline
  implicit class BucketLifecycleConfigurationOps[Self <: BucketLifecycleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesIterable(value: js.Iterable[LifecycleRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

