package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyOptionGroupMessage extends js.Object {
  /**
    * A value that indicates whether to apply the change immediately or during the next maintenance window for each instance associated with the option group.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: String = js.native
  /**
    * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
    */
  var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.native
  /**
    * Options in this list are removed from the option group.
    */
  var OptionsToRemove: js.UndefOr[OptionNamesList] = js.native
}

object ModifyOptionGroupMessage {
  @scala.inline
  def apply(OptionGroupName: String): ModifyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptionGroupMessage]
  }
  @scala.inline
  implicit class ModifyOptionGroupMessageOps[Self <: ModifyOptionGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsToInclude(value: OptionConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsToInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsToRemove(value: OptionNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToRemove")(js.undefined)
        ret
    }
  }
  
}

