package typingsSlinky.awsSdkClientS3Node.typesLifecycleConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLifecycleConfiguration extends LifecycleConfiguration {
  /**
    * _Rules shape
    */
  @JSName("Rules")
  var Rules_UnmarshalledLifecycleConfiguration: js.Array[UnmarshalledRule] = js.native
}

object UnmarshalledLifecycleConfiguration {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledRule]): UnmarshalledLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledLifecycleConfigurationOps[Self <: UnmarshalledLifecycleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[UnmarshalledRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

