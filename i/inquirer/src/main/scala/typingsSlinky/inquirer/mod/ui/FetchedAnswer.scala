package typingsSlinky.inquirer.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a fetched answer.
  */
@js.native
trait FetchedAnswer extends js.Object {
  /**
    * The value of the answer.
    */
  var answer: js.Any = js.native
  /**
    * The name of the answer.
    */
  var name: String = js.native
}

object FetchedAnswer {
  @scala.inline
  def apply(answer: js.Any, name: String): FetchedAnswer = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchedAnswer]
  }
  @scala.inline
  implicit class FetchedAnswerOps[Self <: FetchedAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

