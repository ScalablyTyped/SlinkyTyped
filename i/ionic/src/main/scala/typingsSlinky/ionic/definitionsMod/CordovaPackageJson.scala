package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonPlatforms
import typingsSlinky.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPackageJson extends PackageJson {
  var cordova: AnonPlatforms = js.native
}

object CordovaPackageJson {
  @scala.inline
  def apply(cordova: AnonPlatforms, name: String, version: String): CordovaPackageJson = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPackageJson]
  }
  @scala.inline
  implicit class CordovaPackageJsonOps[Self <: CordovaPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCordova(value: AnonPlatforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

