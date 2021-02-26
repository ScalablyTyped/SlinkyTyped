package typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalStatus extends StObject {
  
  /** The status code, which should be an enum value of google.rpc.Code. */
  var code: js.UndefOr[Double] = js.native
  
  /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
  var details: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientProdTtSasportal.maximMazurokGapiClientProdTtSasportalStrings.SasPortalStatus with TopLevel[js.Any]
    ]
  ] = js.native
  
  /**
    * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the
    * client.
    */
  var message: js.UndefOr[String] = js.native
}
object SasPortalStatus {
  
  @scala.inline
  def apply(): SasPortalStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalStatus]
  }
  
  @scala.inline
  implicit class SasPortalStatusMutableBuilder[Self <: SasPortalStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDetails(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientProdTtSasportal.maximMazurokGapiClientProdTtSasportalStrings.SasPortalStatus with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientProdTtSasportal.maximMazurokGapiClientProdTtSasportalStrings.SasPortalStatus with TopLevel[js.Any])*
    ): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
