package typingsSlinky.reactPdf.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.pdfjsDist.mod.PDFDocumentProxy
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactPdf.anon.PageNumber
import typingsSlinky.reactPdf.documentMod.Props
import typingsSlinky.reactPdf.documentMod.RenderFunction
import typingsSlinky.reactPdf.documentMod.default
import typingsSlinky.reactPdf.reactPdfStrings._blank
import typingsSlinky.reactPdf.reactPdfStrings._parent
import typingsSlinky.reactPdf.reactPdfStrings._self
import typingsSlinky.reactPdf.reactPdfStrings._top
import typingsSlinky.reactPdf.reactPdfStrings.canvas
import typingsSlinky.reactPdf.reactPdfStrings.none
import typingsSlinky.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Document {
  @JSImport("react-pdf/dist/Document", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def errorFunction0(value: () => ReactElement): this.type = set("error", js.Any.fromFunction0(value))
    @scala.inline
    def error(value: String | ReactElement | RenderFunction): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def externalLinkTarget(value: _self | _blank | _parent | _top): this.type = set("externalLinkTarget", value.asInstanceOf[js.Any])
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
    def onItemClick(value: /* hasPageNumber */ PageNumber => Unit): this.type = set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadError(value: /* error */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadSuccess(value: /* pdf */ PDFDocumentProxy => Unit): this.type = set("onLoadSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def onPassword(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): this.type = set("onPassword", js.Any.fromFunction1(value))
    @scala.inline
    def onSourceError(value: /* error */ js.Error => Unit): this.type = set("onSourceError", js.Any.fromFunction1(value))
    @scala.inline
    def onSourceSuccess(value: () => Unit): this.type = set("onSourceSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def options(value: js.Any): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def renderMode(value: canvas | svg | none): this.type = set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(file: js.Any): Builder = {
    val __props = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

