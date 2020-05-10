package typingsSlinky.officeUiFabricReact.keytipTypesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipProps extends js.Object {
  /**
    * ICalloutProps to pass to the callout element
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Content to put inside the keytip
    */
  var content: String = js.native
  /**
    * T/F if the corresponding control for this keytip is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
    * keytip activation). Common cases are a Pivot or Modal.
    */
  var hasDynamicChildren: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[Boolean] = js.native
  /**
    * Array of KeySequences which is the full key sequence to trigger this keytip
    * Should not include initial 'start' key sequence
    */
  var keySequences: js.Array[String] = js.native
  /**
    * Offset x and y for the keytip, added from the top-left corner
    * By default the keytip will be anchored to the bottom-center of the element
    */
  var offset: js.UndefOr[IPoint] = js.native
  /**
    * Function to call when this keytip is activated.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
    */
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.native
  /**
    * Theme for the component
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * T/F if the keytip is visible
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IKeytipProps {
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): IKeytipProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipProps]
  }
  @scala.inline
  implicit class IKeytipPropsOps[Self <: IKeytipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySequences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDynamicChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDynamicChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReturn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowSetSequence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSetSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowSetSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSetSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IKeytipStyleProps => Partial[IKeytipStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = {
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
    def withTheme(value: ITheme): Self = {
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
    def withVisible(value: Boolean): Self = {
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

