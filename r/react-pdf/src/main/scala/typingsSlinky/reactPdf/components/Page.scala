package typingsSlinky.reactPdf.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactPdf.pageMod.LoadingProcessData
import typingsSlinky.reactPdf.pageMod.PDFPageProxy
import typingsSlinky.reactPdf.pageMod.Props
import typingsSlinky.reactPdf.pageMod.RenderFunction
import typingsSlinky.reactPdf.pageMod.TextItem
import typingsSlinky.reactPdf.pageMod.TextLayerItemInternal
import typingsSlinky.reactPdf.reactPdfStrings.canvas
import typingsSlinky.reactPdf.reactPdfStrings.none
import typingsSlinky.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("react-pdf", "Page")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPdf.mod.Page] {
    
    @scala.inline
    def classNameVarargs(value: String*): this.type = set("className", js.Array(value :_*))
    
    @scala.inline
    def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customTextRenderer(value: /* layer */ TextLayerItemInternal => ReactElement): this.type = set("customTextRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorFunction0(value: () => ReactElement): this.type = set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def error(value: String | ReactElement | RenderFunction): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLDivElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRef(value: LegacyRef[HTMLDivElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def loadingReactElement(value: ReactElement): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingFunction0(value: () => ReactElement): this.type = set("loading", js.Any.fromFunction0(value))
    
    @scala.inline
    def loading(value: String | ReactElement | RenderFunction): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noDataReactElement(value: ReactElement): this.type = set("noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noDataFunction0(value: () => ReactElement): this.type = set("noData", js.Any.fromFunction0(value))
    
    @scala.inline
    def noData(value: String | ReactElement | RenderFunction): this.type = set("noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGetAnnotationsError(value: /* error */ js.Error => Unit): this.type = set("onGetAnnotationsError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGetAnnotationsSuccess(value: /* annotations */ js.Any => Unit): this.type = set("onGetAnnotationsSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGetTextError(value: /* error */ js.Error => Unit): this.type = set("onGetTextError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGetTextSuccess(value: /* items */ js.Array[TextItem] => Unit): this.type = set("onGetTextSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadError(value: /* error */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadProgress(value: /* data */ LoadingProcessData => Unit): this.type = set("onLoadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadSuccess(value: /* page */ PDFPageProxy => Unit): this.type = set("onLoadSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderError(value: /* error */ js.Error => Unit): this.type = set("onRenderError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderSuccess(value: () => Unit): this.type = set("onRenderSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def pageIndex(value: Double): this.type = set("pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageNumber(value: Double): this.type = set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAnnotationLayer(value: Boolean): this.type = set("renderAnnotationLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderInteractiveForms(value: Boolean): this.type = set("renderInteractiveForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderMode(value: canvas | svg | none): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTextLayer(value: Boolean): this.type = set("renderTextLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Page.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
