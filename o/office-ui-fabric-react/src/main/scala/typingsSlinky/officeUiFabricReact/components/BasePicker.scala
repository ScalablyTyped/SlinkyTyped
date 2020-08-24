package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object BasePicker {
  @JSImport("office-ui-fabric-react", "BasePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, /* <: typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps[T] */ P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.BasePicker[T, P]]
  
  def apply[T, /* <: typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps[T] */ P](p: P): Builder[T, P] = new Builder[T, P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T, /* <: typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps[T] */ P](companion: BasePicker.type): Builder[T, P] = new Builder[T, P](js.Array(this.component, js.Dictionary.empty))()
}

