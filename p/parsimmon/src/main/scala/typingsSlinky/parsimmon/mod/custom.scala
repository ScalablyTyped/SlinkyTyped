package typingsSlinky.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "custom")
@js.native
object custom extends js.Object {
  
  /**
    * allows to add custom primitive parsers.
    */
  def apply[U](
    parsingFunction: js.Function2[
      /* success */ SuccessFunctionType[U], 
      /* failure */ FailureFunctionType[U], 
      ParseFunctionType[U]
    ]
  ): Parser[U] = js.native
}
