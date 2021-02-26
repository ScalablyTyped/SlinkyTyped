package typingsSlinky.formstate

import typingsSlinky.formstate.formStateLazyMod.ValidatableArray
import typingsSlinky.formstate.formStateMod.ValidatableMapOrArray
import typingsSlinky.formstate.typesMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formstate", "FieldState")
  @js.native
  class FieldState[TValue] protected ()
    extends typingsSlinky.formstate.fieldStateMod.FieldState[TValue] {
    def this(_initValue: TValue) = this()
  }
  
  @JSImport("formstate", "FormState")
  @js.native
  class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
    extends typingsSlinky.formstate.formStateMod.FormState[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
  }
  
  @JSImport("formstate", "FormStateLazy")
  @js.native
  class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
    extends typingsSlinky.formstate.formStateLazyMod.FormStateLazy[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
  }
  
  @JSImport("formstate", "applyValidators")
  @js.native
  def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
}
