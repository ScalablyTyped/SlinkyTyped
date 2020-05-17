package typingsSlinky.pdfjsDist.mod

import typingsSlinky.pdfjsDist.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocumentProxy extends js.Object {
  /**
    * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
    **/
  var fingerprint: String = js.native
  /**
    * Total number of pages the PDF contains.
    **/
  var numPages: Double = js.native
  /**
    * TODO: return type of Promise<???>
    * A promise that is resolved when the document's data is loaded.
    **/
  def dataLoaded(): PDFPromise[js.Array[_]] = js.native
  /**
    *
    **/
  def destroy(): Unit = js.native
  /**
    * True if embedded document fonts are in use.  Will be set during rendering of the pages.
    **/
  def embeddedFontsUsed(): Boolean = js.native
  /**
    * A promise that is resolved with Uint8Array that has the raw PDF data.
    **/
  def getData(): PDFPromise[js.typedarray.Uint8Array] = js.native
  /**
    * TODO: return type of Promise<???>
    *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
    **/
  def getDestinations(): PDFPromise[js.Array[_]] = js.native
  /**
    *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
    **/
  def getJavaScript(): PDFPromise[js.Array[String]] = js.native
  /**
    * A promise that is resolved with the info and metadata of the PDF.
    **/
  def getMetadata(): PDFPromise[Info] = js.native
  /**
    *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
    **/
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]] = js.native
  /**
    * @param number The page number to get.  The first page is 1.
    * @return A promise that is resolved with a PDFPageProxy.
    **/
  def getPage(number: Double): PDFPromise[PDFPageProxy] = js.native
  /**
    * Is the PDF encrypted?
    **/
  def isEncrypted(): PDFPromise[Boolean] = js.native
}

object PDFDocumentProxy {
  @scala.inline
  def apply(
    dataLoaded: () => PDFPromise[js.Array[_]],
    destroy: () => Unit,
    embeddedFontsUsed: () => Boolean,
    fingerprint: String,
    getData: () => PDFPromise[js.typedarray.Uint8Array],
    getDestinations: () => PDFPromise[js.Array[_]],
    getJavaScript: () => PDFPromise[js.Array[String]],
    getMetadata: () => PDFPromise[Info],
    getOutline: () => PDFPromise[js.Array[PDFTreeNode]],
    getPage: Double => PDFPromise[PDFPageProxy],
    isEncrypted: () => PDFPromise[Boolean],
    numPages: Double
  ): PDFDocumentProxy = {
    val __obj = js.Dynamic.literal(dataLoaded = js.Any.fromFunction0(dataLoaded), destroy = js.Any.fromFunction0(destroy), embeddedFontsUsed = js.Any.fromFunction0(embeddedFontsUsed), fingerprint = fingerprint.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), getDestinations = js.Any.fromFunction0(getDestinations), getJavaScript = js.Any.fromFunction0(getJavaScript), getMetadata = js.Any.fromFunction0(getMetadata), getOutline = js.Any.fromFunction0(getOutline), getPage = js.Any.fromFunction1(getPage), isEncrypted = js.Any.fromFunction0(isEncrypted), numPages = numPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFDocumentProxy]
  }
  @scala.inline
  implicit class PDFDocumentProxyOps[Self <: PDFDocumentProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLoaded(value: () => PDFPromise[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmbeddedFontsUsed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedFontsUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetData(value: () => PDFPromise[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDestinations(value: () => PDFPromise[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDestinations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJavaScript(value: () => PDFPromise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJavaScript")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: () => PDFPromise[Info]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOutline(value: () => PDFPromise[js.Array[PDFTreeNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPage(value: Double => PDFPromise[PDFPageProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEncrypted(value: () => PDFPromise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

