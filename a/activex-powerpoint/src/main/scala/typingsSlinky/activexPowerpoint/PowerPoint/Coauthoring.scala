package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coauthoring extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val CoauthorCount: Double = js.native
  var FavorServerEditsDuringMerge: Boolean = js.native
  val MergeMode: Boolean = js.native
  val Parent: js.Any = js.native
  val PendingUpdates: Boolean = js.native
  @JSName("PowerPoint.Coauthoring_typekey")
  var PowerPointDotCoauthoring_typekey: Coauthoring = js.native
  def EndReview(): Unit = js.native
}

object Coauthoring {
  @scala.inline
  def apply(
    Application: Application,
    CoauthorCount: Double,
    EndReview: () => Unit,
    FavorServerEditsDuringMerge: Boolean,
    MergeMode: Boolean,
    Parent: js.Any,
    PendingUpdates: Boolean,
    PowerPointDotCoauthoring_typekey: Coauthoring
  ): Coauthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CoauthorCount = CoauthorCount.asInstanceOf[js.Any], EndReview = js.Any.fromFunction0(EndReview), FavorServerEditsDuringMerge = FavorServerEditsDuringMerge.asInstanceOf[js.Any], MergeMode = MergeMode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Coauthoring_typekey")(PowerPointDotCoauthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coauthoring]
  }
  @scala.inline
  implicit class CoauthoringOps[Self <: Coauthoring] (val x: Self) extends AnyVal {
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
    def withCoauthorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoauthorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndReview(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndReview")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFavorServerEditsDuringMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FavorServerEditsDuringMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotCoauthoring_typekey(value: Coauthoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Coauthoring_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

