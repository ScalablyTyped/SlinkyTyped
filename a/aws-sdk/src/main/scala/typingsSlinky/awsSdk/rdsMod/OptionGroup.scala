package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroup extends js.Object {
  /**
    * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
    */
  var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the name of the engine that this option group can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates the major engine version associated with this option group.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the option group.
    */
  var OptionGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides a description of the option group.
    */
  var OptionGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the option group.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * Indicates what options are available in the option group.
    */
  var Options: js.UndefOr[OptionsList] = js.native
  /**
    * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
    */
  var VpcId: js.UndefOr[String] = js.native
}

object OptionGroup {
  @scala.inline
  def apply(): OptionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroup]
  }
  @scala.inline
  implicit class OptionGroupOps[Self <: OptionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowsVpcAndNonVpcInstanceMemberships(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowsVpcAndNonVpcInstanceMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsVpcAndNonVpcInstanceMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowsVpcAndNonVpcInstanceMemberships")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: OptionsList): Self = {
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
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

