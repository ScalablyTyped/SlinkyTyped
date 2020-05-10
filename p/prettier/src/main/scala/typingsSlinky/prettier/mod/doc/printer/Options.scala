package typingsSlinky.prettier.mod.doc.printer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Specify the line length that the printer will wrap on.
    * @default 80
    */
  var printWidth: Double = js.native
  /**
    * Specify the number of spaces per indentation-level.
    * @default 2
    */
  var tabWidth: Double = js.native
  /**
    * Indent lines with tabs instead of spaces
    * @default false
    */
  var useTabs: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(printWidth: Double, tabWidth: Double, useTabs: Boolean): Options = {
    val __obj = js.Dynamic.literal(printWidth = printWidth.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrintWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

