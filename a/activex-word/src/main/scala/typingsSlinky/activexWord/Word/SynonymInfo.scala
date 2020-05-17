package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynonymInfo extends js.Object {
  val AntonymList: js.Any = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Found: Boolean = js.native
  val MeaningCount: Double = js.native
  val MeaningList: js.Any = js.native
  val Parent: js.Any = js.native
  val PartOfSpeechList: js.Any = js.native
  val RelatedExpressionList: js.Any = js.native
  val RelatedWordList: js.Any = js.native
  val Word: String = js.native
  @JSName("Word.SynonymInfo_typekey")
  var WordDotSynonymInfo_typekey: SynonymInfo = js.native
  def SynonymList(Meaning: js.Any): js.Any = js.native
}

object SynonymInfo {
  @scala.inline
  def apply(
    AntonymList: js.Any,
    Application: Application,
    Creator: Double,
    Found: Boolean,
    MeaningCount: Double,
    MeaningList: js.Any,
    Parent: js.Any,
    PartOfSpeechList: js.Any,
    RelatedExpressionList: js.Any,
    RelatedWordList: js.Any,
    SynonymList: js.Any => js.Any,
    Word: String,
    WordDotSynonymInfo_typekey: SynonymInfo
  ): SynonymInfo = {
    val __obj = js.Dynamic.literal(AntonymList = AntonymList.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], MeaningCount = MeaningCount.asInstanceOf[js.Any], MeaningList = MeaningList.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PartOfSpeechList = PartOfSpeechList.asInstanceOf[js.Any], RelatedExpressionList = RelatedExpressionList.asInstanceOf[js.Any], RelatedWordList = RelatedWordList.asInstanceOf[js.Any], SynonymList = js.Any.fromFunction1(SynonymList), Word = Word.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SynonymInfo_typekey")(WordDotSynonymInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynonymInfo]
  }
  @scala.inline
  implicit class SynonymInfoOps[Self <: SynonymInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntonymList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AntonymList")(value.asInstanceOf[js.Any])
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
    def withFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeaningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeaningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeaningList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeaningList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartOfSpeechList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartOfSpeechList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedExpressionList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedExpressionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedWordList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedWordList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynonymList(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SynonymList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSynonymInfo_typekey(value: SynonymInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SynonymInfo_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

