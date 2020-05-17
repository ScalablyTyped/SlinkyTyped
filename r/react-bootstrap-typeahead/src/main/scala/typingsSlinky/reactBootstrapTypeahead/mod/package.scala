package typingsSlinky.reactBootstrapTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllTypeaheadOwnAndInjectedProps[T /* <: typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel */] = typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  type TypeaheadResult[T /* <: typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel */] = T with typingsSlinky.reactBootstrapTypeahead.anon.CustomOption
}
