package typingsSlinky.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributesFor[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.emberData.mod.ModelKeys[Model]
  type ChangedAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.std.Exclude[java.lang.String, java.lang.String]
  type RelationshipsFor[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.emberData.mod.ModelKeys[Model]
}
