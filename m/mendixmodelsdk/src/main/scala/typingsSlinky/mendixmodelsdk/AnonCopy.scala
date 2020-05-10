package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCopy extends js.Object {
  var copy: Element = js.native
  var idMap: IMap[Structure] = js.native
}

object AnonCopy {
  @scala.inline
  def apply(copy: Element, idMap: IMap[Structure]): AnonCopy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCopy]
  }
  @scala.inline
  implicit class AnonCopyOps[Self <: AnonCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdMap(value: IMap[Structure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

