package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionLifecycleConfig extends js.Object {
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxAgeRule] = js.native
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxCountRule] = js.native
}

object ApplicationVersionLifecycleConfig {
  @scala.inline
  def apply(): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
  @scala.inline
  implicit class ApplicationVersionLifecycleConfigOps[Self <: ApplicationVersionLifecycleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeRule(value: MaxAgeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAgeRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAgeRule")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCountRule(value: MaxCountRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCountRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCountRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCountRule")(js.undefined)
        ret
    }
  }
  
}

