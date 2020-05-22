package typingsSlinky.jestRunner.anon

import typingsSlinky.jestRunner.testWorkerMod.SerializableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableResolvers extends js.Object {
  var serializableResolvers: js.Array[SerializableResolver]
}

object SerializableResolvers {
  @scala.inline
  def apply(serializableResolvers: js.Array[SerializableResolver]): SerializableResolvers = {
    val __obj = js.Dynamic.literal(serializableResolvers = serializableResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableResolvers]
  }
}

