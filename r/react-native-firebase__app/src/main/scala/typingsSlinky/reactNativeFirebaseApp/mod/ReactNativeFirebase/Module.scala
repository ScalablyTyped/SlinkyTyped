package typingsSlinky.reactNativeFirebaseApp.mod.ReactNativeFirebase

import typingsSlinky.reactNativeFirebaseApp.FirebaseModuleWithStatics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  /**
    * Utils provides a collection of utilities to aid in using Firebase
    * and related services inside React Native, e.g. Test Lab helpers
    * and Google Play Services version helpers.
    */
  var utils: FirebaseModuleWithStatics = js.native
}

object Module {
  @scala.inline
  def apply(utils: FirebaseModuleWithStatics): Module = {
    val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtils(value: FirebaseModuleWithStatics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

