package typingsSlinky.reactNativeFirebaseApp.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseModule extends js.Object {
  /**
    * The current `FirebaseApp` instance for this Firebase service.
    */
  var app: FirebaseApp = js.native
  /**
    * Returns the shared event emitter instance used for all JS event routing.
    */
  var emitter: js.Any = js.native
  /**
    * The native module instance for this Firebase service.
    */
  var native: js.Any = js.native
}

object FirebaseModule {
  @scala.inline
  def apply(app: FirebaseApp, emitter: js.Any, native: js.Any): FirebaseModule = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseModule]
  }
  @scala.inline
  implicit class FirebaseModuleOps[Self <: FirebaseModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: FirebaseApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

