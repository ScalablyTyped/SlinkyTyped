package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableProcessorFeature extends js.Object {
  /**
    * The allowed values for the processor feature of the DB instance class.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The default value for the processor feature of the DB instance class.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.native
}

object AvailableProcessorFeature {
  @scala.inline
  def apply(): AvailableProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableProcessorFeature]
  }
  @scala.inline
  implicit class AvailableProcessorFeatureOps[Self <: AvailableProcessorFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

