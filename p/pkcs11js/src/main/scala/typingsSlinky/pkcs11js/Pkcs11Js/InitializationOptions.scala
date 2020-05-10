package typingsSlinky.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializationOptions extends js.Object {
  /**
    * bit flags specifying options for `C_Initialize`
    * - CKF_LIBRARY_CANT_CREATE_OS_THREADS. True if application threads which are executing calls to the library
    *   may not use native operating system calls to spawn new threads; false if they may
    * - CKF_OS_LOCKING_OK. True if the library can use the native operation system threading model for locking;
    *   false otherwise
    */
  var flags: js.UndefOr[Double] = js.native
  /**
    * NSS library parameters
    */
  var libraryParameters: js.UndefOr[String] = js.native
}

object InitializationOptions {
  @scala.inline
  def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  @scala.inline
  implicit class InitializationOptionsOps[Self <: InitializationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryParameters")(js.undefined)
        ret
    }
  }
  
}

