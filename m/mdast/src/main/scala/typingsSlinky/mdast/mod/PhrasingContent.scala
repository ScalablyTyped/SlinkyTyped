package typingsSlinky.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mdast.mod.StaticPhrasingContent
  - typingsSlinky.mdast.mod.Link
  - typingsSlinky.mdast.mod.LinkReference
*/
trait PhrasingContent extends Content

object PhrasingContent {
  @scala.inline
  implicit def apply(value: Link): PhrasingContent = value.asInstanceOf[PhrasingContent]
  @scala.inline
  implicit def apply(value: LinkReference): PhrasingContent = value.asInstanceOf[PhrasingContent]
  @scala.inline
  implicit def apply(value: StaticPhrasingContent): PhrasingContent = value.asInstanceOf[PhrasingContent]
}

