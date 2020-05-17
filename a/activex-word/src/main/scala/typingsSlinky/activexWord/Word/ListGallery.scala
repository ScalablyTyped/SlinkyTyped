package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGallery extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val ListTemplates: typingsSlinky.activexWord.Word.ListTemplates = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListGallery_typekey")
  var WordDotListGallery_typekey: ListGallery = js.native
  def Modified(Index: Double): Boolean = js.native
  def Reset(Index: Double): Unit = js.native
}

object ListGallery {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    ListTemplates: ListTemplates,
    Modified: Double => Boolean,
    Parent: js.Any,
    Reset: Double => Unit,
    WordDotListGallery_typekey: ListGallery
  ): ListGallery = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ListTemplates = ListTemplates.asInstanceOf[js.Any], Modified = js.Any.fromFunction1(Modified), Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction1(Reset))
    __obj.updateDynamic("Word.ListGallery_typekey")(WordDotListGallery_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGallery]
  }
  @scala.inline
  implicit class ListGalleryOps[Self <: ListGallery] (val x: Self) extends AnyVal {
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
    def withListTemplates(value: ListTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWordDotListGallery_typekey(value: ListGallery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ListGallery_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

