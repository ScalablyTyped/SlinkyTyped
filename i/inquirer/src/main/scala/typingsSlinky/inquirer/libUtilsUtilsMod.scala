package typingsSlinky.inquirer

import typingsSlinky.inquirer.inquirerMod.Answers
import typingsSlinky.inquirer.inquirerMod.DistinctQuestion
import typingsSlinky.inquirer.inquirerMod.KeyUnion
import typingsSlinky.inquirer.inquirerMod.UnionToIntersection
import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
@js.native
object libUtilsUtilsMod extends js.Object {
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable[DistinctQuestion[Answers]] = js.native
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}

