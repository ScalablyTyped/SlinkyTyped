package typingsSlinky.jestTransform

import typingsSlinky.jestTransform.enhanceUnexpectedTokenMessageMod.ErrorWithCodeFrame
import typingsSlinky.jestTransform.scriptTransformerMod.default
import typingsSlinky.jestTransform.typesMod.ShouldInstrumentOptions
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/transform", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createTranspilingRequire(config: ProjectConfig): js.Function2[/* resolverPath */ String, /* applyInteropRequireDefault */ js.UndefOr[Boolean], _] = js.native
  
  def handlePotentialSyntaxError(e: ErrorWithCodeFrame): ErrorWithCodeFrame = js.native
  
  def shouldInstrument(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
  
  @js.native
  class ScriptTransformer protected () extends default {
    def this(config: ProjectConfig) = this()
  }
}
