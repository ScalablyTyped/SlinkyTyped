package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.DistinctQuestion
import typingsSlinky.inquirer.mod.KeyUnion
import typingsSlinky.inquirer.mod.UnionToIntersection
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable_[DistinctQuestion[Answers]] = js.native
  
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}
