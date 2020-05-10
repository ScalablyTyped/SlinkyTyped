package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeAllow extends js.Object {
  /*When set to "safe" only URL’s with protocols that are listed in the safeProtocols property (see below) are
    * allowed as targets of href attributes or the \href macro. By default, these are http://, https://, and
    * file:// URL’s.
    */
  var URLs: js.UndefOr[String] = js.native
  /*When set to "safe", only class names that begin with MJX- and contain only letters, numbers, or the
    * characters -, _, or . are allowed.
    */
  var classes: js.UndefOr[String] = js.native
  /*When set to "safe", only ID’s that begin with MJX- and contain only letters, numbers, or the characters -, _,
    * or . are allowed.
    */
  var cssIDs: js.UndefOr[String] = js.native
  /*When set to "safe", MathJax will try to limit the font size to sizes between those given by the sizeMin and
    * sizeMax properties. These are .7 and 1.44 by default, which means sizes between \scriptsize and \large are
    * allowed. This also filters MathML fontsize, mathsize, and scriptminsize attributes, but here, "safe" acts as
    * "none", since they are given in sizes with units, and the actual size of the units is not determined at input
    * time (it is part of the output processing). In addition, the scriptlevel attribute is restricted to
    * non-negative values (so scripts can’t be made larger), and the scriptsizemultiplier is restricted to being
    * no larger than 1, and no less than .6.
    */
  var fontsize: js.UndefOr[String] = js.native
  /*When set to "safe", only the extensions listed in the safeRequire property (see below) are allowed to be
    * loaded by the \require{} macro.
    */
  var require: js.UndefOr[String] = js.native
  /*When set to "safe", only styles taken from a predefined set of styles are allowed to be given. These are
    * listed in the safeStyles property (see below).
    */
  var styles: js.UndefOr[String] = js.native
}

object SafeAllow {
  @scala.inline
  def apply(): SafeAllow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAllow]
  }
  @scala.inline
  implicit class SafeAllowOps[Self <: SafeAllow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURLs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLs")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIDs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIDs")(js.undefined)
        ret
    }
    @scala.inline
    def withFontsize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

