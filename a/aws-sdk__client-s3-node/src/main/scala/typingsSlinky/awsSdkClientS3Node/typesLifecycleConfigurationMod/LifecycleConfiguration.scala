package typingsSlinky.awsSdkClientS3Node.typesLifecycleConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesRuleMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleConfiguration extends js.Object {
  /**
    * _Rules shape
    */
  var Rules: js.Array[Rule] | js.Iterable[Rule] = js.native
}

object LifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[Rule] | js.Iterable[Rule]): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  @scala.inline
  implicit class LifecycleConfigurationOps[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesIterable(value: js.Iterable[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Rule] | js.Iterable[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

