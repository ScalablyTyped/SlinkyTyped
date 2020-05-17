package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  val ActiveGrammarDictionary: Dictionary = js.native
  val ActiveHyphenationDictionary: Dictionary = js.native
  val ActiveSpellingDictionary: Dictionary = js.native
  val ActiveThesaurusDictionary: Dictionary = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var DefaultWritingStyle: String = js.native
  val ID: WdLanguageID = js.native
  val Name: String = js.native
  val NameLocal: String = js.native
  val Parent: js.Any = js.native
  var SpellingDictionaryType: WdDictionaryType = js.native
  @JSName("Word.Language_typekey")
  var WordDotLanguage_typekey: Language = js.native
  val WritingStyleList: js.Any = js.native
}

object Language {
  @scala.inline
  def apply(
    ActiveGrammarDictionary: Dictionary,
    ActiveHyphenationDictionary: Dictionary,
    ActiveSpellingDictionary: Dictionary,
    ActiveThesaurusDictionary: Dictionary,
    Application: Application,
    Creator: Double,
    DefaultWritingStyle: String,
    ID: WdLanguageID,
    Name: String,
    NameLocal: String,
    Parent: js.Any,
    SpellingDictionaryType: WdDictionaryType,
    WordDotLanguage_typekey: Language,
    WritingStyleList: js.Any
  ): Language = {
    val __obj = js.Dynamic.literal(ActiveGrammarDictionary = ActiveGrammarDictionary.asInstanceOf[js.Any], ActiveHyphenationDictionary = ActiveHyphenationDictionary.asInstanceOf[js.Any], ActiveSpellingDictionary = ActiveSpellingDictionary.asInstanceOf[js.Any], ActiveThesaurusDictionary = ActiveThesaurusDictionary.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DefaultWritingStyle = DefaultWritingStyle.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameLocal = NameLocal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpellingDictionaryType = SpellingDictionaryType.asInstanceOf[js.Any], WritingStyleList = WritingStyleList.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Language_typekey")(WordDotLanguage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveGrammarDictionary(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveGrammarDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveHyphenationDictionary(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveHyphenationDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSpellingDictionary(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveSpellingDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveThesaurusDictionary(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveThesaurusDictionary")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDefaultWritingStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultWritingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: WdLanguageID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellingDictionaryType(value: WdDictionaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpellingDictionaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotLanguage_typekey(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Language_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritingStyleList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WritingStyleList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

