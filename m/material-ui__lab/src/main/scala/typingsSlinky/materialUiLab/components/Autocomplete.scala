package typingsSlinky.materialUiLab.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Autocomplete {
  @JSImport("@material-ui/lab/Autocomplete/Autocomplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[T](p: AutocompleteProps[T] with UseAutocompleteProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Autocomplete.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

