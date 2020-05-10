package typingsSlinky.minimist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedArgs
  extends /* arg */ StringDictionary[js.Any] {
  /**
    * If opts['--'] is true, populated with everything after the --
    */
  var `--`: js.UndefOr[js.Array[String]] = js.native
  /**
    * Contains all the arguments that didn't have an option associated with them
    */
  @JSName("_")
  var _underscore: js.Array[String] = js.native
}

object ParsedArgs {
  @scala.inline
  def apply(_underscore: js.Array[String]): ParsedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedArgs]
  }
  @scala.inline
  implicit class ParsedArgsOps[Self <: ParsedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_underscore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with--`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without--`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("--")(js.undefined)
        ret
    }
  }
  
}

