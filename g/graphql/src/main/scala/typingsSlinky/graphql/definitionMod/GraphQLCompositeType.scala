package typingsSlinky.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
  - typingsSlinky.graphql.definitionMod.GraphQLUnionType
*/
trait GraphQLCompositeType extends js.Object

object GraphQLCompositeType {
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLCompositeType = value.asInstanceOf[GraphQLCompositeType]
}

