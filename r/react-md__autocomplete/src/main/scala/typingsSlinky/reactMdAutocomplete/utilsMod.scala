package typingsSlinky.reactMdAutocomplete

import slinky.core.facade.ReactElement
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typingsSlinky.reactMdAutocomplete.typesMod.FilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/autocomplete/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val noFilter: FilterFunction[js.Object] = js.native
  def getFilterFunction[O /* <: js.Object */](filter: AutoCompleteFilterFunction[O]): FilterFunction[O] = js.native
  def getResultId(id: String, index: Double): String = js.native
  def getResultLabel(datum: AutoCompleteData, labelKey: String, _query: String): ReactElement = js.native
  def getResultValue(datum: AutoCompleteData, valueKey: String): String = js.native
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
}

