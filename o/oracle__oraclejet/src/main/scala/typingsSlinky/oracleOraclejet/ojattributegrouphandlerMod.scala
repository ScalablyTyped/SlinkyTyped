package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojattributegrouphandler", JSImport.Namespace)
@js.native
object ojattributegrouphandlerMod extends js.Object {
  
  @js.native
  class AttributeGroupHandler () extends js.Object {
    def this(matchRules: StringDictionary[js.Any]) = this()
    
    def addMatchRule(category: String, attributeValue: js.Any): Unit = js.native
    
    def getCategoryAssignments(): js.Array[StringDictionary[_]] = js.native
    
    def getValue(category: String): js.Any = js.native
    
    def getValueRamp(): js.Array[_] = js.native
  }
  
  @js.native
  class ColorAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class ShapeAttributeGroupHandler () extends AttributeGroupHandler {
    def this(matchRules: StringDictionary[js.Any]) = this()
  }
}
