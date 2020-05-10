package typingsSlinky.radium.mod.Radium

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleRootProps
  extends AllHTMLAttributes[StyleRoot]
     with ClassAttributes[StyleRoot] {
  var radiumConfig: js.UndefOr[RadiumConfig] = js.native
}

object StyleRootProps {
  @scala.inline
  def apply(): StyleRootProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleRootProps]
  }
  @scala.inline
  implicit class StyleRootPropsOps[Self <: StyleRootProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadiumConfig(value: RadiumConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiumConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiumConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiumConfig")(js.undefined)
        ret
    }
  }
  
}

