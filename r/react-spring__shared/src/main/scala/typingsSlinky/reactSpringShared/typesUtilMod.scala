package typingsSlinky.reactSpringShared

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.allocTypes.mod.Omit
import typingsSlinky.allocTypes.mod.Remap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilMod {
  
  @JSImport("@react-spring/shared/cjs/types.util", "Any")
  @js.native
  class Any ()
    extends typingsSlinky.allocTypes.mod.Any
  
  type Arrify[T] = js.Array[js.Any]
  
  type AssignableKeys[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Extract<keyof T, keyof U> ]: T[P] extends U[P]? P : never}[std.Extract<keyof T, keyof U>] */ js.Any
  
  type Constrain[T, U] = U | T
  
  type Merge[A, B] = Remap[
    typingsSlinky.reactSpringShared.reactSpringSharedStrings.Merge with TopLevel[js.Any] with (Omit[B, /* keyof A */ String])
  ]
}
