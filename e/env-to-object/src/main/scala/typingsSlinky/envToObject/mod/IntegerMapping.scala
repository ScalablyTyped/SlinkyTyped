package typingsSlinky.envToObject.mod

import typingsSlinky.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.envToObject.mod.Mapping because Already inherited */ @js.native
trait IntegerMapping extends GenericMapping {
  var radix: Double = js.native
  @JSName("type")
  var type_IntegerMapping: integer = js.native
}

object IntegerMapping {
  @scala.inline
  def apply(keypath: String, radix: Double, `type`: integer): IntegerMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerMapping]
  }
  @scala.inline
  implicit class IntegerMappingOps[Self <: IntegerMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

