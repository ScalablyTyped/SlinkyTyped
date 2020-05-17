package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
@js.native
trait LocalFileSystem extends js.Object {
  var PERSISTENT: Double = js.native
  var TEMPORARY: Double = js.native
}

object LocalFileSystem {
  @scala.inline
  def apply(PERSISTENT: Double, TEMPORARY: Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileSystem]
  }
  @scala.inline
  implicit class LocalFileSystemOps[Self <: LocalFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPERSISTENT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEMPORARY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEMPORARY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

