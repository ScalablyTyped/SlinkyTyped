package typingsSlinky.reactPdf.pageMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.pdfjsDist.mod.PDFPageProxy
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactPdf.reactPdfStrings.canvas
import typingsSlinky.reactPdf.reactPdfStrings.none
import typingsSlinky.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Page'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * A function that customizes how a text layer is rendered.
    * Passes itext item and index for item.
    */
  var customTextRenderer: js.UndefOr[js.Function1[/* layer */ TextLayerItemInternal, ReactElement]] = js.native
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines the height of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `height` and `scale` at the same time, the height will be multiplied by a given factor.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Page>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
  /**
    * Defines what the component should display while loading.
    * @default 'Loading page…'
    */
  var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines what the component should display in case of no data.
    * @default 'No page specified.'
    */
  var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Function called in case of an error while loading annotations.
    */
  var onGetAnnotationsError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when annotations are successfully loaded.
    */
  var onGetAnnotationsSuccess: js.UndefOr[js.Function1[/* annotations */ js.Any, Unit]] = js.native
  /**
    * Function called in case of an error while loading text layer items.
    */
  var onGetTextError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when text layer items are successfully loaded.
    */
  var onGetTextSuccess: js.UndefOr[js.Function1[/* items */ js.Array[TextItem], Unit]] = js.native
  /**
    * Function called in case of an error while loading the page.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called, potentially multiple times, as the loading progresses.
    */
  var onLoadProgress: js.UndefOr[js.Function1[/* data */ LoadingProcessData, Unit]] = js.native
  /**
    * Function called when the page is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* page */ PDFPageProxy, Unit]] = js.native
  /**
    * Function called in case of an error while rendering the page.
    */
  var onRenderError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when the page is successfully rendered on the screen.
    */
  var onRenderSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Defines which page from PDF file should be displayed.
    * @default 0
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * Defines which page from PDF file should be displayed.
    * If provided, pageIndex prop will be ignored.
    * @default 1
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * Defines whether annotations (e.g. links) should be rendered.
    * @default true
    */
  var renderAnnotationLayer: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether interactive forms should be rendered.
    * `renderAnnotationLayer` prop must be set to true.
    * @default false
    */
  var renderInteractiveForms: js.UndefOr[Boolean] = js.native
  /**
    * Defines the rendering mode of the page.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.native
  /**
    * Defines whether a text layer should be rendered.
    * @default true
    */
  var renderTextLayer: js.UndefOr[Boolean] = js.native
  /**
    * Defines the rotation of the page in degrees.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    * Defaults to page's default setting, usually 0.
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * Defines the scale in which PDF file should be rendered.
    * @default 1.0
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Defines the width of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `width` and `scale` at the same time, the width will be multiplied by a given factor.
    */
  var width: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTextRenderer(value: /* layer */ TextLayerItemInternal => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTextRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomTextRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTextRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorFunction0(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: String | ReactElement | RenderFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefRefObject(value: ReactRef[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: LegacyRef[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(null)
        ret
    }
    @scala.inline
    def withLoadingReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingFunction0(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoading(value: String | ReactElement | RenderFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDataFunction0(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoData(value: String | ReactElement | RenderFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetAnnotationsError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetAnnotationsError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetAnnotationsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetAnnotationsError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetAnnotationsSuccess(value: /* annotations */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetAnnotationsSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetAnnotationsSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetAnnotationsSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetTextError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetTextError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetTextError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetTextError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGetTextSuccess(value: /* items */ js.Array[TextItem] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetTextSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGetTextSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetTextSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadProgress(value: /* data */ LoadingProcessData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadSuccess(value: /* page */ PDFPageProxy => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRenderSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAnnotationLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAnnotationLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAnnotationLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAnnotationLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderInteractiveForms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInteractiveForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderInteractiveForms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInteractiveForms")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: canvas | svg | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTextLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTextLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTextLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTextLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

