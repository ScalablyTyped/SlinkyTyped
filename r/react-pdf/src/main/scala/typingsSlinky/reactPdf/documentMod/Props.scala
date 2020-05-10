package typingsSlinky.reactPdf.documentMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.pdfjsDist.mod.PDFDocumentProxy
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactPdf.AnonPageNumber
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

@js.native
trait Props extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Document'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines link target for external links rendered in annotations.
    * Defaults to unset, which means that default behavior will be used.
    */
  var externalLinkTarget: js.UndefOr[_self | _blank | _parent | _top] = js.native
  /**
    * Defines what PDF should be displayed.
    * Its value can be an URL,
    * a file (imported using import ... from ... or from file input form element),
    * or an object with parameters
    *  (
    *   url - URL;
    *   data - data, preferably Uint8Array;
    *   range - PDFDataRangeTransport;
    *   httpHeaders - custom request headers, e.g. for authorization
    *   withCredentials - a boolean to indicate whether or not to include cookies in the request (defaults to false)
    *  )
    */
  var file: js.Any = js.native
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Document>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
  /**
    * Defines what the component should display while loading.
    * @default 'Loading PDF…'
    */
  var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines what the component should display in case of no data.
    * @default 'No PDF file specified.'
    */
  var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ AnonPageNumber, Unit]] = js.native
  /**
    * Function called in case of an error while loading a document.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when the document is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ PDFDocumentProxy, Unit]] = js.native
  /**
    * Function called when a password-protected PDF is loaded.
    * Defaults to a function that prompts the user for password.
    */
  var onPassword: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
  /**
    * Function called in case of an error while retrieving document source from `file` prop.
    */
  var onSourceError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Function called when document source is successfully retrieved from `file` prop.
    */
  var onSourceSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An object in which additional parameters to be passed to PDF.js can be defined.
    * For a full list of possible parameters, check PDF.js documentation on DocumentInitParameters.
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Defines the rendering mode of the document.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.native
  /**
    * Defines the rotation of the document in degrees.
    * If provided, will change rotation globally,
    * even for the pages which were given rotate prop of their own.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    */
  var rotate: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(file: js.Any): Props = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
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
    def withExternalLinkTarget(value: _self | _blank | _parent | _top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalLinkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalLinkTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalLinkTarget")(js.undefined)
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
    def withOnItemClick(value: /* hasPageNumber */ AnonPageNumber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
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
    def withOnLoadSuccess(value: /* pdf */ PDFDocumentProxy => Unit): Self = {
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
    def withOnPassword(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSourceError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSourceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSourceSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSourceSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSourceSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
  }
  
}

