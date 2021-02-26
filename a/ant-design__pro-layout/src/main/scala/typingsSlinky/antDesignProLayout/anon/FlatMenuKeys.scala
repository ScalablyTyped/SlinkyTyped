package typingsSlinky.antDesignProLayout.anon

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatMenuKeys extends StObject {
  
  var flatMenuKeys: js.Array[String] = js.native
  
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]] = js.native
}
object FlatMenuKeys {
  
  @scala.inline
  def apply(flatMenuKeys: js.Array[String], setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit): FlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys))
    __obj.asInstanceOf[FlatMenuKeys]
  }
  
  @scala.inline
  implicit class FlatMenuKeysMutableBuilder[Self <: FlatMenuKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatMenuKeys(value: js.Array[String]): Self = StObject.set(x, "flatMenuKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatMenuKeysVarargs(value: String*): Self = StObject.set(x, "flatMenuKeys", js.Array(value :_*))
    
    @scala.inline
    def setSetFlatMenuKeys(value: SetStateAction[js.Array[String]] => Unit): Self = StObject.set(x, "setFlatMenuKeys", js.Any.fromFunction1(value))
  }
}
