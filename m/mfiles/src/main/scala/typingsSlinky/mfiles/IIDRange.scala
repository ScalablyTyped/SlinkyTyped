package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIDRange extends js.Object {
  var MaxID: Double = js.native
  var MaxID_32bit: String = js.native
  var MinID: Double = js.native
  var MinID_32bit: String = js.native
  def Clone(): IIDRange = js.native
  def SetIDs(MinID: Double, MaxID: Double): Unit = js.native
  def SetIDs_32bit(MinID: String, MaxID: String): Unit = js.native
}

object IIDRange {
  @scala.inline
  def apply(
    Clone: () => IIDRange,
    MaxID: Double,
    MaxID_32bit: String,
    MinID: Double,
    MinID_32bit: String,
    SetIDs: (Double, Double) => Unit,
    SetIDs_32bit: (String, String) => Unit
  ): IIDRange = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), MaxID = MaxID.asInstanceOf[js.Any], MaxID_32bit = MaxID_32bit.asInstanceOf[js.Any], MinID = MinID.asInstanceOf[js.Any], MinID_32bit = MinID_32bit.asInstanceOf[js.Any], SetIDs = js.Any.fromFunction2(SetIDs), SetIDs_32bit = js.Any.fromFunction2(SetIDs_32bit))
    __obj.asInstanceOf[IIDRange]
  }
  @scala.inline
  implicit class IIDRangeOps[Self <: IIDRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IIDRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxID_32bit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxID_32bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinID_32bit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinID_32bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIDs(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIDs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIDs_32bit(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIDs_32bit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

