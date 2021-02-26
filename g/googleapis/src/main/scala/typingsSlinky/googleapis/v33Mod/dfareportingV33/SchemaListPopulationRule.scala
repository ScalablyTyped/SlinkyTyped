package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing List Population Rule.
  */
@js.native
trait SchemaListPopulationRule extends StObject {
  
  /**
    * Floodlight activity ID associated with this rule. This field can be left
    * blank.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /**
    * Name of floodlight activity associated with this rule. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityName: js.UndefOr[String] = js.native
  
  /**
    * Clauses that make up this list population rule. Clauses are joined by
    * ANDs, and the clauses themselves are made up of list population terms
    * which are joined by ORs.
    */
  var listPopulationClauses: js.UndefOr[js.Array[SchemaListPopulationClause]] = js.native
}
object SchemaListPopulationRule {
  
  @scala.inline
  def apply(): SchemaListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationRule]
  }
  
  @scala.inline
  implicit class SchemaListPopulationRuleMutableBuilder[Self <: SchemaListPopulationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightActivityName(value: String): Self = StObject.set(x, "floodlightActivityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityNameUndefined: Self = StObject.set(x, "floodlightActivityName", js.undefined)
    
    @scala.inline
    def setListPopulationClauses(value: js.Array[SchemaListPopulationClause]): Self = StObject.set(x, "listPopulationClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPopulationClausesUndefined: Self = StObject.set(x, "listPopulationClauses", js.undefined)
    
    @scala.inline
    def setListPopulationClausesVarargs(value: SchemaListPopulationClause*): Self = StObject.set(x, "listPopulationClauses", js.Array(value :_*))
  }
}
