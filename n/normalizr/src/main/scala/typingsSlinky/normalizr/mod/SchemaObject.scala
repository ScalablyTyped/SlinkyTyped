package typingsSlinky.normalizr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaObject[T]
  extends /* key */ StringDictionary[SchemaValue[T]]
     with Schema_[T]
object SchemaObject {
  
  @scala.inline
  def apply[T](): SchemaObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject[T]]
  }
}
