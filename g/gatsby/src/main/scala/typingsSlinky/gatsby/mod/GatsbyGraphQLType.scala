package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.ENUM
import typingsSlinky.gatsby.gatsbyStrings.INPUT_OBJECT
import typingsSlinky.gatsby.gatsbyStrings.INTERFACE
import typingsSlinky.gatsby.gatsbyStrings.OBJECT
import typingsSlinky.gatsby.gatsbyStrings.SCALAR
import typingsSlinky.gatsby.gatsbyStrings.UNION
import typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typingsSlinky.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gatsby.mod.GatsbyGraphQLObjectType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLInputObjectType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLUnionType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLInterfaceType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLEnumType
  - typingsSlinky.gatsby.mod.GatsbyGraphQLScalarType
*/
trait GatsbyGraphQLType extends js.Object

object GatsbyGraphQLType {
  @scala.inline
  def GatsbyGraphQLScalarType(config: ComposeScalarTypeConfig, kind: SCALAR): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInterfaceType(config: ComposeInterfaceTypeConfig[_, _], kind: INTERFACE): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLUnionType(config: ComposeUnionTypeConfig[_, _], kind: UNION): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLObjectType(config: ComposeObjectTypeConfig[_, _], kind: OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInputObjectType(config: ComposeInputObjectTypeConfig, kind: INPUT_OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLEnumType(config: ComposeEnumTypeConfig, kind: ENUM): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
}

