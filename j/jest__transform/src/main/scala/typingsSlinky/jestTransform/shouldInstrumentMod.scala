package typingsSlinky.jestTransform

import typingsSlinky.jestTransform.typesMod.ShouldInstrumentOptions
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/transform/build/shouldInstrument", JSImport.Namespace)
@js.native
object shouldInstrumentMod extends js.Object {
  
  def default(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
}
