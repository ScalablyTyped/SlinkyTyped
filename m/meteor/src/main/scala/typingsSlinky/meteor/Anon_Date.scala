package typingsSlinky.meteor

import typingsSlinky.meteor.meteorStrings.date
import typingsSlinky.meteor.meteorStrings.timestamp
import typingsSlinky.meteor.mongoMod.Mongo.CurrentDateModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Date
  extends CurrentDateModifier
     with typingsSlinky.meteor.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date = js.native
}

