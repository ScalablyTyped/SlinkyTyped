package typingsSlinky.reactNativeFirebaseApp.Utils

import typingsSlinky.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import typingsSlinky.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends FirebaseModule {
  /**
    * Returns true if this app is running inside a Firebase Test Lab environment. Always returns false on iOS.
    *
    * @android
    */
  var isRunningInTestLab: Boolean = js.native
}

object Module {
  @scala.inline
  def apply(app: FirebaseApp, emitter: js.Any, isRunningInTestLab: Boolean, native: js.Any): Module = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], isRunningInTestLab = isRunningInTestLab.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRunningInTestLab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunningInTestLab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

