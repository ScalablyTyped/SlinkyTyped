package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFIndirectPropertyIDLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndirectPropertyIDLevel extends js.Object {
  var ID: Double = js.native
  var LevelType: MFIndirectPropertyIDLevelType = js.native
  def Clone(): IIndirectPropertyIDLevel = js.native
  def ToJSON(): String = js.native
}

object IIndirectPropertyIDLevel {
  @scala.inline
  def apply(
    Clone: () => IIndirectPropertyIDLevel,
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: () => String
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], LevelType = LevelType.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
  @scala.inline
  implicit class IIndirectPropertyIDLevelOps[Self <: IIndirectPropertyIDLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IIndirectPropertyIDLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelType(value: MFIndirectPropertyIDLevelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

