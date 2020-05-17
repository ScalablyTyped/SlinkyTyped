package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStop extends js.Object {
  var Alignment: WdTabAlignment = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomTab: Boolean = js.native
  var Leader: WdTabLeader = js.native
  val Next: TabStop = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Previous: TabStop = js.native
  @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: TabStop = js.native
  def Clear(): Unit = js.native
}

object TabStop {
  @scala.inline
  def apply(
    Alignment: WdTabAlignment,
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    CustomTab: Boolean,
    Leader: WdTabLeader,
    Next: TabStop,
    Parent: js.Any,
    Position: Double,
    Previous: TabStop,
    WordDotTabStop_typekey: TabStop
  ): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], CustomTab = CustomTab.asInstanceOf[js.Any], Leader = Leader.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TabStop_typekey")(WordDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  @scala.inline
  implicit class TabStopOps[Self <: TabStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: WdTabAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeader(value: WdTabLeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Leader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: TabStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: TabStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotTabStop_typekey(value: TabStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TabStop_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

