package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "section.toJSON()". */
@js.native
trait SectionData extends js.Object {
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyData] = js.native
}

object SectionData {
  @scala.inline
  def apply(): SectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionData]
  }
  @scala.inline
  implicit class SectionDataOps[Self <: SectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: BodyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

