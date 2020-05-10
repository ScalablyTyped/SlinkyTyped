package typingsSlinky.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DNS resource record.
  */
@js.native
trait SchemaResourceRecord extends js.Object {
  /**
    * Relative name of the object affected by this record. Only applicable for
    * CNAME records. Example: &#39;www&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Data for this record. Values vary by record type, as defined in RFC 1035
    * (section 5) and RFC 1034 (section 3.6.1).
    */
  var rrdata: js.UndefOr[String] = js.native
  /**
    * Resource record type. Example: AAAA.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceRecord {
  @scala.inline
  def apply(): SchemaResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecord]
  }
  @scala.inline
  implicit class SchemaResourceRecordOps[Self <: SchemaResourceRecord] (val x: Self) extends AnyVal {
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
    def withRrdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRrdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrdata")(js.undefined)
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

