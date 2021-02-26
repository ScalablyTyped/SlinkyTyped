package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortRepresentation extends StObject {
  
  /** A string representation of the expression subtree rooted at this node. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A mapping of (subquery variable name) -> (subquery node id) for cases where the `description` string of this node references a `SCALAR` subquery contained in the expression subtree
    * rooted at this node. The referenced `SCALAR` subquery may not necessarily be a direct child of this node.
    */
  var subqueries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ShortRepresentation with TopLevel[js.Any]
  ] = js.native
}
object ShortRepresentation {
  
  @scala.inline
  def apply(): ShortRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortRepresentation]
  }
  
  @scala.inline
  implicit class ShortRepresentationMutableBuilder[Self <: ShortRepresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSubqueries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ShortRepresentation with TopLevel[js.Any]
    ): Self = StObject.set(x, "subqueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubqueriesUndefined: Self = StObject.set(x, "subqueries", js.undefined)
  }
}
