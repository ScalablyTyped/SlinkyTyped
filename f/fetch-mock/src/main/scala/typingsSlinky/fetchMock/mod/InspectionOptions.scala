package typingsSlinky.fetchMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Either an object compatible with the mocking api or a string specifying
  * a http method to filter by. This will be used to filter the list of
  * calls further.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fetchMock.mod.MockOptions
  - java.lang.String
*/
trait InspectionOptions extends js.Object

object InspectionOptions {
  @scala.inline
  implicit def apply(value: MockOptions): InspectionOptions = value.asInstanceOf[InspectionOptions]
  @scala.inline
  implicit def apply(value: String): InspectionOptions = value.asInstanceOf[InspectionOptions]
}

