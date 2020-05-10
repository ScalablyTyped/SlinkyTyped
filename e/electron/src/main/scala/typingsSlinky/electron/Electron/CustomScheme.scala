package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomScheme extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/custom-scheme
  var privileges: js.UndefOr[Privileges] = js.native
  /**
    * Custom schemes to be registered with options.
    */
  var scheme: String = js.native
}

object CustomScheme {
  @scala.inline
  def apply(scheme: String): CustomScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomScheme]
  }
  @scala.inline
  implicit class CustomSchemeOps[Self <: CustomScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivileges(value: Privileges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileges")(js.undefined)
        ret
    }
  }
  
}

