package typingsSlinky.reactDashPdf.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.PDFDocumentProxy
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.reactDashPdf.Anon_PageNumber
import typingsSlinky.reactDashPdf.distDocumentMod.RenderFunction
import typingsSlinky.reactDashPdf.distDocumentMod.default
import typingsSlinky.reactDashPdf.reactDashPdfStrings._blank
import typingsSlinky.reactDashPdf.reactDashPdfStrings._parent
import typingsSlinky.reactDashPdf.reactDashPdfStrings._self
import typingsSlinky.reactDashPdf.reactDashPdfStrings._top
import typingsSlinky.reactDashPdf.reactDashPdfStrings.canvas
import typingsSlinky.reactDashPdf.reactDashPdfStrings.none
import typingsSlinky.reactDashPdf.reactDashPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Document
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-pdf/dist/Document", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    file: js.Any,
    className: String | js.Array[String] = null,
    error: String | ReactElement | RenderFunction = null,
    externalLinkTarget: _self | _blank | _parent | _top = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | ReactElement | RenderFunction = null,
    noData: String | ReactElement | RenderFunction = null,
    onItemClick: /* hasPageNumber */ Anon_PageNumber => Unit = null,
    onLoadError: /* error */ js.Error => Unit = null,
    onLoadSuccess: /* pdf */ PDFDocumentProxy => Unit = null,
    onPassword: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit = null,
    onSourceError: /* error */ js.Error => Unit = null,
    onSourceSuccess: () => Unit = null,
    options: js.Any = null,
    renderMode: canvas | svg | none = null,
    rotate: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (externalLinkTarget != null) __obj.updateDynamic("externalLinkTarget")(externalLinkTarget.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onPassword != null) __obj.updateDynamic("onPassword")(js.Any.fromFunction1(onPassword))
    if (onSourceError != null) __obj.updateDynamic("onSourceError")(js.Any.fromFunction1(onSourceError))
    if (onSourceSuccess != null) __obj.updateDynamic("onSourceSuccess")(js.Any.fromFunction0(onSourceSuccess))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashPdf.distDocumentMod.Props
}

