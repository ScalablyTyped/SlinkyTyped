package typingsSlinky.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quixote_ extends js.Object {
  // Create a test iframe. This is a slow operation, so once you have a frame, it's best to use QFrame.reset() on it rather than creating a new frame for each test
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame = js.native
}

object Quixote_ {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => QFrame
  ): Quixote_ = {
    val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
    __obj.asInstanceOf[Quixote_]
  }
  @scala.inline
  implicit class Quixote_Ops[Self <: Quixote_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFrame(
      value: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => QFrame
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFrame")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

