package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionsBatchInsertRequest extends js.Object {
  
  /** The set of conversions to insert. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.native
  
  /** Describes how encryptedUserId or encryptedUserIdCandidates[] is encrypted. This is a required field if encryptedUserId or encryptedUserIdCandidates[] is used. */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.native
}
object ConversionsBatchInsertRequest {
  
  @scala.inline
  def apply(): ConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchInsertRequest]
  }
  
  @scala.inline
  implicit class ConversionsBatchInsertRequestOps[Self <: ConversionsBatchInsertRequest] (val x: Self) extends AnyVal {
    
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
    def setConversionsVarargs(value: Conversion*): Self = this.set("conversions", js.Array(value :_*))
    
    @scala.inline
    def setConversions(value: js.Array[Conversion]): Self = this.set("conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversions: Self = this.set("conversions", js.undefined)
    
    @scala.inline
    def setEncryptionInfo(value: EncryptionInfo): Self = this.set("encryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionInfo: Self = this.set("encryptionInfo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
