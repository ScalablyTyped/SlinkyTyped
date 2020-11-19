package typingsSlinky.fridaGum.global.Java

import typingsSlinky.fridaGum.Java.EnumerateMethodsMatchGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Java.enumerateMethods")
@js.native
object enumerateMethods extends js.Object {
  
  /**
    * Enumerates methods matching `query`.
    *
    * @param query Query specified as `class!method`, with globs permitted. May
    *              also be suffixed with `/` and one or more modifiers:
    *              - `i`: Case-insensitive matching.
    *              - `s`: Include method signatures, so e.g. `"putInt"` becomes
    *                `"putInt(java.lang.String, int): void"`.
    *              - `u`: User-defined classes only, ignoring system classes.
    */
  def apply(query: String): js.Array[EnumerateMethodsMatchGroup] = js.native
}
