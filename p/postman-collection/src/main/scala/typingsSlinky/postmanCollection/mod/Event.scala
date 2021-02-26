package typingsSlinky.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.EventDefinition because var conflicts: description, disabled, id, name. Inlined listen, script */ @JSImport("postman-collection", "Event")
@js.native
class Event protected () extends Property[EventDefinition] {
  def this(definition: EventDefinition) = this()
  
  var listen: js.UndefOr[String] = js.native
  
  var script: js.Array[String] | Script | ScriptDefinition | String = js.native
  
  def update(definition: EventDefinition): Unit = js.native
}
