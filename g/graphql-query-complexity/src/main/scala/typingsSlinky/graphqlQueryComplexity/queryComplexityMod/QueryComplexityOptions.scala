package typingsSlinky.graphqlQueryComplexity.queryComplexityMod

import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexityOptions extends js.Object {
  var createError: js.UndefOr[js.Function2[/* max */ Double, /* actual */ Double, GraphQLError]] = js.native
  var estimators: js.UndefOr[js.Array[ComplexityEstimator]] = js.native
  var maximumComplexity: Double = js.native
  var onComplete: js.UndefOr[js.Function1[/* complexity */ Double, Unit]] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object QueryComplexityOptions {
  @scala.inline
  def apply(maximumComplexity: Double): QueryComplexityOptions = {
    val __obj = js.Dynamic.literal(maximumComplexity = maximumComplexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComplexityOptions]
  }
  @scala.inline
  implicit class QueryComplexityOptionsOps[Self <: QueryComplexityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumComplexity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumComplexity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateError(value: (/* max */ Double, /* actual */ Double) => GraphQLError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createError")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimators(value: js.Array[ComplexityEstimator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimators")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* complexity */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
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

