package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Safe extends js.Object {
  /*This block contains the flags that control what the Safe extension will allow, and what it will block. The
    * flags can be set to "all", "none", or "safe". When set to "all", no filtering is done for these values (this
    * gives MathJax’s default behavior). When set to "none", these values are always filtered out. When set to
    * "safe", then only some values are allowed.
    */
  var allow: js.UndefOr[SafeAllow] = js.native
  /*This is an object that lists the protocols that can be used in href attributes and the \href macro when URLs
    * is set to "safe" above.
    * Note that if a protocol doesn’t appear in the list, it is assumed to be false, so technically, javascript need
    * not have been listed, but it is given to make it explicit that it should not be allowed.
    */
  var safeProtocols: js.UndefOr[SafeProtocols] = js.native
  /*This is an object that lists the TeX extensions that can be loaded via the \require{} macro when require is
    * set to "safe" in the allowed property above.
    * These configuration options give you a lot of control over what actions MathJax is allowed to take. It is also
    * possible override the individual filtering functions in order to customize the filtering even further, should
    * that be needed. See the code for the details of the function names and their definitions.
    */
  var safeRequire: js.UndefOr[SafeRequire] = js.native
  /*This is an object that lists the style properties that can be used in MathML style attributes and the \style
    * and \bbox macros when styles is set to "safe" in the allowed property above.
    * Any style property that doesn’t appear on this list is not allowed to be entered and will be removed (silently)
    * from the style definition.
    */
  var safeStyles: js.UndefOr[SafeStyles] = js.native
  /*This is the maximum font size (in em’s) that the TeX input jax will allow when fontsize is set to "safe" above.
    * The default is the size of \large. Values larger than this are set to this value.
    */
  var sizeMax: js.UndefOr[Double] = js.native
  /*This is the minimum font size (in em’s) that the TeX input jax will allow when fontsize is set to "safe" above.
    * The default is the size of \scriptsize. Values less than this are set to this value.
    */
  var sizeMin: js.UndefOr[Double] = js.native
}

object Safe {
  @scala.inline
  def apply(): Safe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Safe]
  }
  @scala.inline
  implicit class SafeOps[Self <: Safe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: SafeAllow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeProtocols(value: SafeProtocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeRequire(value: SafeRequire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeRequire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeRequire")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeStyles(value: SafeStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMin")(js.undefined)
        ret
    }
  }
  
}

