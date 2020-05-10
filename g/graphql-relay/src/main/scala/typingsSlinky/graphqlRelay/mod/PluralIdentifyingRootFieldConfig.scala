package typingsSlinky.graphqlRelay.mod

import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralIdentifyingRootFieldConfig extends js.Object {
  var argName: String = js.native
  var description: js.UndefOr[String] = js.native
  var inputType: GraphQLInputType = js.native
  var outputType: GraphQLOutputType = js.native
  def resolveSingleInput(input: js.Any, context: js.Any, info: GraphQLResolveInfo): js.Any = js.native
}

object PluralIdentifyingRootFieldConfig {
  @scala.inline
  def apply(
    argName: String,
    inputType: GraphQLInputType,
    outputType: GraphQLOutputType,
    resolveSingleInput: (js.Any, js.Any, GraphQLResolveInfo) => js.Any
  ): PluralIdentifyingRootFieldConfig = {
    val __obj = js.Dynamic.literal(argName = argName.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], resolveSingleInput = js.Any.fromFunction3(resolveSingleInput))
    __obj.asInstanceOf[PluralIdentifyingRootFieldConfig]
  }
  @scala.inline
  implicit class PluralIdentifyingRootFieldConfigOps[Self <: PluralIdentifyingRootFieldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputType(value: GraphQLInputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputType(value: GraphQLOutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveSingleInput(value: (js.Any, js.Any, GraphQLResolveInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveSingleInput")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

