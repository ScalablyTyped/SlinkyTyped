package typingsSlinky.listr.mod

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Promise[js.Any]
  - typingsSlinky.listr.mod.Listr[Ctx]
  - typingsSlinky.node.streamMod.Readable
  - typingsSlinky.rxjs.mod.Observable_[js.Any]
*/
trait ListrTaskResult[Ctx] extends js.Object

object ListrTaskResult {
  @scala.inline
  implicit def apply[Ctx](value: Listr[Ctx]): ListrTaskResult[Ctx] = value.asInstanceOf[ListrTaskResult[Ctx]]
  @scala.inline
  implicit def apply[Ctx](value: Observable_[js.Any]): ListrTaskResult[Ctx] = value.asInstanceOf[ListrTaskResult[Ctx]]
  @scala.inline
  implicit def apply[Ctx](value: js.Promise[js.Any]): ListrTaskResult[Ctx] = value.asInstanceOf[ListrTaskResult[Ctx]]
  @scala.inline
  implicit def apply[Ctx](value: Readable): ListrTaskResult[Ctx] = value.asInstanceOf[ListrTaskResult[Ctx]]
  @scala.inline
  implicit def apply[Ctx](value: String): ListrTaskResult[Ctx] = value.asInstanceOf[ListrTaskResult[Ctx]]
}

