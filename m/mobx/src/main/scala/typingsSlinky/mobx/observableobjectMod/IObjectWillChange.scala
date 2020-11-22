package typingsSlinky.mobx.observableobjectMod

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.mobxStrings.remove
import typingsSlinky.mobx.mobxStrings.update
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.anon.NameNewValue[T]
  - typingsSlinky.mobx.anon.ObjectType[T]
*/
trait IObjectWillChange[T] extends js.Object
object IObjectWillChange {
  
  @scala.inline
  def NameNewValue[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: update | add): IObjectWillChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange[T]]
  }
  
  @scala.inline
  def ObjectType[T](name: PropertyKey, `object`: T, `type`: remove): IObjectWillChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange[T]]
  }
}
