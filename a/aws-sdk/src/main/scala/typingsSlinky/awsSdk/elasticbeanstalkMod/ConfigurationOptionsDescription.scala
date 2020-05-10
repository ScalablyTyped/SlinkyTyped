package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptionsDescription extends js.Object {
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}

object ConfigurationOptionsDescription {
  @scala.inline
  def apply(): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
  @scala.inline
  implicit class ConfigurationOptionsDescriptionOps[Self <: ConfigurationOptionsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: ConfigurationOptionDescriptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformArn(value: PlatformArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: SolutionStackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(js.undefined)
        ret
    }
  }
  
}

