package typingsSlinky.inquirer.separatorMod

import typingsSlinky.inquirer.inquirerStrings.separator
import typingsSlinky.inquirer.mod.ChoiceBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item separator.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.inquirer.mod.SeparatorOptions because var conflicts: `type`. Inlined line */ @js.native
trait Separator extends ChoiceBase {
  /**
    * @inheritdoc
    */
  var line: js.UndefOr[String] = js.native
  /**
    * @inheritdoc
    */
  @JSName("type")
  val type_Separator: separator = js.native
}

object Separator {
  @scala.inline
  def apply(`type`: separator): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
  @scala.inline
  implicit class SeparatorOps[Self <: Separator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: separator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
  }
  
}

