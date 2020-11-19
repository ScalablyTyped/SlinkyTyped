package typingsSlinky.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrichedTask extends Task {
  
  var _end: js.Date = js.native
  
  var _index: Double = js.native
  
  var _start: js.Date = js.native
}
object EnrichedTask {
  
  @scala.inline
  def apply(
    _end: js.Date,
    _index: Double,
    _start: js.Date,
    dependencies: String,
    end: String,
    id: String,
    name: String,
    progress: Double,
    start: String
  ): EnrichedTask = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichedTask]
  }
  
  @scala.inline
  implicit class EnrichedTaskOps[Self <: EnrichedTask] (val x: Self) extends AnyVal {
    
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
    def set_end(value: js.Date): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: Double): Self = this.set("_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: js.Date): Self = this.set("_start", value.asInstanceOf[js.Any])
  }
}
