package typingsSlinky.jestRunner

import typingsSlinky.jestRunner.testWorkerMod.SerializableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSerializableResolvers extends js.Object {
  var serializableResolvers: js.Array[SerializableResolver] = js.native
}

object AnonSerializableResolvers {
  @scala.inline
  def apply(serializableResolvers: js.Array[SerializableResolver]): AnonSerializableResolvers = {
    val __obj = js.Dynamic.literal(serializableResolvers = serializableResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSerializableResolvers]
  }
  @scala.inline
  implicit class AnonSerializableResolversOps[Self <: AnonSerializableResolvers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializableResolvers(value: js.Array[SerializableResolver]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializableResolvers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

