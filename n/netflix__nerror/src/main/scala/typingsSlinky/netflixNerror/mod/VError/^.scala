package typingsSlinky.netflixNerror.mod.VError

import typingsSlinky.netflixNerror.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@netflix/nerror", "VError")
@js.native
object ^ extends js.Object {
  
  var VError: Instantiable = js.native
  
  def cause(err: js.Error): js.Error | Null = js.native
  
  def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  
  def findCauseByName(err: js.Error, name: String): js.Error | Null = js.native
  
  def fullStack(err: js.Error): String = js.native
  
  def hasCauseWithName(err: js.Error, name: String): Boolean = js.native
  
  def info(err: js.Error): Info = js.native
}
