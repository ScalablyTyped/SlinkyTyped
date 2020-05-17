package typingsSlinky.filePathFilter.typesMod

import typingsSlinky.filePathFilter.anon.PartialFiltersFilterCrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.filePathFilter.typesMod.FilterCriteria
  - typingsSlinky.filePathFilter.anon.PartialFiltersFilterCrite
*/
trait AnyFilter extends js.Object

object AnyFilter {
  @scala.inline
  implicit def apply(value: FilterCriteria): AnyFilter = value.asInstanceOf[AnyFilter]
  @scala.inline
  implicit def apply(value: PartialFiltersFilterCrite): AnyFilter = value.asInstanceOf[AnyFilter]
}

