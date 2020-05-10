package typingsSlinky.next.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.next.ErrorstatusCodenumber
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.native
  var autoExport: js.UndefOr[Boolean] = js.native
  var buildId: String = js.native
  var customServer: js.UndefOr[Boolean] = js.native
  var dynamicIds: js.UndefOr[js.Array[String]] = js.native
  var err: js.UndefOr[ErrorstatusCodenumber] = js.native
  var gsp: js.UndefOr[Boolean] = js.native
  var gssp: js.UndefOr[Boolean] = js.native
  var isFallback: js.UndefOr[Boolean] = js.native
  var nextExport: js.UndefOr[Boolean] = js.native
  var page: String = js.native
  var props: js.Any = js.native
  var query: ParsedUrlQuery = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object NEXT_DATA {
  @scala.inline
  def apply(buildId: String, page: String, props: js.Any, query: ParsedUrlQuery): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
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
    def withAutoExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExport")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customServer")(js.undefined)
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
    def withGsp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gsp")(js.undefined)
        ret
    }
    @scala.inline
    def withGssp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gssp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGssp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gssp")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(js.undefined)
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
  }
  
}

