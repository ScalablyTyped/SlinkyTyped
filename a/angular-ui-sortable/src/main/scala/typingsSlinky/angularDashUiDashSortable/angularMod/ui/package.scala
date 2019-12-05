package typingsSlinky.angularDashUiDashSortable.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  import typingsSlinky.angular.JQuery
  import typingsSlinky.angular.JQueryEventObject
  import typingsSlinky.angular.angularMod.IAugmentedJQuery

  type SortableEvent[T] = js.Function2[/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T], Unit]
  type SortableHelperFunctionOption = js.Function2[/* event */ JQueryEventObject, /* ui */ IAugmentedJQuery, JQuery]
}
