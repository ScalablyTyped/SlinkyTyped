package typingsSlinky.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.mod.ILiteralExpectation
  - typingsSlinky.intlMessageformatParser.mod.IClassExpectation
  - typingsSlinky.intlMessageformatParser.mod.IAnyExpectation
  - typingsSlinky.intlMessageformatParser.mod.IEndExpectation
  - typingsSlinky.intlMessageformatParser.mod.IOtherExpectation
*/
trait Expectation extends js.Object

object Expectation {
  @scala.inline
  implicit def apply(value: IAnyExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IClassExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IEndExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: ILiteralExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IOtherExpectation): Expectation = value.asInstanceOf[Expectation]
}

