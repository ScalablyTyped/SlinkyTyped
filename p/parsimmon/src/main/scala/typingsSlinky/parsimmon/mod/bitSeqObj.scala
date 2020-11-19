package typingsSlinky.parsimmon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "bitSeqObj")
@js.native
object bitSeqObj extends js.Object {
  
  /**
    * Works like Parsimmon.bitSeq except each item in the array is either a number of
    * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
    * and put into an object based on the name supplied. If there's no name for the bits,
    * it will be parsed but discarded from the returned value.
    */
  def apply[Key /* <: String */](namedAlignments: js.Array[(js.Tuple2[Key, Double]) | Double]): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ typingsSlinky.parsimmon.parsimmonStrings.bitSeqObj with TopLevel[js.Any]
  ] = js.native
}
