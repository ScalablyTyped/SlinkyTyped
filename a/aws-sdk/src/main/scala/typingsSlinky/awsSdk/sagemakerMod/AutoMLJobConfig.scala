package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobConfig extends js.Object {
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  /**
    * Security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.native
}

object AutoMLJobConfig {
  @scala.inline
  def apply(): AutoMLJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobConfig]
  }
  @scala.inline
  implicit class AutoMLJobConfigOps[Self <: AutoMLJobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfig(value: AutoMLSecurityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfig")(js.undefined)
        ret
    }
  }
  
}

