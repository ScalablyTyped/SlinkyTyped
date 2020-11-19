package typingsSlinky.hardRejection

import typingsSlinky.hardRejection.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hard-rejection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	*/
  def apply(): Unit = js.native
  def apply(log: js.Function1[/* stack */ js.UndefOr[String], Unit]): Unit = js.native
  
  /**
  	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hardRejection(log?: (stack?: string) => void): void;
  // export = hardRejection;
  def default(): Unit = js.native
  def default(log: js.Function1[/* stack */ js.UndefOr[String], Unit]): Unit = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hardRejection(log?: (stack?: string) => void): void;
  // export = hardRejection;
  @JSName("default")
  var default_Original: Call = js.native
}
