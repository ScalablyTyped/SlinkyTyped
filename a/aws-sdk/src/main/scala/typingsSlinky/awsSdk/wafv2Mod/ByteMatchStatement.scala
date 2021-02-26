package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typingsSlinky.awsSdk.wafv2Mod.FieldToMatch = js.native
  
  /**
    * The area within the portion of a web request that you want AWS WAF to search for SearchString. Valid values include the following:  CONTAINS  The specified part of the web request must include the value of SearchString, but the location doesn't matter.  CONTAINS_WORD  The specified part of the web request must include the value of SearchString, and SearchString must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In addition, SearchString must be a word, which means that both of the following are true:    SearchString is at the beginning of the specified part of the web request or is preceded by a character other than an alphanumeric character or underscore (_). Examples include the value of a header and ;BadBot.    SearchString is at the end of the specified part of the web request or is followed by a character other than an alphanumeric character or underscore (_), for example, BadBot; and -BadBot;.    EXACTLY  The value of the specified part of the web request must exactly match the value of SearchString.  STARTS_WITH  The value of SearchString must appear at the beginning of the specified part of the web request.  ENDS_WITH  The value of SearchString must appear at the end of the specified part of the web request.
    */
  var PositionalConstraint: typingsSlinky.awsSdk.wafv2Mod.PositionalConstraint = js.native
  
  /**
    * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in FieldToMatch. The maximum length of the value is 50 bytes. Valid values depend on the component that you specify for inspection in FieldToMatch:    Method: The HTTP method that you want AWS WAF to search for. This indicates the type of operation specified in the request.     UriPath: The value that you want AWS WAF to search for in the URI path, for example, /images/daily-ad.jpg.    If SearchString includes alphabetic characters A-Z and a-z, note that the value is case sensitive.  If you're using the AWS WAF API  Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50 bytes. For example, suppose the value of Type is HEADER and the value of Data is User-Agent. If you want to search the User-Agent header for the value BadBot, you base64-encode BadBot using MIME base64-encoding and include the resulting value, QmFkQm90, in the value of SearchString.  If you're using the AWS CLI or one of the AWS SDKs  The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
    */
  var SearchString: typingsSlinky.awsSdk.wafv2Mod.SearchString = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typingsSlinky.awsSdk.wafv2Mod.TextTransformations = js.native
}
object ByteMatchStatement {
  
  @scala.inline
  def apply(
    FieldToMatch: FieldToMatch,
    PositionalConstraint: PositionalConstraint,
    SearchString: SearchString,
    TextTransformations: TextTransformations
  ): ByteMatchStatement = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], PositionalConstraint = PositionalConstraint.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchStatement]
  }
  
  @scala.inline
  implicit class ByteMatchStatementMutableBuilder[Self <: ByteMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionalConstraint(value: PositionalConstraint): Self = StObject.set(x, "PositionalConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchString(value: SearchString): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformations(value: TextTransformations): Self = StObject.set(x, "TextTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: TextTransformation*): Self = StObject.set(x, "TextTransformations", js.Array(value :_*))
  }
}
