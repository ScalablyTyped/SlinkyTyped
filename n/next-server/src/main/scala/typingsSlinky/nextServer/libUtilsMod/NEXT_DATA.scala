package typingsSlinky.nextServer.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nextServer.ErrorstatusCodenumber
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.native
  var buildId: String = js.native
  var dataManager: String = js.native
  var dynamicIds: js.UndefOr[js.Array[String]] = js.native
  var err: js.UndefOr[ErrorstatusCodenumber] = js.native
  var nextExport: js.UndefOr[Boolean] = js.native
  var page: String = js.native
  var props: js.Any = js.native
  var query: ParsedUrlQuery = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  var skeleton: js.UndefOr[Boolean] = js.native
}

object NEXT_DATA {
  @scala.inline
  def apply(buildId: String, dataManager: String, page: String, props: js.Any, query: ParsedUrlQuery): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEXT_DATA]
  }
  @scala.inline
  implicit class NEXT_DATAOps[Self <: NEXT_DATA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataManager(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: ParsedUrlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicIds")(js.undefined)
        ret
    }
    @scala.inline
    def withErr(value: ErrorstatusCodenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
    @scala.inline
    def withNextExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExport")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeConfig(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSkeleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkeleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(js.undefined)
        ret
    }
  }
  
}

