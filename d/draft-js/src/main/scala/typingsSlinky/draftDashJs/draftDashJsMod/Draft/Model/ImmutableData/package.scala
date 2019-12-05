package typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableData {
  import typingsSlinky.immutable.Immutable.OrderedMap
  import typingsSlinky.immutable.Immutable.OrderedSet

  type BlockMap = OrderedMap[
    String, 
    typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock
  ]
  type DraftInlineStyle = OrderedSet[String]
}
