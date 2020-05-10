package typingsSlinky.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndentOptions extends js.Object {
  /**
    * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
    */
  var adjustMultilineComment: js.UndefOr[Boolean] = js.native
  /**
    * Base indent level. Default is 0.
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * Indent string. Default is 4 spaces ('    ').
    */
  var style: js.UndefOr[String] = js.native
}

object IndentOptions {
  @scala.inline
  def apply(): IndentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndentOptions]
  }
  @scala.inline
  implicit class IndentOptionsOps[Self <: IndentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustMultilineComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMultilineComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustMultilineComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustMultilineComment")(js.undefined)
        ret
    }
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

