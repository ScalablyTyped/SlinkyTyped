package typingsSlinky.graphqlCompose.interfaceTypeComposerMod

import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig[TSource, TContext]
*/
trait InterfaceTypeComposeDefinition[TSource, TContext] extends js.Object

object InterfaceTypeComposeDefinition {
  @scala.inline
  implicit def apply[TSource, TContext](value: ComposeInterfaceTypeConfig[TSource, TContext]): InterfaceTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[InterfaceTypeComposeDefinition[TSource, TContext]]
  @scala.inline
  implicit def apply[TSource, TContext](value: TypeAsString): InterfaceTypeComposeDefinition[TSource, TContext] = value.asInstanceOf[InterfaceTypeComposeDefinition[TSource, TContext]]
}

