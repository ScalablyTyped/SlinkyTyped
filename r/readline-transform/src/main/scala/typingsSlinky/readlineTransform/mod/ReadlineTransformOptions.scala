package typingsSlinky.readlineTransform.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadlineTransformOptions extends TransformOptions {
  /** line break matcher for str.split() (default: /\r?\n/) */
  var breakMatcher: js.UndefOr[js.RegExp] = js.native
  /** if content ends with line break, ignore last empty line (default: true) */
  var ignoreEndOfBreak: js.UndefOr[Boolean] = js.native
  /** if line is empty string, skip it (default: false) */
  var skipEmpty: js.UndefOr[Boolean] = js.native
}

object ReadlineTransformOptions {
  @scala.inline
  def apply(): ReadlineTransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadlineTransformOptions]
  }
  @scala.inline
  implicit class ReadlineTransformOptionsOps[Self <: ReadlineTransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakMatcher(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEndOfBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEndOfBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEndOfBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEndOfBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmpty")(js.undefined)
        ret
    }
  }
  
}

