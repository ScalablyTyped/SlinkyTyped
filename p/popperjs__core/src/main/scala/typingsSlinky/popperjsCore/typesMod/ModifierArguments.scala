package typingsSlinky.popperjsCore.typesMod

import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierArguments[Options /* <: Obj */] extends StObject {
  
  var instance: Instance = js.native
  
  var name: String = js.native
  
  var options: Partial[Options] = js.native
  
  var state: State = js.native
}
object ModifierArguments {
  
  @scala.inline
  def apply[Options /* <: Obj */](instance: Instance, name: String, options: Partial[Options], state: State): ModifierArguments[Options] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierArguments[Options]]
  }
  
  @scala.inline
  implicit class ModifierArgumentsMutableBuilder[Self <: ModifierArguments[_], Options /* <: Obj */] (val x: Self with ModifierArguments[Options]) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Partial[Options]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
