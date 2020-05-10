package typingsSlinky.resolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOpts extends Opts {
  /** function to asynchronously test whether a directory exists */
  var isDirectory: js.UndefOr[js.Function2[/* directory */ String, /* cb */ existsCallback, Unit]] = js.native
  /** function to asynchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ existsCallback, Unit]] = js.native
  /** how to read files asynchronously (defaults to fs.readFile) */
  var readFile: js.UndefOr[js.Function2[/* file */ String, /* cb */ readFileCallback, Unit]] = js.native
}

object AsyncOpts {
  @scala.inline
  def apply(): AsyncOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOpts]
  }
  @scala.inline
  implicit class AsyncOptsOps[Self <: AsyncOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDirectory(value: (/* directory */ String, /* cb */ existsCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFile(value: (/* file */ String, /* cb */ existsCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFile(value: (/* file */ String, /* cb */ readFileCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
  }
  
}

