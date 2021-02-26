package typingsSlinky.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyableQuery[T] extends StObject {
  
  def keys(): KeysQuery[T] = js.native
}
object KeyableQuery {
  
  @scala.inline
  def apply[T](keys: () => KeysQuery[T]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = js.Any.fromFunction0(keys))
    __obj.asInstanceOf[KeyableQuery[T]]
  }
  
  @scala.inline
  implicit class KeyableQueryMutableBuilder[Self <: KeyableQuery[_], T] (val x: Self with KeyableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setKeys(value: () => KeysQuery[T]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
  }
}
