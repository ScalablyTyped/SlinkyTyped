package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.angularCompilerStrings.invalid
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression
  var delegateType: Factory
}

object R3DelegatedFactoryMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3DelegatedFactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFactoryMetadata]
  }
}

