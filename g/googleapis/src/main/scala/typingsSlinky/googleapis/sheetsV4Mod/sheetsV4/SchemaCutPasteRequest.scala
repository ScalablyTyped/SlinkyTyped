package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Moves data from the source to the destination.
  */
@js.native
trait SchemaCutPasteRequest extends js.Object {
  /**
    * The top-left coordinate where the data should be pasted.
    */
  var destination: js.UndefOr[SchemaGridCoordinate] = js.native
  /**
    * What kind of data to paste.  All the source data will be cut, regardless
    * of what is pasted.
    */
  var pasteType: js.UndefOr[String] = js.native
  /**
    * The source data to cut.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaCutPasteRequest {
  @scala.inline
  def apply(): SchemaCutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutPasteRequest]
  }
  @scala.inline
  implicit class SchemaCutPasteRequestOps[Self <: SchemaCutPasteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: SchemaGridCoordinate): Self = {
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

