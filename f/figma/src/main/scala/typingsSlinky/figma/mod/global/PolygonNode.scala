package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.POLYGON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  
  var pointCount: Double = js.native
  
  val `type`: POLYGON = js.native
}
