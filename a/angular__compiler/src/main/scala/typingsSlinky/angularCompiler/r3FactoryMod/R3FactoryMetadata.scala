package typingsSlinky.angularCompiler.r3FactoryMod

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
  implicit def apply(value: R3ConstructorFactoryMetadata): R3FactoryMetadata = value.asInstanceOf[R3FactoryMetadata]
  @scala.inline
  implicit def apply(value: R3DelegatedFactoryMetadata): R3FactoryMetadata = value.asInstanceOf[R3FactoryMetadata]
  @scala.inline
  implicit def apply(value: R3DelegatedFnOrClassMetadata): R3FactoryMetadata = value.asInstanceOf[R3FactoryMetadata]
  @scala.inline
  implicit def apply(value: R3ExpressionFactoryMetadata): R3FactoryMetadata = value.asInstanceOf[R3FactoryMetadata]
}

