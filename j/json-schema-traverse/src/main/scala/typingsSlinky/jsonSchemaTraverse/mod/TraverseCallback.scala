package typingsSlinky.jsonSchemaTraverse.mod

import typingsSlinky.jsonSchemaTraverse.anon.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchemaTraverse.mod.TraverseCallbackDef
  - typingsSlinky.jsonSchemaTraverse.anon.Post
*/
trait TraverseCallback extends js.Object

object TraverseCallback {
  @scala.inline
  implicit def apply(value: Post): TraverseCallback = value.asInstanceOf[TraverseCallback]
  @scala.inline
  implicit def apply(value: TraverseCallbackDef): TraverseCallback = value.asInstanceOf[TraverseCallback]
}

