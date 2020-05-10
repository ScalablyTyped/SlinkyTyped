package typingsSlinky.appBuilderLib.msiOptionsMod

import typingsSlinky.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsiOptions
  extends CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  /**
    * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
    */
  val upgradeCode: js.UndefOr[String | Null] = js.native
  /**
    * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[Boolean] = js.native
}

object MsiOptions {
  @scala.inline
  def apply(): MsiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsiOptions]
  }
  @scala.inline
  implicit class MsiOptionsOps[Self <: MsiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpgradeCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeCode")(null)
        ret
    }
    @scala.inline
    def withWarningsAsErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsAsErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningsAsErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningsAsErrors")(js.undefined)
        ret
    }
  }
  
}

