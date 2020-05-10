package typingsSlinky.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseService extends js.Object {
  var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
  var app: typingsSlinky.firebaseAppTypes.mod.FirebaseApp = js.native
}

object FirebaseService {
  @scala.inline
  def apply(app: typingsSlinky.firebaseAppTypes.mod.FirebaseApp): FirebaseService = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseService]
  }
  @scala.inline
  implicit class FirebaseServiceOps[Self <: FirebaseService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: typingsSlinky.firebaseAppTypes.mod.FirebaseApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERNAL(value: FirebaseServiceInternals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutINTERNAL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL")(js.undefined)
        ret
    }
  }
  
}

