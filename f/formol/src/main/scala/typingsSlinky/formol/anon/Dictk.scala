package typingsSlinky.formol.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  var no: TagMod[Any] = js.native
  var yes: TagMod[Any] = js.native
}

object Dictk {
  @scala.inline
  def apply(): Dictk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictk]
  }
  @scala.inline
  implicit class DictkOps[Self <: Dictk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNo(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(js.undefined)
        ret
    }
    @scala.inline
    def withYes(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(js.undefined)
        ret
    }
  }
  
}

