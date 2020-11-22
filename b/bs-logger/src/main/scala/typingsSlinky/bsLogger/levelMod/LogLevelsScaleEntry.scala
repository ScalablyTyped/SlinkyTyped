package typingsSlinky.bsLogger.levelMod

import typingsSlinky.bsLogger.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevelsScaleEntry extends js.Object {
  
  var name: String = js.native
  
  var range: From = js.native
  
  def test(level: Double): Boolean = js.native
}
object LogLevelsScaleEntry {
  
  @scala.inline
  def apply(name: String, range: From, test: Double => Boolean): LogLevelsScaleEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[LogLevelsScaleEntry]
  }
  
  @scala.inline
  implicit class LogLevelsScaleEntryOps[Self <: LogLevelsScaleEntry] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: From): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Double => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
}
