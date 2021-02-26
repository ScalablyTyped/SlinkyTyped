package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for turn-based match modification metadata.
  */
@js.native
trait SchemaTurnBasedMatchModification extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchModification.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The timestamp at which they modified the match, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.native
  
  /**
    * The ID of the participant that modified the match.
    */
  var participantId: js.UndefOr[String] = js.native
}
object SchemaTurnBasedMatchModification {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchModification]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchModificationMutableBuilder[Self <: SchemaTurnBasedMatchModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setModifiedTimestampMillis(value: String): Self = StObject.set(x, "modifiedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimestampMillisUndefined: Self = StObject.set(x, "modifiedTimestampMillis", js.undefined)
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
  }
}
