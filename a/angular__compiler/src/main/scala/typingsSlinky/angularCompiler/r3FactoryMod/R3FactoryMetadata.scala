package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.angularCompilerStrings.invalid
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata
  - typingsSlinky.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata
  - typingsSlinky.angularCompiler.r3FactoryMod.R3DelegatedFnOrClassMetadata
  - typingsSlinky.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata
*/
trait R3FactoryMetadata extends js.Object

object R3FactoryMetadata {
  @scala.inline
  def R3ConstructorFactoryMetadata(
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3DelegatedFactoryMetadata(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3DelegatedFnOrClassMetadata(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: Class | Function,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
  @scala.inline
  def R3ExpressionFactoryMetadata(
    expression: Expression,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3FactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryMetadata]
  }
}

