package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageProxy extends js.Object {
  /**
    * Page index of the page.  First page is 0.
    */
  var pageIndex: Double = js.native
  /**
    * Page number of the page.  First page is 1.
    **/
  var pageNumber: Double = js.native
  /**
    * The reference that points to this page.
    **/
  var ref: PDFRef = js.native
  /**
    * The number of degrees the page is rotated clockwise.
    **/
  var rotate: Double = js.native
  /**
    * @return An array of the visible portion of the PDF page in the user space units - [x1, y1, x2, y2].
    **/
  var view: js.Array[Double] = js.native
  /**
    * marked as future feature
    **/
  //getOperationList(): PDFPromise<>;
  /**
    * Destroyes resources allocated by the page.
    **/
  def destroy(): Unit = js.native
  /**
    * A promise that is resolved with an array of the annotation objects.
    **/
  def getAnnotations(): PDFPromise[PDFAnnotations] = js.native
  /**
    * A promise that is resolved with the string that is the text content frm the page.
    **/
  def getTextContent(): PDFPromise[TextContent] = js.native
  /**
    * @param params viewport options
    * @return
    **/
  def getViewport(params: ViewportParameters): PDFPageViewport = js.native
  /**
    * Begins the process of rendering a page to the desired context.
    * @param params Rendering options.
    * @return An extended promise that is resolved when the page finishes rendering.
    **/
  def render(params: PDFRenderParams): PDFRenderTask = js.native
}

object PDFPageProxy {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getAnnotations: () => PDFPromise[PDFAnnotations],
    getTextContent: () => PDFPromise[TextContent],
    getViewport: ViewportParameters => PDFPageViewport,
    pageIndex: Double,
    pageNumber: Double,
    ref: PDFRef,
    render: PDFRenderParams => PDFRenderTask,
    rotate: Double,
    view: js.Array[Double]
  ): PDFPageProxy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAnnotations = js.Any.fromFunction0(getAnnotations), getTextContent = js.Any.fromFunction0(getTextContent), getViewport = js.Any.fromFunction1(getViewport), pageIndex = pageIndex.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), rotate = rotate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPageProxy]
  }
  @scala.inline
  implicit class PDFPageProxyOps[Self <: PDFPageProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnnotations(value: () => PDFPromise[PDFAnnotations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextContent(value: () => PDFPromise[TextContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewport(value: ViewportParameters => PDFPageViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: PDFRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: PDFRenderParams => PDFRenderTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

