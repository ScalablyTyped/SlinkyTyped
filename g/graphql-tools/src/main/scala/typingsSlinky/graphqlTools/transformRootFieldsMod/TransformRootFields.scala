package typingsSlinky.graphqlTools.transformRootFieldsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformRootFields extends Transform {
  var transform: js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MTransformRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object TransformRootFields {
  @scala.inline
  def apply(transform: js.Any, transformSchema: GraphQLSchema => GraphQLSchema): TransformRootFields = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[TransformRootFields]
  }
  @scala.inline
  implicit class TransformRootFieldsOps[Self <: TransformRootFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

