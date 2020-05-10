package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMprMetaData extends js.Object {
  /** docs:keep */ var _BuildVersion: String = js.native
  /** docs:keep */ var _ProductVersion: String = js.native
  /** docs:keep */ var _SchemaHash: String = js.native
}

object IMprMetaData {
  @scala.inline
  def apply(_BuildVersion: String, _ProductVersion: String, _SchemaHash: String): IMprMetaData = {
    val __obj = js.Dynamic.literal(_BuildVersion = _BuildVersion.asInstanceOf[js.Any], _ProductVersion = _ProductVersion.asInstanceOf[js.Any], _SchemaHash = _SchemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMprMetaData]
  }
  @scala.inline
  implicit class IMprMetaDataOps[Self <: IMprMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_BuildVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_BuildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ProductVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ProductVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_SchemaHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_SchemaHash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

