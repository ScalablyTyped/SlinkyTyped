package typingsSlinky.officeUiFabricReact.keytipLayerTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipLayerProps extends ClassAttributes[IKeytipLayer] {
  /**
    * Optional callback to access the KeytipLayer component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IKeytipLayer]] = js.native
  /**
    * String to put inside the layer to be used for the aria-describedby for the component with the keytip
    * Should be one of the starting sequences
    */
  var content: String = js.native
  /**
    * List of key sequences that will exit keytips mode
    */
  var keytipExitSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  /**
    * List of key sequences that execute the return functionality in keytips
    * (going back to the previous level of keytips)
    */
  var keytipReturnSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  /**
    * List of key sequences that will start keytips mode
    */
  var keytipStartSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  /**
    * Callback function triggered when keytip mode is entered
    */
  var onEnterKeytipMode: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function triggered when keytip mode is exited.
    * ev is the Mouse or Keyboard Event that triggered the exit, if any.
    */
  var onExitKeytipMode: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[SyntheticKeyboardEvent[HTMLElement] | SyntheticMouseEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * (Optional) Call to provide customized styling.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]] = js.native
}

object IKeytipLayerProps {
  @scala.inline
  def apply(content: String): IKeytipLayerProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerProps]
  }
  @scala.inline
  implicit class IKeytipLayerPropsOps[Self <: IKeytipLayerProps] (val x: Self) extends AnyVal {
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
    def withComponentRefFunction1(value: /* ref */ IKeytipLayer | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IKeytipLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IKeytipLayer]): Self = {
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
    def withKeytipExitSequences(value: js.Array[IKeytipTransitionKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipExitSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipExitSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipExitSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipReturnSequences(value: js.Array[IKeytipTransitionKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipReturnSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipReturnSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipReturnSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipStartSequences(value: js.Array[IKeytipTransitionKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipStartSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipStartSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipStartSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterKeytipMode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterKeytipMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnterKeytipMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterKeytipMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExitKeytipMode(
      value: /* ev */ js.UndefOr[SyntheticKeyboardEvent[HTMLElement] | SyntheticMouseEvent[HTMLElement]] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExitKeytipMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExitKeytipMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExitKeytipMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IKeytipLayerStyleProps => Partial[IKeytipLayerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]): Self = {
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
  }
  
}

