package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintRange extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val End: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PrintRange_typekey")
  var PowerPointDotPrintRange_typekey: PrintRange = js.native
  val Start: Double = js.native
  def Delete(): Unit = js.native
}

object PrintRange {
  @scala.inline
  def apply(
    Application: Application,
    Delete: () => Unit,
    End: Double,
    Parent: js.Any,
    PowerPointDotPrintRange_typekey: PrintRange,
    Start: Double
  ): PrintRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), End = End.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRange_typekey")(PowerPointDotPrintRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRange]
  }
  @scala.inline
  implicit class PrintRangeOps[Self <: PrintRange] (val x: Self) extends AnyVal {
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
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPrintRange_typekey(value: PrintRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PrintRange_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

