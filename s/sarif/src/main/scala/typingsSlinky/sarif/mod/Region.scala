package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  /**
    * The length of the region in bytes.
    */
  var byteLength: js.UndefOr[Double] = js.native
  /**
    * The zero-based offset from the beginning of the artifact of the first byte in the region.
    */
  var byteOffset: js.UndefOr[Double] = js.native
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[Double] = js.native
  /**
    * The zero-based offset from the beginning of the artifact of the first character in the region.
    */
  var charOffset: js.UndefOr[Double] = js.native
  /**
    * The column number of the character following the end of the region.
    */
  var endColumn: js.UndefOr[Double] = js.native
  /**
    * The line number of the last character in the region.
    */
  var endLine: js.UndefOr[Double] = js.native
  /**
    * A message relevant to the region.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the region.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The portion of the artifact contents within the specified region.
    */
  var snippet: js.UndefOr[ArtifactContent] = js.native
  /**
    * Specifies the source language, if any, of the portion of the artifact specified by the region object.
    */
  var sourceLanguage: js.UndefOr[String] = js.native
  /**
    * The column number of the first character in the region.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * The line number of the first character in the region.
    */
  var startLine: js.UndefOr[Double] = js.native
}

object Region {
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(js.undefined)
        ret
    }
    @scala.inline
    def withByteOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCharLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCharOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: ArtifactContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(js.undefined)
        ret
    }
  }
  
}

