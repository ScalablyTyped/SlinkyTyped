package typingsSlinky.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRemove extends js.Object {
  var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.native
}

object OnRemove {
  @scala.inline
  def apply(): OnRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRemove]
  }
  @scala.inline
  implicit class OnRemoveOps[Self <: OnRemove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRemove(value: /* decorationSpec */ StringDictionary[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(null)
        ret
    }
  }
  
}

