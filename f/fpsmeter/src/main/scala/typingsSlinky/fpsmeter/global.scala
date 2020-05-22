package typingsSlinky.fpsmeter

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class FPSMeter ()
    extends typingsSlinky.fpsmeter.FPSMeter {
    def this(anchor: HTMLElement) = this()
    def this(anchor: HTMLElement, options: FPSMeterOptions) = this()
    /* CompleteClass */
    override var options: FPSMeterOptions = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def hide(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def pause(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def resume(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def set(name: String, value: js.Any): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def show(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def showDuration(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def showFps(): typingsSlinky.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def tick(): Unit = js.native
    /* CompleteClass */
    override def tickStart(): Unit = js.native
    /* CompleteClass */
    override def toggle(): typingsSlinky.fpsmeter.FPSMeter = js.native
  }
  
}

