package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng/service/$sce
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEService extends StObject {
  
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any = js.native
  
  def getTrustedCss(value: js.Any): js.Any = js.native
  
  def getTrustedHtml(value: js.Any): js.Any = js.native
  
  def getTrustedJs(value: js.Any): js.Any = js.native
  
  def getTrustedResourceUrl(value: js.Any): js.Any = js.native
  
  def getTrustedUrl(value: js.Any): js.Any = js.native
  
  def isEnabled(): Boolean = js.native
  
  def parse(`type`: String, expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def parseAsCss(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def parseAsHtml(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def parseAsJs(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def parseAsResourceUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def parseAsUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _] = js.native
  
  def trustAs(`type`: String, value: js.Any): js.Any = js.native
  
  def trustAsHtml(value: js.Any): js.Any = js.native
  
  def trustAsJs(value: js.Any): js.Any = js.native
  
  def trustAsResourceUrl(value: js.Any): js.Any = js.native
  
  def trustAsUrl(value: js.Any): js.Any = js.native
}
object ISCEService {
  
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    getTrustedCss: js.Any => js.Any,
    getTrustedHtml: js.Any => js.Any,
    getTrustedJs: js.Any => js.Any,
    getTrustedResourceUrl: js.Any => js.Any,
    getTrustedUrl: js.Any => js.Any,
    isEnabled: () => Boolean,
    parse: (String, String) => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsCss: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsHtml: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsJs: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsResourceUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    parseAsUrl: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _],
    trustAs: (String, js.Any) => js.Any,
    trustAsHtml: js.Any => js.Any,
    trustAsJs: js.Any => js.Any,
    trustAsResourceUrl: js.Any => js.Any,
    trustAsUrl: js.Any => js.Any
  ): ISCEService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), getTrustedCss = js.Any.fromFunction1(getTrustedCss), getTrustedHtml = js.Any.fromFunction1(getTrustedHtml), getTrustedJs = js.Any.fromFunction1(getTrustedJs), getTrustedResourceUrl = js.Any.fromFunction1(getTrustedResourceUrl), getTrustedUrl = js.Any.fromFunction1(getTrustedUrl), isEnabled = js.Any.fromFunction0(isEnabled), parse = js.Any.fromFunction2(parse), parseAsCss = js.Any.fromFunction1(parseAsCss), parseAsHtml = js.Any.fromFunction1(parseAsHtml), parseAsJs = js.Any.fromFunction1(parseAsJs), parseAsResourceUrl = js.Any.fromFunction1(parseAsResourceUrl), parseAsUrl = js.Any.fromFunction1(parseAsUrl), trustAs = js.Any.fromFunction2(trustAs), trustAsHtml = js.Any.fromFunction1(trustAsHtml), trustAsJs = js.Any.fromFunction1(trustAsJs), trustAsResourceUrl = js.Any.fromFunction1(trustAsResourceUrl), trustAsUrl = js.Any.fromFunction1(trustAsUrl))
    __obj.asInstanceOf[ISCEService]
  }
  
  @scala.inline
  implicit class ISCEServiceMutableBuilder[Self <: ISCEService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTrusted(value: (String, js.Any) => js.Any): Self = StObject.set(x, "getTrusted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTrustedCss(value: js.Any => js.Any): Self = StObject.set(x, "getTrustedCss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTrustedHtml(value: js.Any => js.Any): Self = StObject.set(x, "getTrustedHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTrustedJs(value: js.Any => js.Any): Self = StObject.set(x, "getTrustedJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTrustedResourceUrl(value: js.Any => js.Any): Self = StObject.set(x, "getTrustedResourceUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTrustedUrl(value: js.Any => js.Any): Self = StObject.set(x, "getTrustedUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: (String, String) => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseAsCss(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parseAsCss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseAsHtml(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parseAsHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseAsJs(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parseAsJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseAsResourceUrl(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parseAsResourceUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseAsUrl(value: String => js.Function2[/* context */ js.Any, /* locals */ js.Any, _]): Self = StObject.set(x, "parseAsUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrustAs(value: (String, js.Any) => js.Any): Self = StObject.set(x, "trustAs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrustAsHtml(value: js.Any => js.Any): Self = StObject.set(x, "trustAsHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrustAsJs(value: js.Any => js.Any): Self = StObject.set(x, "trustAsJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrustAsResourceUrl(value: js.Any => js.Any): Self = StObject.set(x, "trustAsResourceUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrustAsUrl(value: js.Any => js.Any): Self = StObject.set(x, "trustAsUrl", js.Any.fromFunction1(value))
  }
}
