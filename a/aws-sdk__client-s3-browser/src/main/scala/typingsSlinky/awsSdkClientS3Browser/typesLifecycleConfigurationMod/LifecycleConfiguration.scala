package typingsSlinky.awsSdkClientS3Browser.typesLifecycleConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesRuleMod.Rule
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRulesIterable(value: js.Iterable[Rule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRules(value: js.Array[Rule] | js.Iterable[Rule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

