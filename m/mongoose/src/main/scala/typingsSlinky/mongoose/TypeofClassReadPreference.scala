package typingsSlinky.mongoose

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mongodb.mongodbMod.ReadPreference
import typingsSlinky.mongodb.mongodbMod.ReadPreferenceMode
import typingsSlinky.mongoose.mongooseStrings.nearest
import typingsSlinky.mongoose.mongooseStrings.primary
import typingsSlinky.mongoose.mongooseStrings.primaryPreferred
import typingsSlinky.mongoose.mongooseStrings.secondary
import typingsSlinky.mongoose.mongooseStrings.secondaryPreferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassReadPreference
  extends Instantiable2[/* mode */ ReadPreferenceMode, /* tags */ js.Object, ReadPreference] {
  var NEAREST: nearest = js.native
  var PRIMARY: primary = js.native
  var PRIMARY_PREFERRED: primaryPreferred = js.native
  var SECONDARY: secondary = js.native
  var SECONDARY_PREFERRED: secondaryPreferred = js.native
  def isValid(mode: String): Boolean = js.native
}

