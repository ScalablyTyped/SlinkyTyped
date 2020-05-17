package typingsSlinky.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presets extends js.Object {
  var components: StringDictionary[typingsSlinky.remarkable.anon.Rules] = js.native
  var options: Options = js.native
}

object Presets {
  @scala.inline
  def apply(components: StringDictionary[typingsSlinky.remarkable.anon.Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presets]
  }
  @scala.inline
  implicit class PresetsOps[Self <: Presets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: StringDictionary[typingsSlinky.remarkable.anon.Rules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

