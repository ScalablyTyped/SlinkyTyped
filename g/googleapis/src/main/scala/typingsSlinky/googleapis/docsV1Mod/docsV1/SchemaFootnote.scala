package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footnote.
  */
@js.native
trait SchemaFootnote extends js.Object {
  /**
    * The contents of the footnote.  The indexes for a footnote&#39;s content
    * begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String] = js.native
}

object SchemaFootnote {
  @scala.inline
  def apply(): SchemaFootnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnote]
  }
  @scala.inline
  implicit class SchemaFootnoteOps[Self <: SchemaFootnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Array[SchemaStructuralElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFootnoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFootnoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footnoteId")(js.undefined)
        ret
    }
  }
  
}

