package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipMod {
  
  @JSImport("ol/extent/Relationship", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Relationship with Double] = js.native
    
    /* 2 */ val ABOVE: typingsSlinky.ol.relationshipMod.Relationship.ABOVE with Double = js.native
    
    /* 8 */ val BELOW: typingsSlinky.ol.relationshipMod.Relationship.BELOW with Double = js.native
    
    /* 1 */ val INTERSECTING: typingsSlinky.ol.relationshipMod.Relationship.INTERSECTING with Double = js.native
    
    /* 16 */ val LEFT: typingsSlinky.ol.relationshipMod.Relationship.LEFT with Double = js.native
    
    /* 4 */ val RIGHT: typingsSlinky.ol.relationshipMod.Relationship.RIGHT with Double = js.native
    
    /* 0 */ val UNKNOWN: typingsSlinky.ol.relationshipMod.Relationship.UNKNOWN with Double = js.native
  }
  
  @js.native
  sealed trait Relationship extends StObject
  @JSImport("ol/extent/Relationship", "Relationship")
  @js.native
  object Relationship extends StObject {
    
    @js.native
    sealed trait ABOVE extends Relationship
    
    @js.native
    sealed trait BELOW extends Relationship
    
    @js.native
    sealed trait INTERSECTING extends Relationship
    
    @js.native
    sealed trait LEFT extends Relationship
    
    @js.native
    sealed trait RIGHT extends Relationship
    
    @js.native
    sealed trait UNKNOWN extends Relationship
  }
}
