package typingsSlinky.blueprintjsCore.navbarGroupMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait INavbarGroupProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The side of the navbar on which the group should appear.
    * The `Alignment` enum provides constants for these values.
    * @default Alignment.LEFT
    */
  var align: js.UndefOr[Alignment] = js.native
}

object INavbarGroupProps {
  @scala.inline
  def apply(): INavbarGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavbarGroupProps]
  }
  @scala.inline
  implicit class INavbarGroupPropsOps[Self <: INavbarGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
  }
  
}

