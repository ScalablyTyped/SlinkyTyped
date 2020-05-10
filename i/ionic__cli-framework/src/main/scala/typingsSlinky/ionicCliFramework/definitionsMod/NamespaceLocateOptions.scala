package typingsSlinky.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceLocateOptions extends js.Object {
  var useAliases: js.UndefOr[Boolean] = js.native
}

object NamespaceLocateOptions {
  @scala.inline
  def apply(): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
  @scala.inline
  implicit class NamespaceLocateOptionsOps[Self <: NamespaceLocateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAliases")(js.undefined)
        ret
    }
  }
  
}

