package typingsSlinky.pulumiAws.thingTypeMod

import typingsSlinky.pulumiAws.inputMod.iot.ThingTypeProperties
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeArgs extends js.Object {
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * , Configuration block that can contain the following properties of the thing type:
    */
  val properties: js.UndefOr[Input[ThingTypeProperties]] = js.native
}

object ThingTypeArgs {
  @scala.inline
  def apply(): ThingTypeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeArgs]
  }
  @scala.inline
  implicit class ThingTypeArgsOps[Self <: ThingTypeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecated(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
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
    def withProperties(value: Input[ThingTypeProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

