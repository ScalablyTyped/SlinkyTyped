package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesGetTemplate extends Generic {
  var flat_settings: js.UndefOr[Boolean] = js.native
  var include_type_name: js.UndefOr[Boolean] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var name: js.UndefOr[String | js.Array[String]] = js.native
}

object IndicesGetTemplate {
  @scala.inline
  def apply(): IndicesGetTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetTemplate]
  }
  @scala.inline
  implicit class IndicesGetTemplateOps[Self <: IndicesGetTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat_settings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat_settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_settings")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_type_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_type_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_type_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_type_name")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster_timeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

