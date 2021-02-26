package typingsSlinky.camljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Use for:
    1. SPServices CAMLQuery attribute
    2. Creating partial expressions
    3. In conjunction with Any & All clauses
    */
  /* static member */
  @scala.inline
  def Expression(): typingsSlinky.camljs.mod.IFieldExpression = typingsSlinky.camljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Expression")().asInstanceOf[typingsSlinky.camljs.mod.IFieldExpression]
  
  /* static member */
  @scala.inline
  def FromXml(xml: java.lang.String): typingsSlinky.camljs.mod.IRawQuery = typingsSlinky.camljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("FromXml")(xml.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.camljs.mod.IRawQuery]
  
  type IGroupedQuery = typingsSlinky.camljs.mod.ISortable
  
  type ViewField = java.lang.String | typingsSlinky.camljs.mod.Aggregation
}
