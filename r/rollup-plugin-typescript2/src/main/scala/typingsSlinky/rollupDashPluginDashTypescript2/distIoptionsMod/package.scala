package typingsSlinky.rollupDashPluginDashTypescript2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIoptionsMod {
  import typingsSlinky.typescript.typescriptMod.CustomTransformers
  import typingsSlinky.typescript.typescriptMod.LanguageService

  type TransformerFactoryCreator = js.Function1[/* ls */ LanguageService, CustomTransformers | ICustomTransformer]
}
