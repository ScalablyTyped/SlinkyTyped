package typingsSlinky.jsdevtoolsFilePathFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnyFilter = typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriteria | typingsSlinky.jsdevtoolsFilePathFilter.anon.PartialFiltersFilterCrite
  
  type FilterCriteria = typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion | js.Array[typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion]
  
  type FilterCriterion = scala.Boolean | java.lang.String | js.RegExp | typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
  
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type MapFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
}
