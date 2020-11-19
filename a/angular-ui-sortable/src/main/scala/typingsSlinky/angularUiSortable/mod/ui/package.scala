package typingsSlinky.angularUiSortable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ui {
  
  type SortableEvent[T] = js.Function2[
    /* event */ typingsSlinky.angular.JQueryEventObject, 
    /* ui */ typingsSlinky.angularUiSortable.mod.ui.UISortableUIParams[T], 
    scala.Unit
  ]
  
  type SortableHelperFunctionOption = js.Function2[
    /* event */ typingsSlinky.angular.JQueryEventObject, 
    /* ui */ typingsSlinky.angular.mod.IAugmentedJQuery, 
    typingsSlinky.angular.JQuery
  ]
}
