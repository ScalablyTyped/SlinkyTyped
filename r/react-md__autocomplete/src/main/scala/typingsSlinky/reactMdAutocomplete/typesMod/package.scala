package typingsSlinky.reactMdAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AutoCompleteData = java.lang.String | typingsSlinky.reactMdForm.utilsMod.ListboxOptionProps
  type AutoCompleteFilterFunction[O /* <: js.Object */] = typingsSlinky.reactMdAutocomplete.typesMod.PreconfiguredFilterFunction | typingsSlinky.reactMdAutocomplete.typesMod.FilterFunction[O]
  type AutoCompleteHandler = js.Function1[
    /* result */ typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteResult, 
    scala.Unit
  ]
  type FilterFunction[O /* <: js.Object */] = js.Function3[
    /* query */ java.lang.String, 
    /* data */ js.Array[typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData], 
    /* options */ typingsSlinky.reactMdAutocomplete.typesMod.FilterFunctionOptions[O], 
    js.Array[typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData]
  ]
  type FilterFunctionOptions[O /* <: js.Object */] = O with typingsSlinky.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions[typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData]
}
