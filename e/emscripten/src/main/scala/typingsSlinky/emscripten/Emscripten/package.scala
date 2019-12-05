package typingsSlinky.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Emscripten {
  import typingsSlinky.emscripten.Anon_Kind
  import typingsSlinky.emscripten.Anon_KindModule

  type TypeCompatibleWithC = Double | String | js.Array[js.Any] | Boolean
  type WebAssemblyExports = js.Array[Anon_KindModule]
  type WebAssemblyImports = js.Array[Anon_Kind]
}
