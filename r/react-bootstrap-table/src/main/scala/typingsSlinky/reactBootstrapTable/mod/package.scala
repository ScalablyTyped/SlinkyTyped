package typingsSlinky.reactBootstrapTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomAttrs = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  
  type EditCheckboxOptionValue = java.lang.String
  
  type EditSelectOptionValue = js.Array[scala.Double | java.lang.String | typingsSlinky.reactBootstrapTable.anon.Value]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactBootstrapTable.mod.TextFilter
    - typingsSlinky.reactBootstrapTable.mod.SelectFilter
    - typingsSlinky.reactBootstrapTable.mod.RegexFilter
    - typingsSlinky.reactBootstrapTable.mod.NumberFilter
    - typingsSlinky.reactBootstrapTable.mod.DateFilter
    - typingsSlinky.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any]
  */
  type Filter = typingsSlinky.reactBootstrapTable.mod._Filter | (typingsSlinky.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any])
  
  type FilterData[CustomFilterValue /* <: js.Object */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactBootstrapTable.mod.FilterValue | CustomFilterValue]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.reactBootstrapTable.mod.DateFilterValue
    - typingsSlinky.reactBootstrapTable.mod.NumberFilterValue
  */
  type FilterValueData = typingsSlinky.reactBootstrapTable.mod._FilterValueData | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double
  
  type SelectFilterOptionsType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]) with (org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double | scala.Boolean])
  
  type SizePerPageList = js.Array[scala.Double | typingsSlinky.reactBootstrapTable.anon.Text]
}
