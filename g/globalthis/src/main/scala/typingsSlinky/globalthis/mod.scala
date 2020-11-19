package typingsSlinky.globalthis

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("globalthis", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): js.Any = js.native
  
  /**
    * Gets the `globalThis` object.
    */
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
  
  /**
    * The `globalThis` object.
    */
  val implementation: /* globalThis */ js.Any = js.native
  
  /**
    * Installs the `globalThis` property onto the global object.
    */
  def shim(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
    ]
  ] = js.native
}
