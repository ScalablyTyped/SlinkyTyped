package typingsSlinky.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleInfo extends js.Object {
  var cryptokiVersion: Version = js.native
  var flags: Double = js.native
  var libraryDescription: String = js.native
  var libraryVersion: Version = js.native
  var manufacturerID: String = js.native
}

object ModuleInfo {
  @scala.inline
  def apply(
    cryptokiVersion: Version,
    flags: Double,
    libraryDescription: String,
    libraryVersion: Version,
    manufacturerID: String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(cryptokiVersion = cryptokiVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], libraryDescription = libraryDescription.asInstanceOf[js.Any], libraryVersion = libraryVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptokiVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptokiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraryDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraryVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

