package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceObjectFile extends js.Object {
  var Extension: String = js.native
  var SourceFilePath: String = js.native
  var Title: String = js.native
  def Clone(): ISourceObjectFile = js.native
}

object ISourceObjectFile {
  @scala.inline
  def apply(Clone: () => ISourceObjectFile, Extension: String, SourceFilePath: String, Title: String): ISourceObjectFile = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Extension = Extension.asInstanceOf[js.Any], SourceFilePath = SourceFilePath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceObjectFile]
  }
  @scala.inline
  implicit class ISourceObjectFileOps[Self <: ISourceObjectFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISourceObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

