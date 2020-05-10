package typingsSlinky.looksSame.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same", "createDiff")
@js.native
object createDiff extends js.Object {
  def apply(
    options: CreateDiffAsBufferOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* buffer */ Buffer, _]
  ): Unit = js.native
  def apply(options: CreateDiffOptions, callback: js.Function1[/* error */ js.Error | Null, _]): Unit = js.native
}

