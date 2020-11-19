package typingsSlinky.microsoftSdkSoap.mod.global.Sdk

import typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Query.QueryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to FetchXmlToQueryExpressionRequest.
  * @param responseXml The response XML to the FetchXmlToQueryExpressionRequest.
  */
@JSGlobal("Sdk.FetchXmlToQueryExpressionResponse")
@js.native
class FetchXmlToQueryExpressionResponse protected () extends OrganizationResponse {
  def this(responseXml: java.lang.String) = this()
  
  /**
    * Gets the results of the query conversion.
    */
  def getQuery(): QueryExpression = js.native
}
