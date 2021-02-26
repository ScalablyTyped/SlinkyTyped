package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  @JSImport("@material-ui/lab/Autocomplete", JSImport.Default)
  @js.native
  def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): ReactElement = js.native
  
  @JSImport("@material-ui/lab/Autocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  @JSImport("@material-ui/lab/Autocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
}
