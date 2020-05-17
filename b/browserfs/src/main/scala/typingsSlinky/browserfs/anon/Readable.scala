package typingsSlinky.browserfs.anon

import typingsSlinky.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readable extends js.Object {
  var readable: FileSystem = js.native
  var writable: FileSystem = js.native
}

object Readable {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): Readable = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable]
  }
  @scala.inline
  implicit class ReadableOps[Self <: Readable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadable(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritable(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

