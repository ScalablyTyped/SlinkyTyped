package typingsSlinky.reactPdf.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import typingsSlinky.pdfjsDist.mod.PDFPageProxy
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactPdf.pageMod.LoadingProcessData
import typingsSlinky.reactPdf.pageMod.RenderFunction
import typingsSlinky.reactPdf.pageMod.TextItem
import typingsSlinky.reactPdf.pageMod.TextLayerItemInternal
import typingsSlinky.reactPdf.pageMod.default
import typingsSlinky.reactPdf.reactPdfStrings.canvas
import typingsSlinky.reactPdf.reactPdfStrings.none
import typingsSlinky.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Page
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-pdf/dist/Page", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    className: String | js.Array[String] = null,
    customTextRenderer: /* layer */ TextLayerItemInternal => ReactElement = null,
    error: String | ReactElement | RenderFunction = null,
    height: Int | Double = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | ReactElement | RenderFunction = null,
    noData: String | ReactElement | RenderFunction = null,
    onGetAnnotationsError: /* error */ js.Error => Unit = null,
    onGetAnnotationsSuccess: /* annotations */ js.Any => Unit = null,
    onGetTextError: /* error */ js.Error => Unit = null,
    onGetTextSuccess: /* items */ js.Array[TextItem] => Unit = null,
    onLoadError: /* error */ js.Error => Unit = null,
    onLoadProgress: /* data */ LoadingProcessData => Unit = null,
    onLoadSuccess: /* page */ PDFPageProxy => Unit = null,
    onRenderError: /* error */ js.Error => Unit = null,
    onRenderSuccess: () => Unit = null,
    pageIndex: Int | Double = null,
    pageNumber: Int | Double = null,
    renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined,
    renderInteractiveForms: js.UndefOr[Boolean] = js.undefined,
    renderMode: canvas | svg | none = null,
    renderTextLayer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customTextRenderer != null) __obj.updateDynamic("customTextRenderer")(js.Any.fromFunction1(customTextRenderer))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onGetAnnotationsError != null) __obj.updateDynamic("onGetAnnotationsError")(js.Any.fromFunction1(onGetAnnotationsError))
    if (onGetAnnotationsSuccess != null) __obj.updateDynamic("onGetAnnotationsSuccess")(js.Any.fromFunction1(onGetAnnotationsSuccess))
    if (onGetTextError != null) __obj.updateDynamic("onGetTextError")(js.Any.fromFunction1(onGetTextError))
    if (onGetTextSuccess != null) __obj.updateDynamic("onGetTextSuccess")(js.Any.fromFunction1(onGetTextSuccess))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadProgress != null) __obj.updateDynamic("onLoadProgress")(js.Any.fromFunction1(onLoadProgress))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onRenderError != null) __obj.updateDynamic("onRenderError")(js.Any.fromFunction1(onRenderError))
    if (onRenderSuccess != null) __obj.updateDynamic("onRenderSuccess")(js.Any.fromFunction0(onRenderSuccess))
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAnnotationLayer)) __obj.updateDynamic("renderAnnotationLayer")(renderAnnotationLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInteractiveForms)) __obj.updateDynamic("renderInteractiveForms")(renderInteractiveForms.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(renderTextLayer)) __obj.updateDynamic("renderTextLayer")(renderTextLayer.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.reactPdf.pageMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactPdf.pageMod.Props
}

