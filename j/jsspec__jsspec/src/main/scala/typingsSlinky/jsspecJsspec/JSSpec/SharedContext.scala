package typingsSlinky.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedContext extends js.Object {
  
  /**
    * Create a new context with the `title` and defined in `fn`.
    */
  def apply(title: String, fn: ArgFunc): Unit = js.native
  /**
    * Create a new context with the `title` and defined in `fn`.
    * Use `options` to specify settings for running Examples in this context.
    */
  def apply(title: String, options: ContextOptions, fn: ArgFunc): Unit = js.native
}
