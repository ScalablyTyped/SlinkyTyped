package typingsSlinky.jexl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BinaryOpFunction = js.Function2[/* left */ js.Any, /* right */ js.Any, js.Any]
  
  type TransformFunction = js.Function2[/* value */ js.Any, /* repeated */ js.Any, js.Any]
  
  type UnaryOpFunction = js.Function1[/* right */ js.Any, js.Any]
}
