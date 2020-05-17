package typingsSlinky.koaMulter.mod

import typingsSlinky.koaMulter.anon.FieldNameSize
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.native
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[FieldNameSize] = js.native
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFilter(
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFileFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: FieldNameSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: StorageEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

