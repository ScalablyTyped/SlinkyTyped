package typingsSlinky.meteor

import typingsSlinky.meteor.Mongo.CurrentDateModifier
import typingsSlinky.meteor.meteorStrings.date
import typingsSlinky.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonType
  extends CurrentDateModifier
     with typingsSlinky.meteor.mongoMod.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date = js.native
}

object AnonType {
  @scala.inline
  def apply($type: timestamp | date): AnonType = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
  @scala.inline
  implicit class AnonTypeOps[Self <: AnonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$type(value: timestamp | date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

