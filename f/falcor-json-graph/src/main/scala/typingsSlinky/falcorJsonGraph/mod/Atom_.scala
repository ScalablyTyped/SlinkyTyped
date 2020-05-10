package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: The following types are described at https://github.com/Netflix/falcor/tree/master/lib/typedefs .
/**
  * An atom allows you to treat a JSON value as atomic regardless of its type, ensuring that a JSON object or array is always returned in its entirety. The JSON value must be treated as immutable. Atoms can also be used to associate metadata with a JSON value. This metadata can be used to influence the way values are handled.
  **/
@js.native
trait Atom_ extends Sentinel {
  @JSName("$type")
  var $type: typingsSlinky.falcorJsonGraph.falcorJsonGraphStrings.atom = js.native
  var value: js.Any = js.native
}

object Atom_ {
  @scala.inline
  def apply($type: typingsSlinky.falcorJsonGraph.falcorJsonGraphStrings.atom, value: js.Any): Atom_ = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atom_]
  }
  @scala.inline
  implicit class Atom_Ops[Self <: Atom_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$type(value: typingsSlinky.falcorJsonGraph.falcorJsonGraphStrings.atom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

