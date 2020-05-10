package typingsSlinky.browserfs.fileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemConstructor extends js.Object {
  /**
    * **Core**: Name to identify this particular file system.
    */
  var Name: String = js.native
  /**
    * **Core**: Describes all of the options available for this file system.
    */
  var Options: FileSystemOptions = js.native
  /**
    * **Core**: Creates a file system of this given type with the given
    * options.
    */
  def Create(options: js.Object, cb: BFSCallback[FileSystem]): Unit = js.native
  /**
    * **Core**: Returns 'true' if this filesystem is available in the current
    * environment. For example, a `localStorage`-backed filesystem will return
    * 'false' if the browser does not support that API.
    *
    * Defaults to 'false', as the FileSystem base class isn't usable alone.
    */
  def isAvailable(): Boolean = js.native
}

object FileSystemConstructor {
  @scala.inline
  def apply(
    Create: (js.Object, BFSCallback[FileSystem]) => Unit,
    Name: String,
    Options: FileSystemOptions,
    isAvailable: () => Boolean
  ): FileSystemConstructor = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction2(Create), Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], isAvailable = js.Any.fromFunction0(isAvailable))
    __obj.asInstanceOf[FileSystemConstructor]
  }
  @scala.inline
  implicit class FileSystemConstructorOps[Self <: FileSystemConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (js.Object, BFSCallback[FileSystem]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: FileSystemOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

