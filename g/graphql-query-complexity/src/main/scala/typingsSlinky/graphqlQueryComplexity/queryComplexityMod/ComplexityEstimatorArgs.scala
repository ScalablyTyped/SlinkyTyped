package typingsSlinky.graphqlQueryComplexity.queryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexityEstimatorArgs extends js.Object {
  var args: StringDictionary[js.Any] = js.native
  var childComplexity: Double = js.native
  var field: GraphQLField[_, _, StringDictionary[_]] = js.native
  var `type`: GraphQLCompositeType = js.native
}

object ComplexityEstimatorArgs {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    childComplexity: Double,
    field: GraphQLField[_, _, StringDictionary[_]],
    `type`: GraphQLCompositeType
  ): ComplexityEstimatorArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], childComplexity = childComplexity.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexityEstimatorArgs]
  }
  @scala.inline
  implicit class ComplexityEstimatorArgsOps[Self <: ComplexityEstimatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildComplexity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childComplexity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: GraphQLField[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GraphQLCompositeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

