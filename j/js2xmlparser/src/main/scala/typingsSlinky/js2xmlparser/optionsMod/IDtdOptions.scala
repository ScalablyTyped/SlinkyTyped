package typingsSlinky.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDtdOptions extends js.Object {
  /**
    * Whether to include a DTD in the generated XML. By default, no DTD is
    * included.
    */
  var include: js.UndefOr[Boolean] = js.native
  /**
    * The name of the DTD. This value cannot be left undefined if `include`
    * is true.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The public identifier of the DTD, excluding quotation marks. If a public
    * identifier is provided, a system identifier must be provided as well.
    * By default, no public identifier is included.
    */
  var pubId: js.UndefOr[String] = js.native
  /**
    * The system identifier of the DTD, excluding quotation marks. By default,
    * no system identifier is included.
    */
  var sysId: js.UndefOr[String] = js.native
}

object IDtdOptions {
  @scala.inline
  def apply(): IDtdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDtdOptions]
  }
  @scala.inline
  implicit class IDtdOptionsOps[Self <: IDtdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubId")(js.undefined)
        ret
    }
    @scala.inline
    def withSysId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysId")(js.undefined)
        ret
    }
  }
  
}

