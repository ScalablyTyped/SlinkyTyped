package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files
  extends /* key */ StringDictionary[js.Any] {
  var files: FileList = js.native
}

object Files {
  @scala.inline
  def apply(files: FileList): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: FileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

