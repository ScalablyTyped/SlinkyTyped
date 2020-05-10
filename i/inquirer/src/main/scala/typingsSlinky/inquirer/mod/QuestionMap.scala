package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the available question-types.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait QuestionMap[T /* <: Answers */] extends js.Object {
  /**
    * The `CheckboxQuestion` type.
    */
  var checkbox: CheckboxQuestion[T] = js.native
  /**
    * The `ConfirmQuestion` type.
    */
  var confirm: ConfirmQuestion[T] = js.native
  /**
    * The `EditorQuestion` type.
    */
  var editor: EditorQuestion[T] = js.native
  /**
    * The `ExpandQuestion` type.
    */
  var expand: ExpandQuestion[T] = js.native
  /**
    * The `InputQuestion` type.
    */
  var input: InputQuestion[T] = js.native
  /**
    * The `ListQuestion` type.
    */
  var list: ListQuestion[T] = js.native
  /**
    * The `NumberQuestion` type.
    */
  var number: NumberQuestion[T] = js.native
  /**
    * The `PasswordQuestion` type.
    */
  var password: PasswordQuestion[T] = js.native
  /**
    * The `RawListQuestion` type.
    */
  var rawList: RawListQuestion[T] = js.native
}

object QuestionMap {
  @scala.inline
  def apply[T](
    checkbox: CheckboxQuestion[T],
    confirm: ConfirmQuestion[T],
    editor: EditorQuestion[T],
    expand: ExpandQuestion[T],
    input: InputQuestion[T],
    list: ListQuestion[T],
    number: NumberQuestion[T],
    password: PasswordQuestion[T],
    rawList: RawListQuestion[T]
  ): QuestionMap[T] = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], rawList = rawList.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionMap[T]]
  }
  @scala.inline
  implicit class QuestionMapOps[Self[t] <: QuestionMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCheckbox(value: CheckboxQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirm(value: ConfirmQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: EditorQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: ExpandQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: InputQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ListQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: NumberQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: PasswordQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawList(value: RawListQuestion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

