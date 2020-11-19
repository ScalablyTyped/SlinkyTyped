package typingsSlinky.normalizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SchemaValue[T] = typingsSlinky.normalizr.mod.Schema_[T] | typingsSlinky.normalizr.mod.SchemaValueFunction[T]
  
  type SchemaValueFunction[T] = js.Function1[/* t */ T, typingsSlinky.normalizr.mod.Schema_[T]]
}
