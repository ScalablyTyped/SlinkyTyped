package typingsSlinky.parse.Parse.Cloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadPreferenceOption extends js.Object

// Read preference describes how MongoDB driver route read operations to the members of a replica set.
@JSGlobal("Parse.Cloud.ReadPreferenceOption")
@js.native
object ReadPreferenceOption extends js.Object {
  @js.native
  sealed trait Nearest extends ReadPreferenceOption
  
  @js.native
  sealed trait Primary extends ReadPreferenceOption
  
  @js.native
  sealed trait PrimaryPreferred extends ReadPreferenceOption
  
  @js.native
  sealed trait Secondary extends ReadPreferenceOption
  
  @js.native
  sealed trait SecondaryPreferred extends ReadPreferenceOption
  
  /* "NEAREST" */ val Nearest: typingsSlinky.parse.Parse.Cloud.ReadPreferenceOption.Nearest with String = js.native
  /* "PRIMARY" */ val Primary: typingsSlinky.parse.Parse.Cloud.ReadPreferenceOption.Primary with String = js.native
  /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typingsSlinky.parse.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred with String = js.native
  /* "SECONDARY" */ val Secondary: typingsSlinky.parse.Parse.Cloud.ReadPreferenceOption.Secondary with String = js.native
  /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typingsSlinky.parse.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadPreferenceOption with String] = js.native
}

