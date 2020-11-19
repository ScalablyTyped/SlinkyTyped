package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formMod {
  
  type TypedForm[T] = slinky.core.ReactComponentClass[
    typingsSlinky.grommet.formMod.FormProps[T] with (typingsSlinky.std.Omit[
      typingsSlinky.react.mod.DetailedHTMLProps[
        typingsSlinky.react.mod.FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
        org.scalajs.dom.raw.HTMLFormElement
      ], 
      typingsSlinky.grommet.grommetStrings.onChange
    ])
  ]
}
