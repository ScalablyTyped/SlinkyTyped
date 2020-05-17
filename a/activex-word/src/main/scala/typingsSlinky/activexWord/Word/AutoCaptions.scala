package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCaptions extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCaptions_typekey")
  var WordDotAutoCaptions_typekey: AutoCaptions = js.native
  def CancelAutoInsert(): Unit = js.native
  def Item(Index: js.Any): AutoCaption = js.native
}

object AutoCaptions {
  @scala.inline
  def apply(
    Application: Application,
    CancelAutoInsert: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCaption,
    Parent: js.Any,
    WordDotAutoCaptions_typekey: AutoCaptions
  ): AutoCaptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CancelAutoInsert = js.Any.fromFunction0(CancelAutoInsert), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaptions_typekey")(WordDotAutoCaptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaptions]
  }
  @scala.inline
  implicit class AutoCaptionsOps[Self <: AutoCaptions] (val x: Self) extends AnyVal {
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
    def withCancelAutoInsert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelAutoInsert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => AutoCaption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotAutoCaptions_typekey(value: AutoCaptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AutoCaptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

