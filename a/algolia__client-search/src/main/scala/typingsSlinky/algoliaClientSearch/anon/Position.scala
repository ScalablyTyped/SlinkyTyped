package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.ConsequencePromote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends ConsequencePromote {
  
  /**
    * Unique identifier of the object to promote.
    */
  val objectID: String = js.native
  
  /**
    * Promoted rank for the object (zero-based).
    */
  val position: Double = js.native
}
object Position {
  
  @scala.inline
  def apply(objectID: String, position: Double): Position = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
