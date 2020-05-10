package typingsSlinky.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondHookProps extends js.Object {
  var beforeRemoveFile: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.native
}

object FilePondHookProps {
  @scala.inline
  def apply(): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondHookProps]
  }
  @scala.inline
  implicit class FilePondHookPropsOps[Self <: FilePondHookProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeRemoveFile(value: /* file */ File => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveFile")(js.undefined)
        ret
    }
  }
  
}

