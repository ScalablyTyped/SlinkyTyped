package typingsSlinky.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeBucketPrivateOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var includeFiles: js.UndefOr[Boolean] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object MakeBucketPrivateOptions {
  @scala.inline
  def apply(): MakeBucketPrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeBucketPrivateOptions]
  }
  @scala.inline
  implicit class MakeBucketPrivateOptionsOps[Self <: MakeBucketPrivateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFiles")(js.undefined)
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

