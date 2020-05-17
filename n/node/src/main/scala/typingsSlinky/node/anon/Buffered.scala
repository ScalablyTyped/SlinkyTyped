package typingsSlinky.node.anon

import typingsSlinky.node.perfHooksMod.EntryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffered extends js.Object {
  var buffered: js.UndefOr[Boolean] = js.native
  var entryTypes: js.Array[EntryType] = js.native
}

object Buffered {
  @scala.inline
  def apply(entryTypes: js.Array[EntryType]): Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  @scala.inline
  implicit class BufferedOps[Self <: Buffered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryTypes(value: js.Array[EntryType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(js.undefined)
        ret
    }
  }
  
}

