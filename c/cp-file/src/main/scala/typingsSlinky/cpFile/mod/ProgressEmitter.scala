package typingsSlinky.cpFile.mod

import typingsSlinky.cpFile.cpFileStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressEmitter extends js.Object {
  
  /**
  		Note: For empty files, the `progress` event is emitted only once.
  		*/
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* data */ ProgressData, Unit]): js.Promise[Unit] = js.native
}
object ProgressEmitter {
  
  @scala.inline
  def apply(on: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): ProgressEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[ProgressEmitter]
  }
  
  @scala.inline
  implicit class ProgressEmitterOps[Self <: ProgressEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOn(value: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
