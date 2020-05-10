package typingsSlinky.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discriminator extends js.Object {
  var property: String = js.native
  var subTypes: js.Array[JsonSubType] = js.native
}

object Discriminator {
  @scala.inline
  def apply(property: String, subTypes: js.Array[JsonSubType]): Discriminator = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discriminator]
  }
  @scala.inline
  implicit class DiscriminatorOps[Self <: Discriminator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTypes(value: js.Array[JsonSubType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

