package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTransferRuleInformation extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * Contains information about a specific envelope transfer rule.
    */
  var envelopeTransferRules: js.UndefOr[
    js.Array[
      /* This object contains details about an envelope transfer rule. */ EnvelopeTransferRule
    ]
  ] = js.native
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
}
object EnvelopeTransferRuleInformation {
  
  @scala.inline
  def apply(): EnvelopeTransferRuleInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTransferRuleInformation]
  }
  
  @scala.inline
  implicit class EnvelopeTransferRuleInformationMutableBuilder[Self <: EnvelopeTransferRuleInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setEnvelopeTransferRules(
      value: js.Array[
          /* This object contains details about an envelope transfer rule. */ EnvelopeTransferRule
        ]
    ): Self = StObject.set(x, "envelopeTransferRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeTransferRulesUndefined: Self = StObject.set(x, "envelopeTransferRules", js.undefined)
    
    @scala.inline
    def setEnvelopeTransferRulesVarargs(value: (/* This object contains details about an envelope transfer rule. */ EnvelopeTransferRule)*): Self = StObject.set(x, "envelopeTransferRules", js.Array(value :_*))
    
    @scala.inline
    def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
