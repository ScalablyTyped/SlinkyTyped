package typingsSlinky.blueprintjsCore.menuMod

import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IMenuProps extends HTMLAttributes[HTMLUListElement] {
  /** Whether the menu items in this menu should use a large appearance. */
  var large: js.UndefOr[Boolean] = js.native
  /** Ref handler that receives the HTML `<ul>` element backing this component. */
  var ulRef: js.UndefOr[js.Function1[/* ref */ HTMLUListElement | Null, _]] = js.native
}

object IMenuProps {
  @scala.inline
  def apply(): IMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuProps]
  }
  @scala.inline
  implicit class IMenuPropsOps[Self <: IMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withUlRef(value: /* ref */ HTMLUListElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUlRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulRef")(js.undefined)
        ret
    }
  }
  
}

