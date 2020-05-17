package typingsSlinky.nodeIpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Family extends js.Object {
  /**
    * Default: false
    */
  var family: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var hints: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var localAddress: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var localPort: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var lookup: js.UndefOr[Boolean] = js.native
}

object Family {
  @scala.inline
  def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
        ret
    }
  }
  
}

