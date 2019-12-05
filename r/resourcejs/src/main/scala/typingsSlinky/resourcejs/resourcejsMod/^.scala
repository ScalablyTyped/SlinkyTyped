package typingsSlinky.resourcejs.resourcejsMod

import typingsSlinky.express.expressMod.Application
import typingsSlinky.mongoose.mongooseMod.Document
import typingsSlinky.mongoose.mongooseMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resourcejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: Application, route: String, modelName: String, model: Model[Document, js.Object]): ResourceEndpoint = js.native
}

