package typingsSlinky.officeUiFabricReact.selectionZoneMod

import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Event_
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionZoneProps extends ClassAttributes[SelectionZone] {
  /**
    * Reference to the component interface.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true, disables automatic selection on input elements.
    */
  var disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.native
  /**
    * If true, modal selection is enabled on touch event.
    */
  var enterModalOnTouch: js.UndefOr[Boolean] = js.native
  /**
    * Determines if an item is selected on focus.
    *
    * @defaultvalue true
    */
  var isSelectedOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated No longer in use, focus is now managed by {@link FocusZone}.
    */
  var layout: js.UndefOr[js.Object] = js.native
  /**
    * Optional callback for when an
    * item's contextual menu action occurs.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit | Boolean
    ]
  ] = js.native
  /**
    * Optional callback for when an item is
    * invoked via ENTER or double-click.
    */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IObjectWithKey], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit
    ]
  ] = js.native
  /**
    * Required {@link ISelection} instance bound to the {@link SelectionZone}.
    */
  var selection: ISelection[IObjectWithKey] = js.native
  /**
    * The mode of Selection, where the value is one of
    * 'none', 'single', or 'multiple'.
    *
    * @defaultvalue {@link SelectionMode.multiple}
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * If true, selection is preserved on outer click.
    */
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.native
}

object ISelectionZoneProps {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): ISelectionZoneProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionZoneProps]
  }
  @scala.inline
  implicit class ISelectionZonePropsOps[Self <: ISelectionZoneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoSelectOnInputElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoSelectOnInputElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoSelectOnInputElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoSelectOnInputElements")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterModalOnTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterModalOnTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterModalOnTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterModalOnTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelectedOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelectedOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemInvoked(
      value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInvoked")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemInvoked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInvoked")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionPreservedOnEmptyClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPreservedOnEmptyClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPreservedOnEmptyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPreservedOnEmptyClick")(js.undefined)
        ret
    }
  }
  
}

