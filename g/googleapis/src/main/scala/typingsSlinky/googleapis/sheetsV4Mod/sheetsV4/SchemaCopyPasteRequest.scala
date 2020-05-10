package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copies data from the source to the destination.
  */
@js.native
trait SchemaCopyPasteRequest extends js.Object {
  /**
    * The location to paste to. If the range covers a span that&#39;s a
    * multiple of the source&#39;s height or width, then the data will be
    * repeated to fill in the destination range. If the range is smaller than
    * the source range, the entire source data will still be copied (beyond the
    * end of the destination range).
    */
  var destination: js.UndefOr[SchemaGridRange] = js.native
  /**
    * How that data should be oriented when pasting.
    */
  var pasteOrientation: js.UndefOr[String] = js.native
  /**
    * What kind of data to paste.
    */
  var pasteType: js.UndefOr[String] = js.native
  /**
    * The source range to copy.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaCopyPasteRequest {
  @scala.inline
  def apply(): SchemaCopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopyPasteRequest]
  }
  @scala.inline
  implicit class SchemaCopyPasteRequestOps[Self <: SchemaCopyPasteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteType")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

