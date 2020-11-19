package typingsSlinky.ejWebAll.ej.Rating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Precision extends js.Object
@JSGlobal("ej.Rating.Precision")
@js.native
object Precision extends js.Object {
  
  ///string
  @js.native
  sealed trait Exact extends Precision
  
  ///string
  @js.native
  sealed trait Full extends Precision
  
  ///string
  @js.native
  sealed trait Half extends Precision
}
