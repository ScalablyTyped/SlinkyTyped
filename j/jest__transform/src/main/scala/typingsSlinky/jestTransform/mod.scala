package typingsSlinky.jestTransform

import typingsSlinky.jestTransform.jestTransformStrings.ObjectDotLessthansignanonymousGreaterthansign
import typingsSlinky.jestTransform.scriptTransformerMod.default
import typingsSlinky.jestTransform.typesMod.ShouldInstrumentOptions
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ScriptTransformer protected () extends default {
    def this(config: ProjectConfig) = this()
  }
  
  def shouldInstrument(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
  /* static members */
  @js.native
  object ScriptTransformer extends js.Object {
    var EVAL_RESULT_VARIABLE: ObjectDotLessthansignanonymousGreaterthansign = js.native
  }
  
}

