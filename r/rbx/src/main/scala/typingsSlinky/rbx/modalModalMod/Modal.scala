package typingsSlinky.rbx.modalModalMod

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.Active
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElBody
import typingsSlinky.rbx.anon.PickModalContainerPropsac
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.TypeofModalContainer
import typingsSlinky.rbx.anon.TypeofModalPortal
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.modalBackgroundMod.ModalBackgroundProps
import typingsSlinky.rbx.modalCloseMod.ModalCloseProps
import typingsSlinky.rbx.modalContextMod.ModalContextValue
import typingsSlinky.rbx.rbxStrings.active
import typingsSlinky.rbx.rbxStrings.as
import typingsSlinky.rbx.rbxStrings.children
import typingsSlinky.rbx.rbxStrings.clipped
import typingsSlinky.rbx.rbxStrings.closeOnBlur
import typingsSlinky.rbx.rbxStrings.closeOnEsc
import typingsSlinky.rbx.rbxStrings.containerClassName
import typingsSlinky.rbx.rbxStrings.document
import typingsSlinky.rbx.rbxStrings.onClose
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/components/modal/modal", "Modal")
@js.native
object Modal extends js.Object {
  var Background: ForwardRefAsExoticComponent[ModalBackgroundProps, ReactElement] = js.native
  var Card: NoneTAsComponentextendsElBody = js.native
  var Close: ForwardRefAsExoticComponent[ModalCloseProps, ReactElement] = js.native
  var Container: TypeofModalContainer = js.native
  var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
  var Context: typingsSlinky.react.mod.Context[ModalContextValue] = js.native
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var Portal: TypeofModalPortal = js.native
  var defaultProps: AsElementType with (Partial[PickModalContainerPropsac with (Pick[_, String | Double | js.Symbol])]) = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: Active = js.native
  def apply[TAsComponent /* <: ReactElement */](
    props: `6`[TAsComponent] with PickModalContainerPropsac with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): ReactElement | Null = js.native
}

