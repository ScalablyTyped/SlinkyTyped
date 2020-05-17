package typingsSlinky.graphqlQueryComplexity.anon

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Estimators extends js.Object {
  var estimators: js.Array[ComplexityEstimator] = js.native
  var query: DocumentNode = js.native
  var schema: GraphQLSchema = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object Estimators {
  @scala.inline
  def apply(estimators: js.Array[ComplexityEstimator], query: DocumentNode, schema: GraphQLSchema): Estimators = {
    val __obj = js.Dynamic.literal(estimators = estimators.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Estimators]
  }
  @scala.inline
  implicit class EstimatorsOps[Self <: Estimators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimators(value: js.Array[ComplexityEstimator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

