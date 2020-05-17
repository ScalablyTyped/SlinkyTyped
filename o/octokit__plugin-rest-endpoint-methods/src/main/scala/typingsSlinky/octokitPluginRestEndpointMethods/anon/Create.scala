package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  var create: ParamsActions = js.native
  var createSuite: ParamsHeadsha = js.native
  var get: ParamsCheckrunid = js.native
  var getSuite: ParamsChecksuiteid = js.native
  var listAnnotations: ParamsCheckrunidOwner = js.native
  var listForRef: ParamsCheckname = js.native
  var listForSuite: ParamsFilter = js.native
  var listSuitesForRef: ParamsAppid = js.native
  var rerequestSuite: ParamsChecksuiteid = js.native
  var setSuitesPreferences: ParamsAutotriggerchecks = js.native
  var update: ParamsActionsdescription = js.native
}

object Create {
  @scala.inline
  def apply(
    create: ParamsActions,
    createSuite: ParamsHeadsha,
    get: ParamsCheckrunid,
    getSuite: ParamsChecksuiteid,
    listAnnotations: ParamsCheckrunidOwner,
    listForRef: ParamsCheckname,
    listForSuite: ParamsFilter,
    listSuitesForRef: ParamsAppid,
    rerequestSuite: ParamsChecksuiteid,
    setSuitesPreferences: ParamsAutotriggerchecks,
    update: ParamsActionsdescription
  ): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], createSuite = createSuite.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getSuite = getSuite.asInstanceOf[js.Any], listAnnotations = listAnnotations.asInstanceOf[js.Any], listForRef = listForRef.asInstanceOf[js.Any], listForSuite = listForSuite.asInstanceOf[js.Any], listSuitesForRef = listSuitesForRef.asInstanceOf[js.Any], rerequestSuite = rerequestSuite.asInstanceOf[js.Any], setSuitesPreferences = setSuitesPreferences.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: ParamsActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSuite(value: ParamsHeadsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsCheckrunid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSuite(value: ParamsChecksuiteid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAnnotations(value: ParamsCheckrunidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForRef(value: ParamsCheckname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForSuite(value: ParamsFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSuitesForRef(value: ParamsAppid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSuitesForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRerequestSuite(value: ParamsChecksuiteid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerequestSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSuitesPreferences(value: ParamsAutotriggerchecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuitesPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsActionsdescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

