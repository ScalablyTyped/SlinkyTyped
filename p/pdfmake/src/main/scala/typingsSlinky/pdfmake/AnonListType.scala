package typingsSlinky.pdfmake

import typingsSlinky.pdfmake.interfacesMod.UnorderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListType extends js.Object {
  var listType: js.UndefOr[UnorderedListType] = js.native
}

object AnonListType {
  @scala.inline
  def apply(): AnonListType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonListType]
  }
  @scala.inline
  implicit class AnonListTypeOps[Self <: AnonListType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListType(value: UnorderedListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
  }
  
}

