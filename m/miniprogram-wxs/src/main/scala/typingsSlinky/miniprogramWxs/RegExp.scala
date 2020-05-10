package typingsSlinky.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExp extends js.Object {
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  val global: scala.Boolean = js.native
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  val ignoreCase: scala.Boolean = js.native
  var lastIndex: Double = js.native
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  val multiline: scala.Boolean = js.native
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  val source: java.lang.String = js.native
  // Non-standard extensions
  def compile(): this.type = js.native
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): RegExpExecArray | Null = js.native
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean = js.native
}

object RegExp {
  @scala.inline
  def apply(
    compile: () => RegExp,
    exec: java.lang.String => RegExpExecArray | Null,
    global: scala.Boolean,
    ignoreCase: scala.Boolean,
    lastIndex: Double,
    multiline: scala.Boolean,
    source: java.lang.String,
    test: java.lang.String => scala.Boolean
  ): RegExp = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), exec = js.Any.fromFunction1(exec), global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[RegExp]
  }
  @scala.inline
  implicit class RegExpOps[Self <: RegExp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompile(value: () => RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExec(value: java.lang.String => RegExpExecArray | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGlobal(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreCase(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiline(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: java.lang.String => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

