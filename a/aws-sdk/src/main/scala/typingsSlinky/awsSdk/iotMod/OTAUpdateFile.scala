package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateFile extends js.Object {
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.native
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.native
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.native
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.native
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.native
}

object OTAUpdateFile {
  @scala.inline
  def apply(): OTAUpdateFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateFile]
  }
  @scala.inline
  implicit class OTAUpdateFileOps[Self <: OTAUpdateFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSigning(value: CodeSigning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSigning")(js.undefined)
        ret
    }
    @scala.inline
    def withFileLocation(value: FileLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: FileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileVersion(value: OTAUpdateFileVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileVersion")(js.undefined)
        ret
    }
  }
  
}

