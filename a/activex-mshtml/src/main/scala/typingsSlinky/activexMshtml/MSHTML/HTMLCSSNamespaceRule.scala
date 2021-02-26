package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSNamespaceRule extends StObject {
  
  @JSName("MSHTML.HTMLCSSNamespaceRule_typekey")
  var MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule = js.native
  
  var cssText: String = js.native
  
  val namespaceURI: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val prefix: String = js.native
  
  val `type`: Double = js.native
}
object HTMLCSSNamespaceRule {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule,
    cssText: String,
    namespaceURI: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    prefix: String,
    `type`: Double
  ): HTMLCSSNamespaceRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSNamespaceRule_typekey")(MSHTMLDotHTMLCSSNamespaceRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSNamespaceRule]
  }
  
  @scala.inline
  implicit class HTMLCSSNamespaceRuleMutableBuilder[Self <: HTMLCSSNamespaceRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLCSSNamespaceRule_typekey(value: HTMLCSSNamespaceRule): Self = StObject.set(x, "MSHTML.HTMLCSSNamespaceRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
