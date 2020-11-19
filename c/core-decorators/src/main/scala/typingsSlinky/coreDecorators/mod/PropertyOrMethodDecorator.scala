package typingsSlinky.coreDecorators.mod

import typingsSlinky.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typingsSlinky.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait PropertyOrMethodDecorator extends MethodDecorator {
  
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
}
