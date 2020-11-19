package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowPreloadScriptsStateChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any] = js.native
}
object WindowPreloadScriptsStateChangedEvent {
  
  @scala.inline
  def apply[Topic, Type](
    name: String,
    preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any],
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowPreloadScriptsStateChangedEventOps[Self <: WindowPreloadScriptsStateChangedEvent[_, _], Topic, Type] (val x: Self with (WindowPreloadScriptsStateChangedEvent[Topic, Type])) extends AnyVal {
    
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
    def setPreloadScriptsVarargs(value: (PreloadScriptInfoRunning with js.Any)*): Self = this.set("preloadScripts", js.Array(value :_*))
    
    @scala.inline
    def setPreloadScripts(value: js.Array[PreloadScriptInfoRunning with js.Any]): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
  }
}
