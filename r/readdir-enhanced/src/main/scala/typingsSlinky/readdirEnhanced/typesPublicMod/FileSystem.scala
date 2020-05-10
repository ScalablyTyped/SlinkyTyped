package typingsSlinky.readdirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem extends js.Object {
  /**
    * Returns filesystem information about a symlink.
    */
  def lstat(path: String, callback: Callback[typingsSlinky.node.fsMod.Stats]): Unit = js.native
  /**
    * Returns the names of files in a directory.
    */
  def readdir(path: String, callback: Callback[js.Array[String]]): Unit = js.native
  /**
    * Returns filesystem information about a directory entry.
    */
  def stat(path: String, callback: Callback[typingsSlinky.node.fsMod.Stats]): Unit = js.native
}

object FileSystem {
  @scala.inline
  def apply(
    lstat: (String, Callback[typingsSlinky.node.fsMod.Stats]) => Unit,
    readdir: (String, Callback[js.Array[String]]) => Unit,
    stat: (String, Callback[typingsSlinky.node.fsMod.Stats]) => Unit
  ): FileSystem = {
    val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2(lstat), readdir = js.Any.fromFunction2(readdir), stat = js.Any.fromFunction2(stat))
    __obj.asInstanceOf[FileSystem]
  }
  @scala.inline
  implicit class FileSystemOps[Self <: FileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLstat(value: (String, Callback[typingsSlinky.node.fsMod.Stats]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReaddir(value: (String, Callback[js.Array[String]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStat(value: (String, Callback[typingsSlinky.node.fsMod.Stats]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

