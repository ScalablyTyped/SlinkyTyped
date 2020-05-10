package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectFileAndVersion extends js.Object {
  val ObjectFile: IObjectFile = js.native
  val ObjectVersion: IObjectVersionAndProperties = js.native
}

object IObjectFileAndVersion {
  @scala.inline
  def apply(ObjectFile: IObjectFile, ObjectVersion: IObjectVersionAndProperties): IObjectFileAndVersion = {
    val __obj = js.Dynamic.literal(ObjectFile = ObjectFile.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
  @scala.inline
  implicit class IObjectFileAndVersionOps[Self <: IObjectFileAndVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectFile(value: IObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersion(value: IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

