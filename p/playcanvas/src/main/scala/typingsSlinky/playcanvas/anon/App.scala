package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.Application
import typingsSlinky.playcanvas.pc.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var app: Application = js.native
  
  var entity: Entity = js.native
}
object App {
  
  @scala.inline
  def apply(app: Application, entity: Entity): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
