package typingsSlinky.breeze.mod

import typingsSlinky.breeze.breeze.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "EntityQuery")
@js.native
class EntityQuery ()
  extends typingsSlinky.breeze.breeze.EntityQuery {
  def this(resourceName: String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}
/* static members */
object EntityQuery {
  
  @JSImport("breeze", "EntityQuery.from")
  @js.native
  def from(resourceName: String): typingsSlinky.breeze.breeze.EntityQuery = js.native
  
  @JSImport("breeze", "EntityQuery.fromEntities")
  @js.native
  def fromEntities(entities: js.Array[Entity]): typingsSlinky.breeze.breeze.EntityQuery = js.native
  @JSImport("breeze", "EntityQuery.fromEntities")
  @js.native
  def fromEntities(entity: Entity): typingsSlinky.breeze.breeze.EntityQuery = js.native
  
  @JSImport("breeze", "EntityQuery.fromEntityKey")
  @js.native
  def fromEntityKey(entityKey: typingsSlinky.breeze.breeze.EntityKey): typingsSlinky.breeze.breeze.EntityQuery = js.native
  
  @JSImport("breeze", "EntityQuery.fromEntityNavigation")
  @js.native
  def fromEntityNavigation(entity: Entity, navigationProperty: typingsSlinky.breeze.breeze.NavigationProperty): typingsSlinky.breeze.breeze.EntityQuery = js.native
}
