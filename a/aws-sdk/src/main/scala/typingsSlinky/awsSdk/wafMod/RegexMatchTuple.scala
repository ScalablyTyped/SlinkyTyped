package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexMatchTuple extends StObject {
  
  /**
    * Specifies where in a web request to look for the RegexPatternSet.
    */
  var FieldToMatch: typingsSlinky.awsSdk.wafMod.FieldToMatch = js.native
  
  /**
    * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet (see GetRegexPatternSet), update a RegexPatternSet (see UpdateRegexPatternSet), insert a RegexPatternSet into a RegexMatchSet or delete one from a RegexMatchSet (see UpdateRegexMatchSet), and delete an RegexPatternSet from AWS WAF (see DeleteRegexPatternSet).  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on RegexPatternSet before inspecting a request for a match. You can only specify a single type of TextTransformation.  CMD_LINE  When you're concerned that attackers are injecting an operating system commandline command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.  NONE  Specify NONE if you don't want to perform any text transformations.
    */
  var TextTransformation: typingsSlinky.awsSdk.wafMod.TextTransformation = js.native
}
object RegexMatchTuple {
  
  @scala.inline
  def apply(FieldToMatch: FieldToMatch, RegexPatternSetId: ResourceId, TextTransformation: TextTransformation): RegexMatchTuple = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], TextTransformation = TextTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchTuple]
  }
  
  @scala.inline
  implicit class RegexMatchTupleMutableBuilder[Self <: RegexMatchTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: FieldToMatch): Self = StObject.set(x, "FieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: TextTransformation): Self = StObject.set(x, "TextTransformation", value.asInstanceOf[js.Any])
  }
}
