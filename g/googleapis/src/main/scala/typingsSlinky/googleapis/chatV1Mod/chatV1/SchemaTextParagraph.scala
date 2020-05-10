package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paragraph of text. Formatted text supported.
  */
@js.native
trait SchemaTextParagraph extends js.Object {
  var text: js.UndefOr[String] = js.native
}

object SchemaTextParagraph {
  @scala.inline
  def apply(): SchemaTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextParagraph]
  }
  @scala.inline
  implicit class SchemaTextParagraphOps[Self <: SchemaTextParagraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

