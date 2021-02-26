package typingsSlinky.ngTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupingFuncMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ngTable.ngTableStrings._empty
    - typingsSlinky.ngTable.ngTableStrings.asc
    - typingsSlinky.ngTable.ngTableStrings.desc
  */
  trait GroupSort extends StObject
  object GroupSort {
    
    @scala.inline
    def _empty: typingsSlinky.ngTable.ngTableStrings._empty = "".asInstanceOf[typingsSlinky.ngTable.ngTableStrings._empty]
    
    @scala.inline
    def asc: typingsSlinky.ngTable.ngTableStrings.asc = "asc".asInstanceOf[typingsSlinky.ngTable.ngTableStrings.asc]
    
    @scala.inline
    def desc: typingsSlinky.ngTable.ngTableStrings.desc = "desc".asInstanceOf[typingsSlinky.ngTable.ngTableStrings.desc]
  }
  
  type Grouping[T] = IGroupValues | IGroupingFunc[T]
  
  type IGroupValues = StringDictionary[GroupSort]
  
  @js.native
  trait IGroupingFunc[T] extends StObject {
    
    def apply(item: T): String = js.native
    
    /**
      * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
      */
    var sortDirection: js.UndefOr[GroupSort] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
}
