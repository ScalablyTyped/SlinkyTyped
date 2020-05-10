package typingsSlinky.officeUiFabricReact.overflowSetTypesMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.overflowSetBaseMod.OverflowSetBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSetProps extends ClassAttributes[OverflowSetBase] {
  /**
    * Class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverflowSet]] = js.native
  /**
    * If true do not contain the OverflowSet inside of a FocusZone,
    * otherwise the OverflowSet will contain a FocusZone.
    * If this is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  /**
    * Custom properties for OverflowSet's FocusZone.
    * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * Function that will take in an IOverflowSetItemProps and return the subMenu for that item.
    * If not provided, will use 'item.subMenuProps.items' by default.
    * This is only used if your overflow set has keytips.
    */
  var itemSubMenuProvider: js.UndefOr[js.Function1[/* item */ IOverflowSetItemProps, js.UndefOr[js.Array[_]]]] = js.native
  /**
    * An array of items to be rendered by your onRenderItem function in the primary content area
    */
  var items: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.native
  /**
    * Optional full keytip sequence for the overflow button, if it will have a keytip.
    */
  var keytipSequences: js.UndefOr[js.Array[String]] = js.native
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  var onRenderOverflowButton: IRenderFunction[js.Array[_]] = js.native
  /**
    * An array of items to be passed to overflow contextual menu
    */
  var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.native
  /**
    * Controls wether or not the overflow button is placed at the start or end of the items.
    * This gives a reveresed visual behavior but maintains correct keyboard navigation.
    * @defaultValue 'end'
    */
  var overflowSide: js.UndefOr[start | end] = js.native
  /**
    * The role for the OverflowSet.
    * @defaultvalue 'group'
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]] = js.native
  /**
    * Change item layout direction to vertical/stacked.
    * If role is set to `menubar`, `vertical={true}` will also add proper `aria-orientation`.
    * @defaultvalue false
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Method to call when trying to render an item.
    */
  def onRenderItem(item: IOverflowSetItemProps): js.Any = js.native
}

object IOverflowSetProps {
  @scala.inline
  def apply(
    onRenderItem: IOverflowSetItemProps => js.Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], ReactElement | Null]]) => ReactElement | Null
  ): IOverflowSetProps = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    __obj.asInstanceOf[IOverflowSetProps]
  }
  @scala.inline
  implicit class IOverflowSetPropsOps[Self <: IOverflowSetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRenderItem(value: IOverflowSetItemProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRenderOverflowButton(
      value: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOverflowButton")(js.Any.fromFunction2(value))
        ret
    }
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
    def withComponentRefFunction1(value: /* ref */ IOverflowSet | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IOverflowSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IOverflowSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotContainWithinFocusZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotContainWithinFocusZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusZoneProps(value: IFocusZoneProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusZoneProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSubMenuProvider(value: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSubMenuProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemSubMenuProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSubMenuProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IOverflowSetItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipSequences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowItems(value: js.Array[IOverflowSetItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowSide(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSide")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
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
    def withStylesFunction1(value: IOverflowSetProps => Partial[IOverflowSetStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

