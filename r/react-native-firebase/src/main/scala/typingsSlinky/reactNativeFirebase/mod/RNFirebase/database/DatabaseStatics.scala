package typingsSlinky.reactNativeFirebase.mod.RNFirebase.database

import typingsSlinky.reactNativeFirebase.AnonTIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseStatics extends js.Object {
  /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
  var ServerValue: AnonTIMESTAMP = js.native
}

object DatabaseStatics {
  @scala.inline
  def apply(ServerValue: AnonTIMESTAMP): DatabaseStatics = {
    val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseStatics]
  }
  @scala.inline
  implicit class DatabaseStaticsOps[Self <: DatabaseStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerValue(value: AnonTIMESTAMP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

