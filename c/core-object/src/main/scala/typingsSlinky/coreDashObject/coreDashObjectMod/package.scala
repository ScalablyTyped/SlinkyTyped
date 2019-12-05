package typingsSlinky.coreDashObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashObjectMod {
  import typingsSlinky.coreDashObject.Anon_Super
  import typingsSlinky.coreDashObject.dashPrivateUtilsMod.Mix
  import typingsSlinky.std.Record
  import typingsSlinky.std.ThisType

  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typingsSlinky.coreDashObject.coreDashObjectStrings.ExtendOptions with Base with (Record[String, _])
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = ThisType[(Mix[Base, Ext]) with Anon_Super[Base]]
}
