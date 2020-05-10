package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReadingPosition extends js.Object {
  /**
    * Position in an EPUB as a CFI.
    */
  var epubCfiPosition: js.UndefOr[String] = js.native
  /**
    * Position in a volume for image-based content.
    */
  var gbImagePosition: js.UndefOr[String] = js.native
  /**
    * Position in a volume for text-based content.
    */
  var gbTextPosition: js.UndefOr[String] = js.native
  /**
    * Resource type for a reading position.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Position in a PDF file.
    */
  var pdfPosition: js.UndefOr[String] = js.native
  /**
    * Timestamp when this reading position was last updated (formatted UTC
    * timestamp with millisecond resolution).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Volume id associated with this reading position.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaReadingPosition {
  @scala.inline
  def apply(): SchemaReadingPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadingPosition]
  }
  @scala.inline
  implicit class SchemaReadingPositionOps[Self <: SchemaReadingPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpubCfiPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epubCfiPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpubCfiPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epubCfiPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGbImagePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImagePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbImagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbImagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGbTextPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbTextPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
  }
  
}

