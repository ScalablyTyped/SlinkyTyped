package typingsSlinky.appBuilderLib.macCodeSignMod

import typingsSlinky.builderUtil.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeychainOptions extends js.Object {
  var cscIKeyPassword: js.UndefOr[String | Null] = js.native
  var cscILink: js.UndefOr[String | Null] = js.native
  var cscKeyPassword: String = js.native
  var cscLink: String = js.native
  var currentDir: String = js.native
  var tmpDir: TmpDir = js.native
}

object CreateKeychainOptions {
  @scala.inline
  def apply(cscKeyPassword: String, cscLink: String, currentDir: String, tmpDir: TmpDir): CreateKeychainOptions = {
    val __obj = js.Dynamic.literal(cscKeyPassword = cscKeyPassword.asInstanceOf[js.Any], cscLink = cscLink.asInstanceOf[js.Any], currentDir = currentDir.asInstanceOf[js.Any], tmpDir = tmpDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeychainOptions]
  }
  @scala.inline
  implicit class CreateKeychainOptionsOps[Self <: CreateKeychainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCscKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCscLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmpDir(value: TmpDir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCscIKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscIKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscIKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscIKeyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCscIKeyPasswordNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscIKeyPassword")(null)
        ret
    }
    @scala.inline
    def withCscILink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscILink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscILink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscILink")(js.undefined)
        ret
    }
    @scala.inline
    def withCscILinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscILink")(null)
        ret
    }
  }
  
}

