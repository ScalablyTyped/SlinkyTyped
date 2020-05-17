package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultComponents extends js.Object {
  var defaultComponents: Material = js.native
  var mappings: StringDictionary[js.Any] = js.native
}

object DefaultComponents {
  @scala.inline
  def apply(defaultComponents: Material, mappings: StringDictionary[js.Any]): DefaultComponents = {
    val __obj = js.Dynamic.literal(defaultComponents = defaultComponents.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  @scala.inline
  implicit class DefaultComponentsOps[Self <: DefaultComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultComponents(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappings(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

