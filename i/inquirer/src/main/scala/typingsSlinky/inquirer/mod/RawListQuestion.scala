package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `RawListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait RawListQuestion[T /* <: Answers */] extends ListQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_RawListQuestion: rawlist = js.native
}
object RawListQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: rawlist): RawListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawListQuestion[T]]
  }
  
  @scala.inline
  implicit class RawListQuestionOps[Self <: RawListQuestion[_], T /* <: Answers */] (val x: Self with RawListQuestion[T]) extends AnyVal {
    
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
    def setType(value: rawlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
