package typingsSlinky.atom.mod

import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBufferFileBackend extends js.Object {
  /**
    *  A {Function} that invokes its callback argument
    *  when the file changes. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidChange: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is deleted. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidDelete: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is renamed. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidRename: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
  /**
    *  A {Function} that returns a `Readable` stream
    *  that can be used to load the file's content.
    */
  def createReadStream(): ReadStream = js.native
  /**
    *  A {Function} that returns a `Writable` stream
    *  that can be used to save content to the file.
    */
  def createWriteStream(): WriteStream = js.native
  /** A {Function} that returns a {Boolean}, true if the file exists, false otherwise. */
  def existsSync(): Boolean = js.native
  /** A {Function} that returns the {String} path to the file. */
  def getPath(): String = js.native
}

object TextBufferFileBackend {
  @scala.inline
  def apply(
    createReadStream: () => ReadStream,
    createWriteStream: () => WriteStream,
    existsSync: () => Boolean,
    getPath: () => String
  ): TextBufferFileBackend = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), createWriteStream = js.Any.fromFunction0(createWriteStream), existsSync = js.Any.fromFunction0(existsSync), getPath = js.Any.fromFunction0(getPath))
    __obj.asInstanceOf[TextBufferFileBackend]
  }
  @scala.inline
  implicit class TextBufferFileBackendOps[Self <: TextBufferFileBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateReadStream(value: () => ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReadStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateWriteStream(value: () => WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWriteStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExistsSync(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existsSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDidChange(value: /* callback */ js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidDelete(value: /* callback */ js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidRename(value: /* callback */ js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidRename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidRename")(js.undefined)
        ret
    }
  }
  
}

