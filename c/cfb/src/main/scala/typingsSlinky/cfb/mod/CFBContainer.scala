package typingsSlinky.cfb.mod

import typingsSlinky.cfb.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBContainer extends js.Object {
  /* Array of entries in the same order as FullPaths */
  var FileIndex: js.Array[CFBEntry] = js.native
  /* List of streams and storages */
  var FullPaths: js.Array[String] = js.native
  /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
  var raw: js.UndefOr[Header] = js.native
}

object CFBContainer {
  @scala.inline
  def apply(FileIndex: js.Array[CFBEntry], FullPaths: js.Array[String]): CFBContainer = {
    val __obj = js.Dynamic.literal(FileIndex = FileIndex.asInstanceOf[js.Any], FullPaths = FullPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBContainer]
  }
  @scala.inline
  implicit class CFBContainerOps[Self <: CFBContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileIndex(value: js.Array[CFBEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

