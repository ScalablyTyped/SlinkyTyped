package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTextRequest extends js.Object {
  
  /** Inserts the text at the end of a header, footer, footnote or the document body. */
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.native
  
  /**
    * Inserts the text at a specific index in the document. Text must be inserted inside the bounds of an existing Paragraph. For instance, text cannot be inserted at a table's start
    * index (i.e. between the table and its preceding paragraph). The text must be inserted in the preceding paragraph.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The text to be inserted. Inserting a newline character will implicitly create a new Paragraph at that index. The paragraph style of the new paragraph will be copied from the
    * paragraph at the current insertion index, including lists and bullets. Text styles for inserted text will be determined automatically, generally preserving the styling of
    * neighboring text. In most cases, the text style for the inserted text will match the text immediately before the insertion index. Some control characters (U+0000-U+0008,
    * U+000C-U+001F) and characters from the Unicode Basic Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out of the inserted text.
    */
  var text: js.UndefOr[String] = js.native
}
object InsertTextRequest {
  
  @scala.inline
  def apply(): InsertTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTextRequest]
  }
  
  @scala.inline
  implicit class InsertTextRequestOps[Self <: InsertTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = this.set("endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfSegmentLocation: Self = this.set("endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
