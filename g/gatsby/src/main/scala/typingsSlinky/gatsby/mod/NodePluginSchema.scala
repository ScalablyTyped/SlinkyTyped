package typingsSlinky.gatsby.mod

import typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typingsSlinky.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginSchema extends js.Object {
  def buildEnumType(config: ComposeEnumTypeConfig): GatsbyGraphQLEnumType
  def buildInputObjectType(config: ComposeInputObjectTypeConfig): GatsbyGraphQLInputObjectType
  def buildInterfaceType(config: ComposeInterfaceTypeConfig[_, _]): GatsbyGraphQLInterfaceType
  def buildObjectType(config: ComposeObjectTypeConfig[_, _]): GatsbyGraphQLObjectType
  def buildScalarType(config: ComposeScalarTypeConfig): GatsbyGraphQLScalarType
  def buildUnionType(config: ComposeUnionTypeConfig[_, _]): GatsbyGraphQLUnionType
}

object NodePluginSchema {
  @scala.inline
  def apply(
    buildEnumType: ComposeEnumTypeConfig => GatsbyGraphQLEnumType,
    buildInputObjectType: ComposeInputObjectTypeConfig => GatsbyGraphQLInputObjectType,
    buildInterfaceType: ComposeInterfaceTypeConfig[_, _] => GatsbyGraphQLInterfaceType,
    buildObjectType: ComposeObjectTypeConfig[_, _] => GatsbyGraphQLObjectType,
    buildScalarType: ComposeScalarTypeConfig => GatsbyGraphQLScalarType,
    buildUnionType: ComposeUnionTypeConfig[_, _] => GatsbyGraphQLUnionType
  ): NodePluginSchema = {
    val __obj = js.Dynamic.literal(buildEnumType = js.Any.fromFunction1(buildEnumType), buildInputObjectType = js.Any.fromFunction1(buildInputObjectType), buildInterfaceType = js.Any.fromFunction1(buildInterfaceType), buildObjectType = js.Any.fromFunction1(buildObjectType), buildScalarType = js.Any.fromFunction1(buildScalarType), buildUnionType = js.Any.fromFunction1(buildUnionType))
    __obj.asInstanceOf[NodePluginSchema]
  }
}

