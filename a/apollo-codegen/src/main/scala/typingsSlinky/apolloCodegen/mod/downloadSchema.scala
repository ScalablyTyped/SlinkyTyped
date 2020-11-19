package typingsSlinky.apolloCodegen.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-codegen", "downloadSchema")
@js.native
object downloadSchema extends js.Object {
  
  def apply(
    url: String,
    outputPath: String,
    additionalHeaders: StringDictionary[String],
    insecure: Boolean,
    method: String
  ): js.Promise[Unit] = js.native
}
