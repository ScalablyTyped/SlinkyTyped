package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmark extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Column: Boolean = js.native
  val Creator: Double = js.native
  val Empty: Boolean = js.native
  var End: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var Start: Double = js.native
  val StoryType: WdStoryType = js.native
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: Bookmark = js.native
  def Copy(Name: String): Bookmark = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object Bookmark {
  @scala.inline
  def apply(
    Application: Application,
    Column: Boolean,
    Copy: String => Bookmark,
    Creator: Double,
    Delete: () => Unit,
    Empty: Boolean,
    End: Double,
    Name: String,
    Parent: js.Any,
    Range: Range,
    Select: () => Unit,
    Start: Double,
    StoryType: WdStoryType,
    WordDotBookmark_typekey: Bookmark
  ): Bookmark = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], Copy = js.Any.fromFunction1(Copy), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Empty = Empty.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Start = Start.asInstanceOf[js.Any], StoryType = StoryType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bookmark_typekey")(WordDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  @scala.inline
  implicit class BookmarkOps[Self <: Bookmark] (val x: Self) extends AnyVal {
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
    def withColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: String => Bookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
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
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryType(value: WdStoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBookmark_typekey(value: Bookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Bookmark_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

