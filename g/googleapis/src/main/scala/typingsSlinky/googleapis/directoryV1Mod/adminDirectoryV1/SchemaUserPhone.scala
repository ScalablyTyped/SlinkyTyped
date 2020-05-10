package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a phone entry.
  */
@js.native
trait SchemaUserPhone extends js.Object {
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary phone or not.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example phone could be of home_fax, work, mobile etc. In addition to
    * the standard type, an entry can have a custom type and can give it any
    * name. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Phone number.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserPhone {
  @scala.inline
  def apply(): SchemaUserPhone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPhone]
  }
  @scala.inline
  implicit class SchemaUserPhoneOps[Self <: SchemaUserPhone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

