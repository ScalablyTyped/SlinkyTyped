package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialDataService.FilterGroup")
@js.native
class FilterGroup protected () extends IFilter {
  /**
    * @constructor
    * @requires The Microsoft.Maps.SpatialDataService module.
    * @param filters An array consisting of Filter or FilterGroup objects to combine.
    * @param operator The logical operator for combining the filters together.
    * @param not A boolean is the logical inverse should of the filter should be used.
    */
  def this(filters: js.Array[IFilter], operator: FilterLogicalOperator) = this()
  def this(filters: js.Array[IFilter], operator: FilterLogicalOperator, not: Boolean) = this()
}

