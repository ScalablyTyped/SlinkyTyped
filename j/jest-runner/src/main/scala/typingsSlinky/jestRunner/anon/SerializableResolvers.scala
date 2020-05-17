package typingsSlinky.jestRunner.anon

import typingsSlinky.jestRunner.testWorkerMod.SerializableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableResolvers extends js.Object {
  var serializableResolvers: js.Array[SerializableResolver] = js.native
}

object SerializableResolvers {
  @scala.inline
  def apply(serializableResolvers: js.Array[SerializableResolver]): SerializableResolvers = {
    val __obj = js.Dynamic.literal(serializableResolvers = serializableResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableResolvers]
  }
  @scala.inline
  implicit class SerializableResolversOps[Self <: SerializableResolvers] (val x: Self) extends AnyVal {
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

