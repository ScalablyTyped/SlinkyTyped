package typingsSlinky.atomMochaTestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomMochaOptions extends js.Object {
  /** Whether or not to colorize output on the terminal. */
  var colors: js.UndefOr[Boolean] = js.native
  /** Whether or not to assign the created Atom environment to `global.atom`. */
  var globalAtom: js.UndefOr[Boolean] = js.native
  /** The string to use for the window title in the HTML reporter. */
  var htmlTitle: js.UndefOr[String] = js.native
  /** Which reporter to use on the terminal. */
  var reporter: js.UndefOr[String] = js.native
  /** File extensions that indicate that the file contains tests. */
  var testSuffixes: js.UndefOr[js.Array[String]] = js.native
}

object AtomMochaOptions {
  @scala.inline
  def apply(): AtomMochaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtomMochaOptions]
  }
  @scala.inline
  implicit class AtomMochaOptionsOps[Self <: AtomMochaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalAtom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalAtom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalAtom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalAtom")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSuffixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSuffixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuffixes")(js.undefined)
        ret
    }
  }
  
}

