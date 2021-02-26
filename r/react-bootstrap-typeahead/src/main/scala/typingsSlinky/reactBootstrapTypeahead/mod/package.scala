package typingsSlinky.reactBootstrapTypeahead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllTypeaheadOwnAndInjectedProps[T /* <: typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel */] = typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  
  @scala.inline
  def ClearButton: slinky.core.ReactComponentClass[typingsSlinky.reactBootstrapTypeahead.mod.ClearButtonProps] = typingsSlinky.reactBootstrapTypeahead.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ClearButton").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactBootstrapTypeahead.mod.ClearButtonProps]]
  
  @scala.inline
  def Loader: slinky.core.ReactComponentClass[typingsSlinky.reactBootstrapTypeahead.mod.LoaderProps] = typingsSlinky.reactBootstrapTypeahead.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Loader").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactBootstrapTypeahead.mod.LoaderProps]]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ShouldSelect = js.Function2[
    /* shouldSelect */ scala.Boolean, 
    /* e */ slinky.web.SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement], 
    scala.Boolean
  ]
  
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  
  type TypeaheadLabelKey[T /* <: typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel */] = typingsSlinky.reactBootstrapTypeahead.mod.StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  
  type TypeaheadModel = java.lang.String | js.Object
  
  type TypeaheadResult[T /* <: typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel */] = T with typingsSlinky.reactBootstrapTypeahead.anon.CustomOption
}
