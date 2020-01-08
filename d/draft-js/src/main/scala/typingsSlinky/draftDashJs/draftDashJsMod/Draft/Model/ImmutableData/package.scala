package typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableData {
  import typingsSlinky.immutable.Immutable.OrderedMap
  import typingsSlinky.immutable.Immutable.OrderedSet

  type BlockMap = OrderedMap[String, ContentBlock]
  type DraftInlineStyle = OrderedSet[String]
}
