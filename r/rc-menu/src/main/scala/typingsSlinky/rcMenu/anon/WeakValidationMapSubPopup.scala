package typingsSlinky.rcMenu.anon

import slinky.core.TagMod
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.LegacyFunctionRef
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.OpenEventHandler
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<rc-menu.rc-menu/lib/SubPopupMenu.SubPopupMenuProps> */
@js.native
trait WeakValidationMapSubPopup extends js.Object {
  var activeKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var builtinPlacements: js.UndefOr[
    Validator[js.UndefOr[typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements | Null]]
  ] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var defaultActiveFirst: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultOpenKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var defaultSelectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.native
  var eventKey: js.UndefOr[Validator[js.UndefOr[typingsSlinky.react.mod.Key | Null]]] = js.native
  var expandIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.native
  var focusable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var forceSubMenuRender: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlineIndent: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var itemIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.native
  var level: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var manualRef: js.UndefOr[Validator[js.UndefOr[LegacyFunctionRef | Null]]] = js.native
  var mode: js.UndefOr[Validator[js.UndefOr[MenuMode | Null]]] = js.native
  var motion: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ _) | Null
      ]
    ]
  ] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MenuClickEventHandler | Null]]] = js.native
  var onDeselect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.native
  var onDestroy: js.UndefOr[Validator[js.UndefOr[DestroyEventHandler | Null]]] = js.native
  var onOpenChange: js.UndefOr[Validator[js.UndefOr[Null | OpenEventHandler]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.native
  var openKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var overflowedIndicator: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.native
  var parentMenu: js.UndefOr[Validator[js.UndefOr[Null | ReactInstance]]] = js.native
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var selectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var store: js.UndefOr[Validator[js.UndefOr[MiniStore | Null]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var subMenuCloseDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var subMenuOpenDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var triggerSubMenuAction: js.UndefOr[Validator[js.UndefOr[Null | TriggerSubMenuAction]]] = js.native
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapSubPopup {
  @scala.inline
  def apply(): WeakValidationMapSubPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSubPopup]
  }
  @scala.inline
  implicit class WeakValidationMapSubPopupOps[Self <: WeakValidationMapSubPopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltinPlacements(value: Validator[js.UndefOr[typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltinPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Validator[js.UndefOr[Null | TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withDefaultActiveFirst(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpenKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKey(value: Validator[js.UndefOr[typingsSlinky.react.mod.Key | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusable(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSubMenuRender(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSubMenuRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSubMenuRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSubMenuRender")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withInlineIndent(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRef(value: Validator[js.UndefOr[LegacyFunctionRef | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Validator[js.UndefOr[MenuMode | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMotion(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ _) | Null
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: Validator[js.UndefOr[MenuClickEventHandler | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeselect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroy(value: Validator[js.UndefOr[DestroyEventHandler | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenChange(value: Validator[js.UndefOr[Null | OpenEventHandler]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowedIndicator(value: Validator[js.UndefOr[Null | TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowedIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowedIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowedIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withParentMenu(value: Validator[js.UndefOr[Null | ReactInstance]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Validator[js.UndefOr[MiniStore | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = {
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
    def withSubMenuCloseDelay(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuOpenDelay(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerSubMenuAction(value: Validator[js.UndefOr[Null | TriggerSubMenuAction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSubMenuAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerSubMenuAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSubMenuAction")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

