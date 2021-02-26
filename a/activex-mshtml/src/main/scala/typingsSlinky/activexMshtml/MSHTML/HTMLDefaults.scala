package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDefaults extends StObject {
  
  @JSName("MSHTML.HTMLDefaults_typekey")
  var MSHTMLDotHTMLDefaults_typekey: HTMLDefaults = js.native
  
  var canHaveHTML: Boolean = js.native
  
  val constructor: js.Any = js.native
  
  var contentEditable: String = js.native
  
  var frozen: Boolean = js.native
  
  var isMultiLine: Boolean = js.native
  
  var scrollSegmentX: Double = js.native
  
  var scrollSegmentY: Double = js.native
  
  val style: IHTMLStyle = js.native
  
  var tabStop: Boolean = js.native
  
  var viewInheritStyle: Boolean = js.native
  
  var viewLink: IHTMLDocument = js.native
  
  var viewMasterTab: Boolean = js.native
}
object HTMLDefaults {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLDefaults_typekey: HTMLDefaults,
    canHaveHTML: Boolean,
    constructor: js.Any,
    contentEditable: String,
    frozen: Boolean,
    isMultiLine: Boolean,
    scrollSegmentX: Double,
    scrollSegmentY: Double,
    style: IHTMLStyle,
    tabStop: Boolean,
    viewInheritStyle: Boolean,
    viewLink: IHTMLDocument,
    viewMasterTab: Boolean
  ): HTMLDefaults = {
    val __obj = js.Dynamic.literal(canHaveHTML = canHaveHTML.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], isMultiLine = isMultiLine.asInstanceOf[js.Any], scrollSegmentX = scrollSegmentX.asInstanceOf[js.Any], scrollSegmentY = scrollSegmentY.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabStop = tabStop.asInstanceOf[js.Any], viewInheritStyle = viewInheritStyle.asInstanceOf[js.Any], viewLink = viewLink.asInstanceOf[js.Any], viewMasterTab = viewMasterTab.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDefaults_typekey")(MSHTMLDotHTMLDefaults_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDefaults]
  }
  
  @scala.inline
  implicit class HTMLDefaultsMutableBuilder[Self <: HTMLDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanHaveHTML(value: Boolean): Self = StObject.set(x, "canHaveHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditable(value: String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiLine(value: Boolean): Self = StObject.set(x, "isMultiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLDefaults_typekey(value: HTMLDefaults): Self = StObject.set(x, "MSHTML.HTMLDefaults_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSegmentX(value: Double): Self = StObject.set(x, "scrollSegmentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSegmentY(value: Double): Self = StObject.set(x, "scrollSegmentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStop(value: Boolean): Self = StObject.set(x, "tabStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewInheritStyle(value: Boolean): Self = StObject.set(x, "viewInheritStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewLink(value: IHTMLDocument): Self = StObject.set(x, "viewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMasterTab(value: Boolean): Self = StObject.set(x, "viewMasterTab", value.asInstanceOf[js.Any])
  }
}
