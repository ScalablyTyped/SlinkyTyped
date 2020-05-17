package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
@js.native
trait ASPxClientUploadControlFile extends js.Object {
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String = js.native
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double = js.native
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any = js.native
}

object ASPxClientUploadControlFile {
  @scala.inline
  def apply(name: String, size: Double, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceFileObject = sourceFileObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
  @scala.inline
  implicit class ASPxClientUploadControlFileOps[Self <: ASPxClientUploadControlFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSourceFileObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

