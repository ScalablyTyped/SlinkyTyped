package typingsSlinky.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to QueryExpressionToFetchXmlRequest.
  */
@JSGlobal("Sdk.QueryExpressionToFetchXmlResponse")
@js.native
class QueryExpressionToFetchXmlResponse protected () extends OrganizationResponse {
  def this(responseXml: java.lang.String) = this()
  
  /**
    * Gets the results of the query conversion.
    */
  def getFetchXml(): java.lang.String = js.native
}
