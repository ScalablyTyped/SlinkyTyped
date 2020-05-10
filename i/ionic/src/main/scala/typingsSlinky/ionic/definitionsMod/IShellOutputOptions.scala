package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellOutputOptions extends IShellSpawnOptions {
  var fatalOnError: js.UndefOr[Boolean] = js.native
  var fatalOnNotFound: js.UndefOr[Boolean] = js.native
  var showError: js.UndefOr[Boolean] = js.native
}

object IShellOutputOptions {
  @scala.inline
  def apply(): IShellOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellOutputOptions]
  }
  @scala.inline
  implicit class IShellOutputOptionsOps[Self <: IShellOutputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatalOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatalOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withFatalOnNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalOnNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatalOnNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalOnNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withShowError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.undefined)
        ret
    }
  }
  
}

