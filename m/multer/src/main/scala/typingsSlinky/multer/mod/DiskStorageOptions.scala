package typingsSlinky.multer.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.multer.mod.global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskStorageOptions extends js.Object {
  /**
    * A string or function that determines the destination path for uploaded
    * files. If a string is passed and the directory does not exist, Multer
    * attempts to create it recursively. If neither a string or a function
    * is passed, the destination defaults to `os.tmpdir()`.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the destination path.
    */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.native
  /**
    * A function that determines the name of the uploaded file. If nothing
    * is passed, Multer will generate a 32 character pseudorandom hex string
    * with no extension.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the name of the uploaded file.
    */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit], 
      Unit
    ]
  ] = js.native
}

object DiskStorageOptions {
  @scala.inline
  def apply(): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskStorageOptions]
  }
  @scala.inline
  implicit class DiskStorageOptionsOps[Self <: DiskStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationFunction3(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDestination(
      value: String | (js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
  }
  
}

