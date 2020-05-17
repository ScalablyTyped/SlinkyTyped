package typingsSlinky.apolloCodegen.mod

import typingsSlinky.apolloCodegen.anon.AddTypename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-codegen", "generate")
@js.native
object generate extends js.Object {
  def apply(
    inputPaths: js.Array[String],
    schemaPath: String,
    outputPath: String,
    only: String,
    target: TargetType,
    tagName: String,
    projectName: String,
    options: AddTypename
  ): Unit = js.native
}

