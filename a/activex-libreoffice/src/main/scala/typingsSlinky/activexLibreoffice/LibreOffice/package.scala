package typingsSlinky.activexLibreoffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object LibreOffice {
  
  type InstantiableNameMap = typingsSlinky.activexLibreoffice.LibreOffice.ServicesNameMap with typingsSlinky.activexLibreoffice.LibreOffice.StructNameMap
  
  type SeqEquiv[T] = typingsSlinky.std.SafeArray[T] | typingsSlinky.activexLibreoffice.sequence[T] | js.Array[T]
}
