package typingsSlinky.reactDashBootstrapDashTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTypeaheadMod {
  import typingsSlinky.react.reactMod.HTMLProps
  import typingsSlinky.react.reactMod.InputHTMLAttributes
  import typingsSlinky.reactDashBootstrapDashTypeahead.Anon_CustomOption
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.align
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.className
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.dropup
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.flip
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.input
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.li
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onBlur
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onChange
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onFocus
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onKeyDown
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuHide
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuShow
  import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.onMenuToggle
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AllTypeaheadOwnAndInjectedProps[T /* <: TypeaheadModel */] = TypeaheadProps[T] with TypeaheadContainerProps[T]
  type HintedInputContext[T /* <: TypeaheadModel */] = Pick[TypeaheadContext[T], HintedInputContextKeys]
  type InputProps = Omit[InputHTMLAttributes[input], onBlur | onChange | onFocus | onKeyDown]
  type MenuHeaderProps = Omit[HTMLProps[li], className]
  type MenuItemContext[T /* <: TypeaheadModel */] = Pick[TypeaheadContext[T], MenuItemContextKeys]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type OverlayTypeaheadProps = Pick[
    TypeaheadProps[js.Any], 
    align | dropup | flip | onMenuHide | onMenuShow | onMenuToggle
  ]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  type TypeaheadInputProps[T /* <: TypeaheadModel */] = Pick[TypeaheadProps[T], TypeaheadInputPropKeys]
  type TypeaheadLabelKey[T /* <: TypeaheadModel */] = StringPropertyNames[T] | (js.Function1[/* option */ T, String])
  type TypeaheadModel = String | js.Object
  type TypeaheadResult[T /* <: TypeaheadModel */] = T with Anon_CustomOption
}
