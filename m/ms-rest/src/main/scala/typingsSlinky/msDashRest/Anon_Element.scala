package typingsSlinky.msDashRest

import typingsSlinky.msDashRest.msDashRestMod.Mapper
import typingsSlinky.msDashRest.msDashRestMod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: Mapper
  var name: MapperType
}

object Anon_Element {
  @scala.inline
  def apply(element: Mapper, name: MapperType): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Element]
  }
}

