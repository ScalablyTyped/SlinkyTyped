package typingsSlinky.pulumiAws.licenseConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationArgs extends js.Object {
  /**
    * Description of the license configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: Input[String] = js.native
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Name of the license configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LicenseConfigurationArgs {
  @scala.inline
  def apply(licenseCountingType: Input[String]): LicenseConfigurationArgs = {
    val __obj = js.Dynamic.literal(licenseCountingType = licenseCountingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationArgs]
  }
  @scala.inline
  implicit class LicenseConfigurationArgsOps[Self <: LicenseConfigurationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseCountingType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseCountingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCountHardLimit(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseCountHardLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCountHardLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseCountHardLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseRules(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseRules")(js.undefined)
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

