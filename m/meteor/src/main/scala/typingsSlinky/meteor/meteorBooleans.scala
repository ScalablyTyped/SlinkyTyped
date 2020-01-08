package typingsSlinky.meteor

import typingsSlinky.meteor.Mongo.CurrentDateModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorBooleans {
  @js.native
  sealed trait `true`
    extends CurrentDateModifier
       with typingsSlinky.meteor.mongoMod.Mongo.CurrentDateModifier
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

