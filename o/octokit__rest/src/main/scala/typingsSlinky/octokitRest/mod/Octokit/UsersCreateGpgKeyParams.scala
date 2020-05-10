package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCreateGpgKeyParams extends js.Object {
  /**
    * Your GPG key, generated in ASCII-armored format. See "[Generating a new GPG key](https://help.github.com/articles/generating-a-new-gpg-key/)" for help creating a GPG key.
    */
  var armored_public_key: js.UndefOr[String] = js.native
}

object UsersCreateGpgKeyParams {
  @scala.inline
  def apply(): UsersCreateGpgKeyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersCreateGpgKeyParams]
  }
  @scala.inline
  implicit class UsersCreateGpgKeyParamsOps[Self <: UsersCreateGpgKeyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmored_public_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armored_public_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArmored_public_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armored_public_key")(js.undefined)
        ret
    }
  }
  
}

