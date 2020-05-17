package typingsSlinky.reactNative.anon

import typingsSlinky.reactNative.mod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Section[ItemT] extends js.Object {
  var section: SectionListData[ItemT] = js.native
}

object Section {
  @scala.inline
  def apply[ItemT](section: SectionListData[ItemT]): Section[ItemT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section[ItemT]]
  }
  @scala.inline
  implicit class SectionOps[Self[itemt] <: Section[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withSection(value: SectionListData[ItemT]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

