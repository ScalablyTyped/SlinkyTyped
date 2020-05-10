package typingsSlinky.akuminaCore.igetlistrequestMod

import typingsSlinky.akuminaCore.ilanguagerequestMod.ILanguageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetListRequest extends js.Object {
  var PageManager: js.UndefOr[js.Any] = js.native
  var additionalSelectFields: String = js.native
  var contextSiteUrl: String = js.native
  var expandFields: String = js.native
  var hostUrl: String = js.native
  var isHosted: Boolean = js.native
  var isPagedResult: Boolean = js.native
  var isRoot: Boolean = js.native
  var language: js.UndefOr[ILanguageRequest] = js.native
  var listName: String = js.native
  var orderBy: js.UndefOr[js.Any] = js.native
  var personaCheckRequired: Boolean = js.native
  var postData: js.Object = js.native
  var preloadCallback: js.UndefOr[js.Any] = js.native
  var queryFilter: js.UndefOr[js.Any] = js.native
  var rowLimit: Double = js.native
  var selectFields: String = js.native
  var viewXml: String = js.native
}

object IGetListRequest {
  @scala.inline
  def apply(
    additionalSelectFields: String,
    contextSiteUrl: String,
    expandFields: String,
    hostUrl: String,
    isHosted: Boolean,
    isPagedResult: Boolean,
    isRoot: Boolean,
    listName: String,
    personaCheckRequired: Boolean,
    postData: js.Object,
    rowLimit: Double,
    selectFields: String,
    viewXml: String
  ): IGetListRequest = {
    val __obj = js.Dynamic.literal(additionalSelectFields = additionalSelectFields.asInstanceOf[js.Any], contextSiteUrl = contextSiteUrl.asInstanceOf[js.Any], expandFields = expandFields.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isPagedResult = isPagedResult.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], personaCheckRequired = personaCheckRequired.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], rowLimit = rowLimit.asInstanceOf[js.Any], selectFields = selectFields.asInstanceOf[js.Any], viewXml = viewXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetListRequest]
  }
  @scala.inline
  implicit class IGetListRequestOps[Self <: IGetListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalSelectFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSelectFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHosted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHosted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPagedResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPagedResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonaCheckRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaCheckRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageManager(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageManager")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: ILanguageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFilter")(js.undefined)
        ret
    }
  }
  
}

