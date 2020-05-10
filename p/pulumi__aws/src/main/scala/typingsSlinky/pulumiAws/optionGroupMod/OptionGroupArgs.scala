package typingsSlinky.pulumiAws.optionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupArgs extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: Input[String] = js.native
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: Input[String] = js.native
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the option group. Defaults to "Managed by Pulumi".
    */
  val optionGroupDescription: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[Input[js.Array[Input[OptionGroupOption]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object OptionGroupArgs {
  @scala.inline
  def apply(engineName: Input[String], majorEngineVersion: Input[String]): OptionGroupArgs = {
    val __obj = js.Dynamic.literal(engineName = engineName.asInstanceOf[js.Any], majorEngineVersion = majorEngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupArgs]
  }
  @scala.inline
  implicit class OptionGroupArgsOps[Self <: OptionGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorEngineVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionGroupDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Input[js.Array[Input[OptionGroupOption]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

