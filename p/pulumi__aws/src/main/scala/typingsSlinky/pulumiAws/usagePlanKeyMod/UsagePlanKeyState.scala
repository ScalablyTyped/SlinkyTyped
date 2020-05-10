package typingsSlinky.pulumiAws.usagePlanKeyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanKeyState extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of a usage plan key.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: js.UndefOr[Input[String]] = js.native
  /**
    * The value of a usage plan key.
    */
  val value: js.UndefOr[Input[String]] = js.native
}

object UsagePlanKeyState {
  @scala.inline
  def apply(): UsagePlanKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKeyState]
  }
  @scala.inline
  implicit class UsagePlanKeyStateOps[Self <: UsagePlanKeyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
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
    def withUsagePlanId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsagePlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

