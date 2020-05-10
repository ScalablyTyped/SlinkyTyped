package typingsSlinky.ent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntOpts extends js.Object {
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var named: js.UndefOr[Boolean] = js.native
  /**
  	 * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
  	 */
  var numeric: js.UndefOr[Boolean] = js.native
  /**
  	 * If opts.special is set to an Object, the key names will be forced to be encoded (defaults to forcing: <>'"&)
  	 */
  var special: js.UndefOr[js.Any] = js.native
}

object EntOpts {
  @scala.inline
  def apply(): EntOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntOpts]
  }
  @scala.inline
  implicit class EntOptsOps[Self <: EntOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(js.undefined)
        ret
    }
  }
  
}

