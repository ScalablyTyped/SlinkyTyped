package typingsSlinky.blueprintjsCore.navbarMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait INavbarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Whether this navbar should be fixed to the top of the viewport (using CSS `position: fixed`).
    */
  var fixedToTop: js.UndefOr[Boolean] = js.native
}

object INavbarProps {
  @scala.inline
  def apply(): INavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavbarProps]
  }
  @scala.inline
  implicit class INavbarPropsOps[Self <: INavbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedToTop")(js.undefined)
        ret
    }
  }
  
}

