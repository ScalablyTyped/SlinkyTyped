package typingsSlinky.angular.mod

import typingsSlinky.angular.angularStrings.currency
import typingsSlinky.angular.angularStrings.date
import typingsSlinky.angular.angularStrings.filter
import typingsSlinky.angular.angularStrings.json
import typingsSlinky.angular.angularStrings.limitTo
import typingsSlinky.angular.angularStrings.lowercase
import typingsSlinky.angular.angularStrings.number
import typingsSlinky.angular.angularStrings.orderBy
import typingsSlinky.angular.angularStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $filter - $filterProvider - service in module ng
  *
  * Filters are used for formatting data displayed to the user.
  *
  * see https://docs.angularjs.org/api/ng/service/$filter
  */
@js.native
trait IFilterService extends js.Object {
  def apply(name: currency): IFilterCurrency = js.native
  def apply(name: date): IFilterDate = js.native
  def apply(name: filter): IFilterFilter = js.native
  def apply(name: json): IFilterJson = js.native
  def apply(name: limitTo): IFilterLimitTo = js.native
  def apply(name: lowercase): IFilterLowercase = js.native
  def apply(name: number): IFilterNumber = js.native
  def apply(name: orderBy): IFilterOrderBy = js.native
  def apply(name: uppercase): IFilterUppercase = js.native
  /**
    * Usage:
    * $filter(name);
    *
    * @param name Name of the filter function to retrieve
    */
  def apply[T](name: String): T = js.native
}

