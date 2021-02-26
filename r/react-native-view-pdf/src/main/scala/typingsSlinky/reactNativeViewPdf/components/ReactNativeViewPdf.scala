package typingsSlinky.reactNativeViewPdf.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeViewPdf.mod.PDFViewProps
import typingsSlinky.reactNativeViewPdf.mod.URLProps
import typingsSlinky.reactNativeViewPdf.mod.default
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typingsSlinky.reactNativeViewPdf.reactNativeViewPdfStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeViewPdf {
  
  @scala.inline
  def apply(resource: String): Builder = {
    val __props = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PDFViewProps]))
  }
  
  @JSImport("react-native-view-pdf", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def fadeInDuration(value: Double): this.type = set("fadeInDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fileFrom(value: bundle | documentsDirectory): this.type = set("fileFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: /* error */ js.Error => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Unit): this.type = set("onPageChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def onScrolled(value: /* offset */ Double => Unit): this.type = set("onScrolled", js.Any.fromFunction1(value))
    
    @scala.inline
    def resourceType(value: url | base64 | file): this.type = set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textEncoding(value: `utf-8` | `utf-16`): this.type = set("textEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def urlProps(value: URLProps): this.type = set("urlProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PDFViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
