package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
@js.native
trait FlashInstance extends js.Object {
  var instanceType: js.UndefOr[String] = js.native
  var libraryItem: js.UndefOr[FlashItem] = js.native
}

object FlashInstance {
  @scala.inline
  def apply(): FlashInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlashInstance]
  }
  @scala.inline
  implicit class FlashInstanceOps[Self <: FlashInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryItem(value: FlashItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryItem")(js.undefined)
        ret
    }
  }
  
}

