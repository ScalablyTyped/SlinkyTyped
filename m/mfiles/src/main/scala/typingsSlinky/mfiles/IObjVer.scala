package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjVer extends js.Object {
  var ID: Double = js.native
  var ObjID: IObjID = js.native
  var Type: Double = js.native
  var Version: Double = js.native
  def Clone(): IObjVer = js.native
  def CloneFrom(ObjVer: IObjVer): Unit = js.native
  def Serialize(): js.Array[Double] = js.native
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit = js.native
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit = js.native
  def ToJSON(): String = js.native
  def Unserialize(Bytes: js.Array[Double]): Unit = js.native
}

object IObjVer {
  @scala.inline
  def apply(
    Clone: () => IObjVer,
    CloneFrom: IObjVer => Unit,
    ID: Double,
    ObjID: IObjID,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double, Double) => Unit,
    SetObjIDAndVersion: (IObjID, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit,
    Version: Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], ObjID = ObjID.asInstanceOf[js.Any], Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction3(SetIDs), SetObjIDAndVersion = js.Any.fromFunction2(SetObjIDAndVersion), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1(Unserialize), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjVer]
  }
  @scala.inline
  implicit class IObjVerOps[Self <: IObjVer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IObjVer => Unit): Self = {
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
    def withObjID(value: IObjID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIDs(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIDs")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetObjIDAndVersion(value: (IObjID, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetObjIDAndVersion")(js.Any.fromFunction2(value))
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
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

