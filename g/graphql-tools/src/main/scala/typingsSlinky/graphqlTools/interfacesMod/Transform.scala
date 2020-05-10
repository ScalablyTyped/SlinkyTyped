package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  var transformRequest: js.UndefOr[js.Function1[/* originalRequest */ Request, Request]] = js.native
  var transformResult: js.UndefOr[js.Function1[/* result */ Result, Result]] = js.native
  var transformSchema: js.UndefOr[js.Function1[/* schema */ GraphQLSchema, GraphQLSchema]] = js.native
}

object Transform {
  @scala.inline
  def apply(): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformRequest(value: /* originalRequest */ Request => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformResult(value: /* result */ Result => Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformSchema(value: /* schema */ GraphQLSchema => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.undefined)
        ret
    }
  }
  
}

