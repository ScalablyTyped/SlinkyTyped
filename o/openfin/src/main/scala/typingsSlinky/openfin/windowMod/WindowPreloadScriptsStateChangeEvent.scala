package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowPreloadScriptsStateChangeEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any] = js.native
}

object WindowPreloadScriptsStateChangeEvent {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any],
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangeEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowPreloadScriptsStateChangeEventOps[Self[topic, `type`] <: WindowPreloadScriptsStateChangeEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withPreloadScripts(value: js.Array[PreloadScriptInfoRunning with js.Any]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadScripts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

