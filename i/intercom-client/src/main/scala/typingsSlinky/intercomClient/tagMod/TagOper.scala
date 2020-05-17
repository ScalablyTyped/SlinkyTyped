package typingsSlinky.intercomClient.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.tagMod.TagCompanies
  - typingsSlinky.intercomClient.tagMod.TagUsers
*/
trait TagOper extends js.Object

object TagOper {
  @scala.inline
  implicit def apply(value: TagCompanies): TagOper = value.asInstanceOf[TagOper]
  @scala.inline
  implicit def apply(value: TagUsers): TagOper = value.asInstanceOf[TagOper]
}

