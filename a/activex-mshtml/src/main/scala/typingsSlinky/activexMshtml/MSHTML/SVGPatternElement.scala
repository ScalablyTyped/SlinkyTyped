package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPatternElement extends StObject {
  
  @JSName("MSHTML.SVGPatternElement_typekey")
  var MSHTMLDotSVGPatternElement_typekey: SVGPatternElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  def hasExtension(extension: String): Boolean = js.native
  
  var height: SVGAnimatedLength = js.native
  
  val href: SVGAnimatedString = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var patternContentUnits: SVGAnimatedEnumeration = js.native
  
  var patternTransform: SVGAnimatedTransformList = js.native
  
  var patternUnits: SVGAnimatedEnumeration = js.native
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  val viewBox: SVGAnimatedRect = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var width: SVGAnimatedLength = js.native
  
  var x: SVGAnimatedLength = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
  
  var y: SVGAnimatedLength = js.native
}
object SVGPatternElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPatternElement_typekey: SVGPatternElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    patternContentUnits: SVGAnimatedEnumeration,
    patternTransform: SVGAnimatedTransformList,
    patternUnits: SVGAnimatedEnumeration,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGPatternElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], patternContentUnits = patternContentUnits.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], patternUnits = patternUnits.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPatternElement_typekey")(MSHTMLDotSVGPatternElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPatternElement]
  }
  
  @scala.inline
  implicit class SVGPatternElementMutableBuilder[Self <: SVGPatternElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGPatternElement_typekey(value: SVGPatternElement): Self = StObject.set(x, "MSHTML.SVGPatternElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternContentUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
