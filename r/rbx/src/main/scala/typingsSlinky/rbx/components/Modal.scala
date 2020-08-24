package typingsSlinky.rbx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.anon.PickModalContainerPropsac
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.exoticMod.FromReactType
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
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.rbx.anon.`6`[TAsComponent] with typingsSlinky.rbx.anon.PickModalContainerPropsac with (typingsSlinky.std.Pick[
typingsSlinky.react.mod.ComponentProps[TAsComponent], 
typingsSlinky.std.Exclude[
  / * keyof react.react.ComponentProps<TAsComponent> * / java.lang.String, 
  typingsSlinky.rbx.rbxStrings.active | typingsSlinky.rbx.rbxStrings.document | typingsSlinky.rbx.rbxStrings.children | typingsSlinky.rbx.rbxStrings.as | typingsSlinky.rbx.rbxStrings.clipped | typingsSlinky.rbx.rbxStrings.closeOnBlur | typingsSlinky.rbx.rbxStrings.closeOnEsc | typingsSlinky.rbx.rbxStrings.onClose | typingsSlinky.rbx.rbxStrings.containerClassName
]]) with (typingsSlinky.react.mod.RefAttributes[TAsComponent | typingsSlinky.rbx.exoticMod.FromReactType[TAsComponent]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Modal {
  @JSImport("rbx", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent](
    p: `6`[TAsComponent] with PickModalContainerPropsac with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent](companion: Modal.type): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, js.Dictionary.empty))()
}

