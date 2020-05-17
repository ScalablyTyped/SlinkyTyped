package typingsSlinky.jestJasmine2.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestJasmine2.typesMod.SyncExpectationResult
  - typingsSlinky.jestJasmine2.typesMod.AsyncExpectationResult
*/
trait ExpectationResult extends js.Object

object ExpectationResult {
  @scala.inline
  implicit def apply(value: AsyncExpectationResult): ExpectationResult = value.asInstanceOf[ExpectationResult]
  @scala.inline
  implicit def apply(value: SyncExpectationResult): ExpectationResult = value.asInstanceOf[ExpectationResult]
}

