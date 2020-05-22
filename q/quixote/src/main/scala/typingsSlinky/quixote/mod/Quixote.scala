package typingsSlinky.quixote.mod

import typingsSlinky.quixote.QFrame
import typingsSlinky.quixote.QuixoteFrameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote extends js.Object {
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => QFrame
  ): Quixote = {
    val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
    __obj.asInstanceOf[Quixote]
  }
}

