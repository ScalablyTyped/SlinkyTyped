package typingsSlinky.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBaseDefinition extends js.Object {
  var description: js.UndefOr[String | DescriptionDefinition] = js.native
}

object PropertyBaseDefinition {
  @scala.inline
  def apply(): PropertyBaseDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBaseDefinition]
  }
  @scala.inline
  implicit class PropertyBaseDefinitionOps[Self <: PropertyBaseDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String | DescriptionDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

