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

@js.native
trait NodePluginSchema extends js.Object {
  def buildEnumType(config: ComposeEnumTypeConfig): GatsbyGraphQLEnumType = js.native
  def buildInputObjectType(config: ComposeInputObjectTypeConfig): GatsbyGraphQLInputObjectType = js.native
  def buildInterfaceType(config: ComposeInterfaceTypeConfig[_, _]): GatsbyGraphQLInterfaceType = js.native
  def buildObjectType(config: ComposeObjectTypeConfig[_, _]): GatsbyGraphQLObjectType = js.native
  def buildScalarType(config: ComposeScalarTypeConfig): GatsbyGraphQLScalarType = js.native
  def buildUnionType(config: ComposeUnionTypeConfig[_, _]): GatsbyGraphQLUnionType = js.native
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
  @scala.inline
  implicit class NodePluginSchemaOps[Self <: NodePluginSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildEnumType(value: ComposeEnumTypeConfig => GatsbyGraphQLEnumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildEnumType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildInputObjectType(value: ComposeInputObjectTypeConfig => GatsbyGraphQLInputObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildInputObjectType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildInterfaceType(value: ComposeInterfaceTypeConfig[_, _] => GatsbyGraphQLInterfaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildInterfaceType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildObjectType(value: ComposeObjectTypeConfig[_, _] => GatsbyGraphQLObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildObjectType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildScalarType(value: ComposeScalarTypeConfig => GatsbyGraphQLScalarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildScalarType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildUnionType(value: ComposeUnionTypeConfig[_, _] => GatsbyGraphQLUnionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUnionType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

