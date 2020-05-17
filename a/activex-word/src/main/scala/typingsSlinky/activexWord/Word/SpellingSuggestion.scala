package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpellingSuggestion extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.SpellingSuggestion_typekey")
  var WordDotSpellingSuggestion_typekey: SpellingSuggestion = js.native
}

object SpellingSuggestion {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    WordDotSpellingSuggestion_typekey: SpellingSuggestion
  ): SpellingSuggestion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SpellingSuggestion_typekey")(WordDotSpellingSuggestion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingSuggestion]
  }
  @scala.inline
  implicit class SpellingSuggestionOps[Self <: SpellingSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSpellingSuggestion_typekey(value: SpellingSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SpellingSuggestion_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

