package typingsSlinky.listr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ListrContext = js.Any
  type ListrTaskResult[Ctx] = java.lang.String | js.Promise[js.Any] | typingsSlinky.listr.mod.Listr[Ctx] | typingsSlinky.node.streamMod.Readable | typingsSlinky.rxjs.mod.Observable_[js.Any]
}
