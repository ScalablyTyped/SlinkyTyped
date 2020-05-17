package typingsSlinky.pdfkit.PDFKit

import typingsSlinky.pdfkit.anon.Annots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
@js.native
trait PDFKitReference extends js.Object {
  var chunks: js.Array[_] = js.native
  var compress: Boolean = js.native
  var data: Annots = js.native
  var deflate: js.Any = js.native
  var document: PDFDocument = js.native
  var gen: Double = js.native
  var id: Double = js.native
  var uncompressedLength: Double = js.native
  def end(chunk: js.Any): Unit = js.native
  def initDeflate(): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
}

object PDFKitReference {
  @scala.inline
  def apply(
    chunks: js.Array[_],
    compress: Boolean,
    data: Annots,
    deflate: js.Any,
    document: PDFDocument,
    end: js.Any => Unit,
    gen: Double,
    id: Double,
    initDeflate: () => Unit,
    uncompressedLength: Double,
    write: js.Any => Unit
  ): PDFKitReference = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deflate = deflate.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), gen = gen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initDeflate = js.Any.fromFunction0(initDeflate), uncompressedLength = uncompressedLength.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PDFKitReference]
  }
  @scala.inline
  implicit class PDFKitReferenceOps[Self <: PDFKitReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Annots): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeflate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: PDFDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitDeflate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDeflate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUncompressedLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

