package typingsSlinky.meteor.anon

import typingsSlinky.meteor.Mongo.CurrentDateModifier
import typingsSlinky.meteor.meteorStrings.date
import typingsSlinky.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type
  extends CurrentDateModifier
     with typingsSlinky.meteor.mongoMod.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date
}

object Type {
  @scala.inline
  def apply($type: timestamp | date): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

