package typingsSlinky.gherkin

import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGherkinDocument
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickle
import typingsSlinky.cucumberMessages.idGeneratorMod.NewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/pickles/compile", JSImport.Namespace)
@js.native
object compileMod extends js.Object {
  
  def default(gherkinDocument: IGherkinDocument, uri: String, newId: NewId): js.Array[IPickle] = js.native
}
