package typingsSlinky.materialUiLab

import typingsSlinky.materialUiLab.anon.AnchorEl
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/lab/useAutocomplete", JSImport.Namespace)
@js.native
object useAutocompleteMod extends js.Object {
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def default[T](props: UseAutocompleteProps[T]): AnchorEl[T] = js.native
}

