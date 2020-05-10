package typingsSlinky.nodeGetopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed options.
  */
@js.native
trait ParsedOption extends js.Object {
  var argv: js.Array[String] = js.native
  var options: OptionMap = js.native
  def empty(): Boolean = js.native
}

object ParsedOption {
  @scala.inline
  def apply(argv: js.Array[String], empty: () => Boolean, options: OptionMap): ParsedOption = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOption]
  }
  @scala.inline
  implicit class ParsedOptionOps[Self <: ParsedOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: OptionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

