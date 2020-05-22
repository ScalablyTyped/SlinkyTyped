package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.elementsMod.Element
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var copy: Element
  var idMap: IMap[Structure]
}

object Copy {
  @scala.inline
  def apply(copy: Element, idMap: IMap[Structure]): Copy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
}

