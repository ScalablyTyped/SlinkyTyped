package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BOOLEAN_OPERATION
import typingsSlinky.figma.figmaStrings.EXCLUDE
import typingsSlinky.figma.figmaStrings.INTERSECT
import typingsSlinky.figma.figmaStrings.SUBTRACT
import typingsSlinky.figma.figmaStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanOperationNode
  extends DefaultShapeMixin
     with ChildrenMixin
     with CornerMixin
     with SceneNode {
  
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  
  var expanded: Boolean = js.native
  
  val `type`: BOOLEAN_OPERATION = js.native
}
