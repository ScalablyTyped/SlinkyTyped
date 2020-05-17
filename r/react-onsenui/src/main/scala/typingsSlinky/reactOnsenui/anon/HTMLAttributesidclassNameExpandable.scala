package typingsSlinky.reactOnsenui.anon

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   tappable ? :boolean,   tapBackgroundColor ? :string,   lockOnDrag ? :boolean,   expandable ? :boolean,   expanded ? :boolean,   onClick ? :react.react.MouseEventHandler<any>} */
@js.native
trait HTMLAttributesidclassNameExpandable extends js.Object {
  var className: js.UndefOr[String] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var lockOnDrag: js.UndefOr[Boolean] = js.native
  var modifier: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tapBackgroundColor: js.UndefOr[String] = js.native
  var tappable: js.UndefOr[Boolean] = js.native
}

object HTMLAttributesidclassNameExpandable {
  @scala.inline
  def apply(): HTMLAttributesidclassNameExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameExpandable]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameExpandableOps[Self <: HTMLAttributesidclassNameExpandable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLockOnDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
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
    @scala.inline
    def withTapBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTappable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTappable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappable")(js.undefined)
        ret
    }
  }
  
}

