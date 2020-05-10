package typingsSlinky.officeUiFabricReact.selectableDroppableTextTypesMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectableDroppableTextProps[TComponent, TListenerElement] extends HTMLAttributes[TListenerElement] {
  /**
    * Aria Label for the ISelectableDroppableText for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Custom properties for ISelectableDroppableText's Callout used to render options.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Optional callback to access the ISelectableDroppableText interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.native
  /**
    * The key(s) that will be initially used to set a selected item.
    */
  var defaultSelectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.native
  /**
    * Whether or not the ISelectableDroppableText is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Descriptive label for the ISelectableDroppableText Error Message
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Descriptive label for the ISelectableDroppableText
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Optional prop that indicates if multi-choice selections are allowed or not.
    * @defaultvalue false
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Callback that is issued when the options callout is dismissed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText container
    */
  var onRenderContainer: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText options
    */
  var onRenderItem: js.UndefOr[IRenderFunction[ISelectableOption]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText list
    */
  var onRenderList: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText option content
    */
  var onRenderOption: js.UndefOr[IRenderFunction[ISelectableOption]] = js.native
  /**
    * Whether or not the ComboBox/Dropdown should expand on keyboard focus.
    * @defaultvalue false
    */
  var openOnKeyboardFocus: js.UndefOr[Boolean] = js.native
  /**
    * Collection of options for this ISelectableDroppableText
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Custom properties for ISelectableDroppableText's Panel used to render options on small devices.
    */
  var panelProps: js.UndefOr[IPanelProps] = js.native
  /**
    * Whether or not the ISelectableDroppableText is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The key(s) of the selected item. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    * Note that passing in `null` will cause selection to be reset.
    */
  var selectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.native
}

object ISelectableDroppableTextProps {
  @scala.inline
  def apply[TComponent, TListenerElement](): ISelectableDroppableTextProps[TComponent, TListenerElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectableDroppableTextProps[TComponent, TListenerElement]]
  }
  @scala.inline
  implicit class ISelectableDroppableTextPropsOps[Self[tcomponent, tlistenerelement] <: ISelectableDroppableTextProps[tcomponent, tlistenerelement], TComponent, TListenerElement] (val x: Self[TComponent, TListenerElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TComponent, TListenerElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TComponent, TListenerElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TComponent, TListenerElement]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TComponent, TListenerElement]) with Other]
    @scala.inline
    def withAriaLabel(value: String): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[TComponent]): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[TComponent]): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedKey(value: String | Double | (js.Array[Double | String])): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKey: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedKeyNull: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(null)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderContainer(
      value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
            ReactElement | Null
          ]
        ]) => ReactElement | Null
    ): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderContainer: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItem(
      value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null
    ): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItem: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderList(
      value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
            ReactElement | Null
          ]
        ]) => ReactElement | Null
    ): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderList: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderList")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderOption(
      value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null
    ): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderOption: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnKeyboardFocus(value: Boolean): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnKeyboardFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnKeyboardFocus: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnKeyboardFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelProps(value: IPanelProps): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelProps: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKey(value: String | Double | (js.Array[Double | String])): Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeyNull: Self[TComponent, TListenerElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(null)
        ret
    }
  }
  
}

