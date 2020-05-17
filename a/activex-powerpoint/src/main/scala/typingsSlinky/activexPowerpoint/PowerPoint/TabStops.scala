package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStops extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  var DefaultSpacing: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: TabStops = js.native
  def Add(Type: PpTabStopType, Position: Double): TabStop = js.native
  def Item(Index: Double): TabStop = js.native
}

object TabStops {
  @scala.inline
  def apply(
    Add: (PpTabStopType, Double) => TabStop,
    Application: Application,
    Count: Double,
    DefaultSpacing: Double,
    Item: Double => TabStop,
    Parent: js.Any,
    PowerPointDotTabStops_typekey: TabStops
  ): TabStops = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], DefaultSpacing = DefaultSpacing.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStops_typekey")(PowerPointDotTabStops_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStops]
  }
  @scala.inline
  implicit class TabStopsOps[Self <: TabStops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (PpTabStopType, Double) => TabStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
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
    def withDefaultSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => TabStop): Self = {
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
    def withPowerPointDotTabStops_typekey(value: TabStops): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TabStops_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

