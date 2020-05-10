package typingsSlinky.angularFileUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileLikeObject extends js.Object {
  /**
    * Equals File.lastModifiedDate
    */
  var lastModifiedDate: js.Any = js.native
  /**
    * Equals File.name
    */
  var name: String = js.native
  /**
    * Equals Blob.size, in octet
    */
  var size: Double = js.native
  /**
    * Equals Blob.type, in octet
    */
  var `type`: String = js.native
}

object FileLikeObject {
  @scala.inline
  def apply(lastModifiedDate: js.Any, name: String, size: Double, `type`: String): FileLikeObject = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLikeObject]
  }
  @scala.inline
  implicit class FileLikeObjectOps[Self <: FileLikeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModifiedDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

