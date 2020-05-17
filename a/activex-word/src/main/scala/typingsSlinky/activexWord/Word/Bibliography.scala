package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bibliography extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BibliographyStyle: String = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Sources: typingsSlinky.activexWord.Word.Sources = js.native
  @JSName("Word.Bibliography_typekey")
  var WordDotBibliography_typekey: Bibliography = js.native
  def GenerateUniqueTag(): String = js.native
}

object Bibliography {
  @scala.inline
  def apply(
    Application: Application,
    BibliographyStyle: String,
    Creator: Double,
    GenerateUniqueTag: () => String,
    Parent: js.Any,
    Sources: Sources,
    WordDotBibliography_typekey: Bibliography
  ): Bibliography = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BibliographyStyle = BibliographyStyle.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GenerateUniqueTag = js.Any.fromFunction0(GenerateUniqueTag), Parent = Parent.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bibliography_typekey")(WordDotBibliography_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bibliography]
  }
  @scala.inline
  implicit class BibliographyOps[Self <: Bibliography] (val x: Self) extends AnyVal {
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
    def withBibliographyStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BibliographyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateUniqueTag(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateUniqueTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: Sources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBibliography_typekey(value: Bibliography): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Bibliography_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

