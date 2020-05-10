package typingsSlinky.enhancedResolve.commonTypesMod

import typingsSlinky.enhancedResolve.descriptionFileUtilsMod.DescriptionFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRequest extends js.Object {
  var __innerRequest: js.UndefOr[String] = js.native
  var __innerRequest_relativePath: js.UndefOr[String] = js.native
  var __innerRequest_request: js.UndefOr[String] = js.native
  var context: ResolveContext = js.native
  var descriptionFileData: js.UndefOr[DescriptionFileData] = js.native
  var descriptionFilePath: js.UndefOr[String] = js.native
  var descriptionFileRoot: js.UndefOr[String] = js.native
  var directory: js.UndefOr[Boolean] = js.native
  var module: js.UndefOr[Boolean] = js.native
  var path: String = js.native
  var query: js.UndefOr[String] = js.native
  var relativePath: js.UndefOr[String] = js.native
  var request: String = js.native
}

object ResolverRequest {
  @scala.inline
  def apply(context: ResolveContext, path: String, request: String): ResolverRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRequest]
  }
  @scala.inline
  implicit class ResolverRequestOps[Self <: ResolverRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: ResolveContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__innerRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__innerRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest")(js.undefined)
        ret
    }
    @scala.inline
    def with__innerRequest_relativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest_relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__innerRequest_relativePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest_relativePath")(js.undefined)
        ret
    }
    @scala.inline
    def with__innerRequest_request(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__innerRequest_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__innerRequest_request")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFileData(value: DescriptionFileData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFileData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFileData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFileData")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFileRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFileRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFileRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFileRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(js.undefined)
        ret
    }
  }
  
}

