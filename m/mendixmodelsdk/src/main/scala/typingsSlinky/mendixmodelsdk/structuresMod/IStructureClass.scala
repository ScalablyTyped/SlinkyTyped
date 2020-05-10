package typingsSlinky.mendixmodelsdk.structuresMod

import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructureClass extends js.Object {
  var versionInfo: StructureVersionInfo = js.native
}

object IStructureClass {
  @scala.inline
  def apply(versionInfo: StructureVersionInfo): IStructureClass = {
    val __obj = js.Dynamic.literal(versionInfo = versionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureClass]
  }
  @scala.inline
  implicit class IStructureClassOps[Self <: IStructureClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionInfo(value: StructureVersionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

