package typingsSlinky.atAntDashDesignProDashLayout.libTopNavHeaderMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libMenuMod.MenuProps
import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutNumbers.`false`
import typingsSlinky.atAntDashDesignProDashLayout.libSiderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopNavHeaderProps extends SiderMenuProps {
  var onCollapse: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, TagMod[Any]]]] = js.undefined
}

object TopNavHeaderProps {
  @scala.inline
  def apply(
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    logo: TagMod[Any] = null,
    menuHeaderRender: WithFalse[js.Function2[/* logo */ TagMod[Any], /* title */ TagMod[Any], TagMod[Any]]] = null,
    menuProps: MenuProps = null,
    onCollapse: /* collapse */ Boolean => Unit = null,
    onMenuHeaderClick: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    rightContentRender: WithFalse[js.Function1[TopNavHeaderProps, TagMod[Any]]] = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null
  ): TopNavHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopNavHeaderProps]
  }
}

