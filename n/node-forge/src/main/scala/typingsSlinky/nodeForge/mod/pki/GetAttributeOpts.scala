package typingsSlinky.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute members to search on; any one hit will return the attribute
  */
@js.native
trait GetAttributeOpts extends js.Object {
  /**
    * Long name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Short name
    */
  var shortName: js.UndefOr[String] = js.native
  /**
    * OID
    */
  var `type`: js.UndefOr[String] = js.native
}

object GetAttributeOpts {
  @scala.inline
  def apply(): GetAttributeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeOpts]
  }
  @scala.inline
  implicit class GetAttributeOptsOps[Self <: GetAttributeOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

