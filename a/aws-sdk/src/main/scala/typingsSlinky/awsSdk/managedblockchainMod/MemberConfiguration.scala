package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberConfiguration extends js.Object {
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration = js.native
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString = js.native
}

object MemberConfiguration {
  @scala.inline
  def apply(FrameworkConfiguration: MemberFrameworkConfiguration, Name: NetworkMemberNameString): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
  @scala.inline
  implicit class MemberConfigurationOps[Self <: MemberConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameworkConfiguration(value: MemberFrameworkConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameworkConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NetworkMemberNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

