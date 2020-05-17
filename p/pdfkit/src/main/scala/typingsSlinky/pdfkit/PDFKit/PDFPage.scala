package typingsSlinky.pdfkit.PDFKit

import typingsSlinky.pdfkit.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a single page in the PDF document
  */
@js.native
trait PDFPage extends js.Object {
  var annotations: js.Any = js.native
  var content: PDFKitReference = js.native
  /**
    * The page dictionnary
    */
  var dictionary: PDFKitReference = js.native
  var document: PDFDocument = js.native
  var ext_gstates: js.Any = js.native
  var fonts: js.Any = js.native
  var height: Double = js.native
  var layout: String = js.native
  var margins: Bottom = js.native
  var patterns: js.Any = js.native
  var size: String = js.native
  var width: Double = js.native
  var xobjects: js.Any = js.native
  def end(): Unit = js.native
  def maxY(): Double = js.native
  def write(chunk: js.Any): Unit = js.native
}

object PDFPage {
  @scala.inline
  def apply(
    annotations: js.Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: () => Unit,
    ext_gstates: js.Any,
    fonts: js.Any,
    height: Double,
    layout: String,
    margins: Bottom,
    maxY: () => Double,
    patterns: js.Any,
    size: String,
    width: Double,
    write: js.Any => Unit,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = js.Any.fromFunction0(maxY), patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xobjects = xobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPage]
  }
  @scala.inline
  implicit class PDFPageOps[Self <: PDFPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: PDFKitReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionary(value: PDFKitReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: PDFDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExt_gstates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_gstates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargins(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPatterns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXobjects(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xobjects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

