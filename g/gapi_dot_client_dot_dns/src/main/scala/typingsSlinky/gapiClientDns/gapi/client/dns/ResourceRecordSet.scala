package typingsSlinky.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = this.set("rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = this.set("rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrdatas: Self = this.set("rrdatas", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
