package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecord extends js.Object {
  
  /** Relative name of the object affected by this record. Only applicable for `CNAME` records. Example: 'www'. */
  var name: js.UndefOr[String] = js.native
  
  /** Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdata: js.UndefOr[String] = js.native
  
  /** Resource record type. Example: `AAAA`. */
  var `type`: js.UndefOr[String] = js.native
}
object ResourceRecord {
  
  @scala.inline
  def apply(): ResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecord]
  }
  
  @scala.inline
  implicit class ResourceRecordOps[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRrdata(value: String): Self = this.set("rrdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrdata: Self = this.set("rrdata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
