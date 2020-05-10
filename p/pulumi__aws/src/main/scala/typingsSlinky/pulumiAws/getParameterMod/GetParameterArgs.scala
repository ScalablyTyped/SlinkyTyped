package typingsSlinky.pulumiAws.getParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterArgs extends js.Object {
  /**
    * The name of the parameter.
    */
  val name: String = js.native
  /**
    * Whether to return decrypted `SecureString` value. Defaults to `true`.
    */
  val withDecryption: js.UndefOr[Boolean] = js.native
}

object GetParameterArgs {
  @scala.inline
  def apply(name: String): GetParameterArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterArgs]
  }
  @scala.inline
  implicit class GetParameterArgsOps[Self <: GetParameterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithDecryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDecryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithDecryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDecryption")(js.undefined)
        ret
    }
  }
  
}

