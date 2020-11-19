package typingsSlinky.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Emscripten {
  
  type TypeCompatibleWithC = scala.Double | java.lang.String | js.Array[js.Any] | scala.Boolean
  
  type WebAssemblyExports = js.Array[typingsSlinky.emscripten.anon.Module]
  
  type WebAssemblyImports = js.Array[typingsSlinky.emscripten.anon.Kind]
}
