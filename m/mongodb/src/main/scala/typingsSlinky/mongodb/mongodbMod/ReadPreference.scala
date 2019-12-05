package typingsSlinky.mongodb.mongodbMod

import typingsSlinky.mongodb.Anon_MaxStalenessSeconds
import typingsSlinky.mongodb.mongodbStrings.nearest
import typingsSlinky.mongodb.mongodbStrings.primary
import typingsSlinky.mongodb.mongodbStrings.primaryPreferred
import typingsSlinky.mongodb.mongodbStrings.secondary
import typingsSlinky.mongodb.mongodbStrings.secondaryPreferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ReadPreference")
@js.native
class ReadPreference protected () extends ReadPreferenceOrMode {
  def this(mode: ReadPreferenceMode, tags: js.Object) = this()
  var mode: ReadPreferenceMode = js.native
  var options: Anon_MaxStalenessSeconds = js.native
  var tags: js.Any = js.native
  def isValid(mode: String): Boolean = js.native
}

/* static members */
@JSImport("mongodb", "ReadPreference")
@js.native
object ReadPreference extends js.Object {
  var NEAREST: nearest = js.native
  var PRIMARY: primary = js.native
  var PRIMARY_PREFERRED: primaryPreferred = js.native
  var SECONDARY: secondary = js.native
  var SECONDARY_PREFERRED: secondaryPreferred = js.native
  def isValid(mode: String): Boolean = js.native
}

