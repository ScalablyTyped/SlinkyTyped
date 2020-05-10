package typingsSlinky.aframe

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultComponents extends js.Object {
  var defaultComponents: AnonMaterial = js.native
  var mappings: StringDictionary[js.Any] = js.native
}

object AnonDefaultComponents {
  @scala.inline
  def apply(defaultComponents: AnonMaterial, mappings: StringDictionary[js.Any]): AnonDefaultComponents = {
    val __obj = js.Dynamic.literal(defaultComponents = defaultComponents.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultComponents]
  }
  @scala.inline
  implicit class AnonDefaultComponentsOps[Self <: AnonDefaultComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultComponents(value: AnonMaterial): Self = {
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

