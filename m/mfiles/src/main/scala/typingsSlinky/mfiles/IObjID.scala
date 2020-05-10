package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjID extends js.Object {
  var ID: Double = js.native
  var Type: Double = js.native
  def Clone(): IObjID = js.native
  def CloneFrom(ObjID: IObjID): Unit = js.native
  def Serialize(): js.Array[Double] = js.native
  def SetIDs(ObjType: Double, ID: Double): Unit = js.native
  def ToJSON(): String = js.native
  def Unserialize(Bytes: js.Array[Double]): Unit = js.native
}

object IObjID {
  @scala.inline
  def apply(
    Clone: () => IObjID,
    CloneFrom: IObjID => Unit,
    ID: Double,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction2(SetIDs), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1(Unserialize))
    __obj.asInstanceOf[IObjID]
  }
  @scala.inline
  implicit class IObjIDOps[Self <: IObjID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIDs(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIDs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnserialize(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unserialize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

