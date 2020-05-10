package typingsSlinky.graphqlTools.wrapQueryMod

import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Result
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapQuery extends Transform {
  var extractor: js.Any = js.native
  var path: js.Any = js.native
  var wrapper: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapQuery(originalRequest: Request): Request = js.native
  @JSName("transformResult")
  def transformResult_MWrapQuery(originalResult: Result): Result = js.native
}

object WrapQuery {
  @scala.inline
  def apply(
    extractor: js.Any,
    path: js.Any,
    transformRequest: Request => Request,
    transformResult: Result => Result,
    wrapper: js.Any
  ): WrapQuery = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapQuery]
  }
  @scala.inline
  implicit class WrapQueryOps[Self <: WrapQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformRequest(value: Request => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformResult(value: Result => Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrapper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

