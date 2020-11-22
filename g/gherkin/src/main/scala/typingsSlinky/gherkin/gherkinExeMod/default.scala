package typingsSlinky.gherkin.gherkinExeMod

import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typingsSlinky.gherkin.igherkinoptionsMod.IGherkinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/external/GherkinExe", JSImport.Default)
@js.native
class default protected () extends GherkinExe {
  def this(
    gherkinExe: String,
    paths: js.Array[String],
    envelopes: js.Array[IEnvelope],
    options: IGherkinOptions
  ) = this()
}
