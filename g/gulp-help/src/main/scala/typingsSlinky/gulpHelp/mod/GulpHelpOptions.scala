package typingsSlinky.gulpHelp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelpOptions extends js.Object {
  /**
    * A function to run after the default help task runs
    */
  var afterPrintCallback: js.UndefOr[js.Function] = js.native
  /**
    * Adds aliases to the default help task
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Modifies the default help message
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Hide all task dependencies
    */
  var hideDepsMessage: js.UndefOr[Boolean] = js.native
  /**
    * Hide all tasks with no help message defined. Useful when including 3rd party tasks
    */
  var hideEmpty: js.UndefOr[Boolean] = js.native
}

object GulpHelpOptions {
  @scala.inline
  def apply(): GulpHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpHelpOptions]
  }
  @scala.inline
  implicit class GulpHelpOptionsOps[Self <: GulpHelpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPrintCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrintCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPrintCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrintCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDepsMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDepsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDepsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDepsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmpty")(js.undefined)
        ret
    }
  }
  
}

