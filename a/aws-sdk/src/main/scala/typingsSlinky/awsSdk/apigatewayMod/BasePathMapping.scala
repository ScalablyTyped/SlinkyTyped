package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePathMapping extends js.Object {
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.native
  /**
    * The name of the associated stage.
    */
  var stage: js.UndefOr[String] = js.native
}

object BasePathMapping {
  @scala.inline
  def apply(): BasePathMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePathMapping]
  }
  @scala.inline
  implicit class BasePathMappingOps[Self <: BasePathMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(js.undefined)
        ret
    }
    @scala.inline
    def withStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
  }
  
}

