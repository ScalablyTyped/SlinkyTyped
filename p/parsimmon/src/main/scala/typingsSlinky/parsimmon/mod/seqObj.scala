package typingsSlinky.parsimmon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "seqObj")
@js.native
object seqObj extends js.Object {
  
  def apply[T, Key /* <: /* keyof T */ String */](
    args: ((js.Tuple2[
      Key, 
      Parser[
        /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
      ]
    ]) | Parser[_])*
  ): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ typingsSlinky.parsimmon.parsimmonStrings.seqObj with TopLevel[T]
  ] = js.native
}
