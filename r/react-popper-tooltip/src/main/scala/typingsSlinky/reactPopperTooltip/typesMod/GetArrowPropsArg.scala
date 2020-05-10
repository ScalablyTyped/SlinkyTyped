package typingsSlinky.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArrowPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[CSSProperties] = js.native
}

object GetArrowPropsArg {
  @scala.inline
  def apply(): GetArrowPropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetArrowPropsArg]
  }
  @scala.inline
  implicit class GetArrowPropsArgOps[Self <: GetArrowPropsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

