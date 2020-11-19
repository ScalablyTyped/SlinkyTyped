package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait InputQuestion[T /* <: Answers */] extends InputQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_InputQuestion: js.UndefOr[input] = js.native
}
object InputQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): InputQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestion[T]]
  }
  
  @scala.inline
  implicit class InputQuestionOps[Self <: InputQuestion[_], T /* <: Answers */] (val x: Self with InputQuestion[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: input): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
