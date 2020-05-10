package typingsSlinky.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptions extends js.Object {
  var destinationKmsKeyName: js.UndefOr[String] = js.native
  var keepAcl: js.UndefOr[String] = js.native
  var predefinedAcl: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object CopyOptions {
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  @scala.inline
  implicit class CopyOptionsOps[Self <: CopyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationKmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationKmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

