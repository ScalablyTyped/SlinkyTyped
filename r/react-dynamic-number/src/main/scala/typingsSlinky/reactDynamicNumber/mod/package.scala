package typingsSlinky.reactDynamicNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseInputProps = typingsSlinky.std.Partial[
    typingsSlinky.reactDynamicNumber.mod.Omit[
      typingsSlinky.react.mod.DetailedHTMLProps[
        typingsSlinky.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ], 
      typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.ref | typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.value | typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.onChange | typingsSlinky.reactDynamicNumber.reactDynamicNumberStrings.placeholder
    ]
  ]
  type DynamicNumber = slinky.core.ReactComponentClass[typingsSlinky.reactDynamicNumber.mod.DynamicNumberProps]
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
