package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResampleMediaTasks extends js.Object {
  val Count: Double = js.native
  val PercentComplete: Double = js.native
  @JSName("PowerPoint.ResampleMediaTasks_typekey")
  var PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks = js.native
  def Cancel(): Unit = js.native
  def Item(Index: Double): ResampleMediaTask = js.native
  def Pause(): Unit = js.native
  def Resume(): Unit = js.native
}

object ResampleMediaTasks {
  @scala.inline
  def apply(
    Cancel: () => Unit,
    Count: Double,
    Item: Double => ResampleMediaTask,
    Pause: () => Unit,
    PercentComplete: Double,
    PowerPointDotResampleMediaTasks_typekey: ResampleMediaTasks,
    Resume: () => Unit
  ): ResampleMediaTasks = {
    val __obj = js.Dynamic.literal(Cancel = js.Any.fromFunction0(Cancel), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Pause = js.Any.fromFunction0(Pause), PercentComplete = PercentComplete.asInstanceOf[js.Any], Resume = js.Any.fromFunction0(Resume))
    __obj.updateDynamic("PowerPoint.ResampleMediaTasks_typekey")(PowerPointDotResampleMediaTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTasks]
  }
  @scala.inline
  implicit class ResampleMediaTasksOps[Self <: ResampleMediaTasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => ResampleMediaTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotResampleMediaTasks_typekey(value: ResampleMediaTasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ResampleMediaTasks_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resume")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

