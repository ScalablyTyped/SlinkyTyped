package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereClause extends StObject {
  
  /**
    * Executes the where clause against a feature to generate a value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#calculateValue)
    */
  def calculateValue(feature: js.Any): js.Any = js.native
  
  /**
    * An array of the field names used in the where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#fieldNames)
    */
  var fieldNames: js.Array[String] = js.native
  
  /**
    * Returns `true` if the parsed where clause meets the requirements of standardized sql.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#isStandardized)
    */
  val isStandardized: Boolean = js.native
  
  /**
    * Tests the attributes of a feature against the `whereClause`, and returns `true` if the test passes, `false` otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#testFeature)
    */
  def testFeature(feature: js.Any): Boolean = js.native
}
object WhereClause {
  
  @scala.inline
  def apply(
    calculateValue: js.Any => js.Any,
    fieldNames: js.Array[String],
    isStandardized: Boolean,
    testFeature: js.Any => Boolean
  ): WhereClause = {
    val __obj = js.Dynamic.literal(calculateValue = js.Any.fromFunction1(calculateValue), fieldNames = fieldNames.asInstanceOf[js.Any], isStandardized = isStandardized.asInstanceOf[js.Any], testFeature = js.Any.fromFunction1(testFeature))
    __obj.asInstanceOf[WhereClause]
  }
  
  @scala.inline
  implicit class WhereClauseMutableBuilder[Self <: WhereClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateValue(value: js.Any => js.Any): Self = StObject.set(x, "calculateValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value :_*))
    
    @scala.inline
    def setIsStandardized(value: Boolean): Self = StObject.set(x, "isStandardized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFeature(value: js.Any => Boolean): Self = StObject.set(x, "testFeature", js.Any.fromFunction1(value))
  }
}
