package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagRecognizers extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.SmartTagRecognizers_typekey")
  var WordDotSmartTagRecognizers_typekey: SmartTagRecognizers = js.native
  def Item(Index: js.Any): SmartTagRecognizer = js.native
  def ReloadRecognizers(): Unit = js.native
}

object SmartTagRecognizers {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagRecognizer,
    Parent: js.Any,
    ReloadRecognizers: () => Unit,
    WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
  ): SmartTagRecognizers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadRecognizers = js.Any.fromFunction0(ReloadRecognizers))
    __obj.updateDynamic("Word.SmartTagRecognizers_typekey")(WordDotSmartTagRecognizers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizers]
  }
  @scala.inline
  implicit class SmartTagRecognizersOps[Self <: SmartTagRecognizers] (val x: Self) extends AnyVal {
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
    def withItem(value: js.Any => SmartTagRecognizer): Self = {
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
    def withReloadRecognizers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReloadRecognizers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotSmartTagRecognizers_typekey(value: SmartTagRecognizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SmartTagRecognizers_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

