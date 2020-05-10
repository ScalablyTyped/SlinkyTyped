package typingsSlinky.gandiLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneRecord extends js.Object {
  var rrset_name: String = js.native
  var rrset_ttl: Double = js.native
  /**
    * One of A, AAA, CNAME, MX, NS, TXT, WKS, SRV, LOC, SPF, SSHFP, DNAME
    */
  var rrset_type: String = js.native
  var rrset_values: js.Array[String] = js.native
}

object ZoneRecord {
  @scala.inline
  def apply(rrset_name: String, rrset_ttl: Double, rrset_type: String, rrset_values: js.Array[String]): ZoneRecord = {
    val __obj = js.Dynamic.literal(rrset_name = rrset_name.asInstanceOf[js.Any], rrset_ttl = rrset_ttl.asInstanceOf[js.Any], rrset_type = rrset_type.asInstanceOf[js.Any], rrset_values = rrset_values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneRecord]
  }
  @scala.inline
  implicit class ZoneRecordOps[Self <: ZoneRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRrset_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrset_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRrset_ttl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrset_ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRrset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRrset_values(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrset_values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

