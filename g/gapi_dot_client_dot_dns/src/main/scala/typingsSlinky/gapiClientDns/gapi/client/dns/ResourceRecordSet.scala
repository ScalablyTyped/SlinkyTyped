package typingsSlinky.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRecordSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet". */
  var kind: js.UndefOr[String] = js.native
  /** For example, www.example.com. */
  var name: js.UndefOr[String] = js.native
  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[Double] = js.native
  /** The identifier of a supported record type, for example, A, AAAA, MX, TXT, and so on. */
  var `type`: js.UndefOr[String] = js.native
}

object ResourceRecordSet {
  @scala.inline
  def apply(): ResourceRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecordSet]
  }
  @scala.inline
  implicit class ResourceRecordSetOps[Self <: ResourceRecordSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withRrdatas(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrdatas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRrdatas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rrdatas")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
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

