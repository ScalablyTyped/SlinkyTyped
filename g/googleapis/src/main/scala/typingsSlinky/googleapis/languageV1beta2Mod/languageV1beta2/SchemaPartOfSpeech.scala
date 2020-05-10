package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents part of speech information for a token.
  */
@js.native
trait SchemaPartOfSpeech extends js.Object {
  /**
    * The grammatical aspect.
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * The grammatical case.
    */
  var `case`: js.UndefOr[String] = js.native
  /**
    * The grammatical form.
    */
  var form: js.UndefOr[String] = js.native
  /**
    * The grammatical gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The grammatical mood.
    */
  var mood: js.UndefOr[String] = js.native
  /**
    * The grammatical number.
    */
  var number: js.UndefOr[String] = js.native
  /**
    * The grammatical person.
    */
  var person: js.UndefOr[String] = js.native
  /**
    * The grammatical properness.
    */
  var proper: js.UndefOr[String] = js.native
  /**
    * The grammatical reciprocity.
    */
  var reciprocity: js.UndefOr[String] = js.native
  /**
    * The part of speech tag.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * The grammatical tense.
    */
  var tense: js.UndefOr[String] = js.native
  /**
    * The grammatical voice.
    */
  var voice: js.UndefOr[String] = js.native
}

object SchemaPartOfSpeech {
  @scala.inline
  def apply(): SchemaPartOfSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartOfSpeech]
  }
  @scala.inline
  implicit class SchemaPartOfSpeechOps[Self <: SchemaPartOfSpeech] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withCase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withMood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mood")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPerson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(js.undefined)
        ret
    }
    @scala.inline
    def withProper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proper")(js.undefined)
        ret
    }
    @scala.inline
    def withReciprocity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reciprocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReciprocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reciprocity")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tense")(js.undefined)
        ret
    }
    @scala.inline
    def withVoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(js.undefined)
        ret
    }
  }
  
}

