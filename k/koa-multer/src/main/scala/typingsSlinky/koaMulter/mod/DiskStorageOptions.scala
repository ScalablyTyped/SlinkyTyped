package typingsSlinky.koaMulter.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskStorageOptions extends js.Object {
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.native
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
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
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDestination(
      value: String | (js.Function3[
          /* req */ IncomingMessage, 
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
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Unit
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

