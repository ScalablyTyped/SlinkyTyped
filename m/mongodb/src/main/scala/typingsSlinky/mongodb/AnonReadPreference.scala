package typingsSlinky.mongodb

import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReadPreference extends js.Object {
  var readPreference: ReadPreferenceOrMode = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object AnonReadPreference {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode): AnonReadPreference = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadPreference]
  }
  @scala.inline
  implicit class AnonReadPreferenceOps[Self <: AnonReadPreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

