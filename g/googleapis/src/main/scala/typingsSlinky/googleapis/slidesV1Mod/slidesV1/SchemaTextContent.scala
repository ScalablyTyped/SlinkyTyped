package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The general text content. The text must reside in a compatible shape (e.g.
  * text box or rectangle) or a table cell in a page.
  */
@js.native
trait SchemaTextContent extends js.Object {
  /**
    * The bulleted lists contained in this text, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList]] = js.native
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[SchemaTextElement]] = js.native
}

object SchemaTextContent {
  @scala.inline
  def apply(): SchemaTextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextContent]
  }
  @scala.inline
  implicit class SchemaTextContentOps[Self <: SchemaTextContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLists(value: StringDictionary[SchemaList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withTextElements(value: js.Array[SchemaTextElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElements")(js.undefined)
        ret
    }
  }
  
}

