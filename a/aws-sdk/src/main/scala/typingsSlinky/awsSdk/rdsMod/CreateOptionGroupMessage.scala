package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptionGroupMessage extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  var EngineName: String = js.native
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  var MajorEngineVersion: String = js.native
  /**
    * The description of the option group.
    */
  var OptionGroupDescription: String = js.native
  /**
    * Specifies the name of the option group to be created. Constraints:   Must be 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: myoptiongroup 
    */
  var OptionGroupName: String = js.native
  /**
    * Tags to assign to the option group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateOptionGroupMessage {
  @scala.inline
  def apply(
    EngineName: String,
    MajorEngineVersion: String,
    OptionGroupDescription: String,
    OptionGroupName: String
  ): CreateOptionGroupMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any], MajorEngineVersion = MajorEngineVersion.asInstanceOf[js.Any], OptionGroupDescription = OptionGroupDescription.asInstanceOf[js.Any], OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionGroupMessage]
  }
  @scala.inline
  implicit class CreateOptionGroupMessageOps[Self <: CreateOptionGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

