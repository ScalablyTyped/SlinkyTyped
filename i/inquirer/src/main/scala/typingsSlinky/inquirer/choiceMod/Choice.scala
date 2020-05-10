package typingsSlinky.inquirer.choiceMod

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.CheckboxChoiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice for several question-types.
  *
  * @template T
  * The type of the answers.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.inquirer.mod.ChoiceBase because Already inherited
- typingsSlinky.inquirer.mod.ChoiceOptions because Already inherited
- typingsSlinky.inquirer.mod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ @js.native
trait Choice[T /* <: Answers */] extends CheckboxChoiceOptions[T] {
  /**
    * @inheritdoc
    */
  @JSName("disabled")
  var disabled_Choice: Boolean = js.native
  /**
    * The key to press for selecting the choice.
    *
    * @inheritdoc
    */
  var key: js.UndefOr[String] = js.native
  /**
    * @inheritdoc
    */
  @JSName("name")
  var name_Choice: String = js.native
  /**
    * @inheritdoc
    */
  @JSName("short")
  var short_Choice: String = js.native
}

object Choice {
  @scala.inline
  def apply[T](disabled: Boolean, name: String, short: String): Choice[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice[T]]
  }
  @scala.inline
  implicit class ChoiceOps[Self[t] <: Choice[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

