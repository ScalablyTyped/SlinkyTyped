package typingsSlinky.listr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listrMod {
  import typingsSlinky.node.streamMod.Readable
  import typingsSlinky.rxjs.rxjsMod.Observable

  type ListrContext = js.Any
  type ListrTaskResult[Ctx] = String | js.Promise[js.Any] | Listr[Ctx] | Readable | Observable[js.Any]
}
