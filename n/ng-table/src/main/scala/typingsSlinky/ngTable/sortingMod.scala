package typingsSlinky.ngTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortingMod {
  
  type ISortingValues = StringDictionary[SortDirection]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ngTable.ngTableStrings.asc
    - typingsSlinky.ngTable.ngTableStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    @scala.inline
    def asc: typingsSlinky.ngTable.ngTableStrings.asc = "asc".asInstanceOf[typingsSlinky.ngTable.ngTableStrings.asc]
    
    @scala.inline
    def desc: typingsSlinky.ngTable.ngTableStrings.desc = "desc".asInstanceOf[typingsSlinky.ngTable.ngTableStrings.desc]
  }
}
