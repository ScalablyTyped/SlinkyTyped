package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeRequire extends js.Object {
  var HTML: js.UndefOr[Boolean] = js.native
  var action: js.UndefOr[Boolean] = js.native
  var amscd: js.UndefOr[Boolean] = js.native
  var amsmath: js.UndefOr[Boolean] = js.native
  var amssymbols: js.UndefOr[Boolean] = js.native
  var autobold: js.UndefOr[Boolean] = js.native
  var `autoload-all`: js.UndefOr[Boolean] = js.native
  var bbox: js.UndefOr[Boolean] = js.native
  var begingroup: js.UndefOr[Boolean] = js.native
  var boldsymbol: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var enclose: js.UndefOr[Boolean] = js.native
  var extpfeil: js.UndefOr[Boolean] = js.native
  var mathchoice: js.UndefOr[Boolean] = js.native
  var mhchem: js.UndefOr[Boolean] = js.native
  var newcommand: js.UndefOr[Boolean] = js.native
  var noErrors: js.UndefOr[Boolean] = js.native
  var noUndefined: js.UndefOr[Boolean] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
  var verb: js.UndefOr[Boolean] = js.native
}

object SafeRequire {
  @scala.inline
  def apply(): SafeRequire = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeRequire]
  }
  @scala.inline
  implicit class SafeRequireOps[Self <: SafeRequire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAmscd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amscd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmscd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amscd")(js.undefined)
        ret
    }
    @scala.inline
    def withAmsmath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amsmath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmsmath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amsmath")(js.undefined)
        ret
    }
    @scala.inline
    def withAmssymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amssymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmssymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amssymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withAutobold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autobold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutobold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autobold")(js.undefined)
        ret
    }
    @scala.inline
    def `withAutoload-all`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload-all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAutoload-all`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoload-all")(js.undefined)
        ret
    }
    @scala.inline
    def withBbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withBegingroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begingroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegingroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begingroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBoldsymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldsymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoldsymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldsymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEnclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclose")(js.undefined)
        ret
    }
    @scala.inline
    def withExtpfeil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extpfeil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtpfeil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extpfeil")(js.undefined)
        ret
    }
    @scala.inline
    def withMathchoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathchoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathchoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathchoice")(js.undefined)
        ret
    }
    @scala.inline
    def withMhchem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mhchem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMhchem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mhchem")(js.undefined)
        ret
    }
    @scala.inline
    def withNewcommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newcommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewcommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newcommand")(js.undefined)
        ret
    }
    @scala.inline
    def withNoErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
  }
  
}

