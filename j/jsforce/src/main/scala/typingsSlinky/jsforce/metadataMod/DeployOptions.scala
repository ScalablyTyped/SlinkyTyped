package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployOptions extends js.Object {
  var allowMissingFiles: js.UndefOr[Boolean] = js.native
  var autoUpdatePackage: js.UndefOr[Boolean] = js.native
  var checkOnly: js.UndefOr[Boolean] = js.native
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  var performRetrieve: js.UndefOr[Boolean] = js.native
  var purgeOnDelete: js.UndefOr[Boolean] = js.native
  var rollbackOnError: js.UndefOr[Boolean] = js.native
  var runAllTests: js.UndefOr[Boolean] = js.native
  var runTests: js.UndefOr[js.Array[String]] = js.native
  var singlePackage: js.UndefOr[Boolean] = js.native
}

object DeployOptions {
  @scala.inline
  def apply(): DeployOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployOptions]
  }
  @scala.inline
  implicit class DeployOptionsOps[Self <: DeployOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMissingFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissingFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMissingFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissingFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdatePackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatePackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdatePackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdatePackage")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformRetrieve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performRetrieve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformRetrieve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performRetrieve")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgeOnDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeOnDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgeOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeOnDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAllTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAllTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAllTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAllTests")(js.undefined)
        ret
    }
    @scala.inline
    def withRunTests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTests")(js.undefined)
        ret
    }
    @scala.inline
    def withSinglePackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singlePackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinglePackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singlePackage")(js.undefined)
        ret
    }
  }
  
}

