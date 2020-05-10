package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  var create: AnonParamsAnonActions = js.native
  var createSuite: AnonParamsAnonHeadsha = js.native
  var get: AnonParamsAnonCheckrunid = js.native
  var getSuite: AnonParamsAnonChecksuiteid = js.native
  var listAnnotations: AnonParamsAnonCheckrunidOwner = js.native
  var listForRef: AnonParamsAnonCheckname = js.native
  var listForSuite: AnonParamsAnonFilter = js.native
  var listSuitesForRef: AnonParamsAnonAppid = js.native
  var rerequestSuite: AnonParamsAnonChecksuiteid = js.native
  var setSuitesPreferences: AnonParamsAnonAutotriggerchecks = js.native
  var update: AnonParamsAnonActionsdescription = js.native
}

object AnonCreate {
  @scala.inline
  def apply(
    create: AnonParamsAnonActions,
    createSuite: AnonParamsAnonHeadsha,
    get: AnonParamsAnonCheckrunid,
    getSuite: AnonParamsAnonChecksuiteid,
    listAnnotations: AnonParamsAnonCheckrunidOwner,
    listForRef: AnonParamsAnonCheckname,
    listForSuite: AnonParamsAnonFilter,
    listSuitesForRef: AnonParamsAnonAppid,
    rerequestSuite: AnonParamsAnonChecksuiteid,
    setSuitesPreferences: AnonParamsAnonAutotriggerchecks,
    update: AnonParamsAnonActionsdescription
  ): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], createSuite = createSuite.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getSuite = getSuite.asInstanceOf[js.Any], listAnnotations = listAnnotations.asInstanceOf[js.Any], listForRef = listForRef.asInstanceOf[js.Any], listForSuite = listForSuite.asInstanceOf[js.Any], listSuitesForRef = listSuitesForRef.asInstanceOf[js.Any], rerequestSuite = rerequestSuite.asInstanceOf[js.Any], setSuitesPreferences = setSuitesPreferences.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
  @scala.inline
  implicit class AnonCreateOps[Self <: AnonCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonParamsAnonActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSuite(value: AnonParamsAnonHeadsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonParamsAnonCheckrunid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSuite(value: AnonParamsAnonChecksuiteid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAnnotations(value: AnonParamsAnonCheckrunidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForRef(value: AnonParamsAnonCheckname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForSuite(value: AnonParamsAnonFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSuitesForRef(value: AnonParamsAnonAppid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSuitesForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRerequestSuite(value: AnonParamsAnonChecksuiteid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerequestSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSuitesPreferences(value: AnonParamsAnonAutotriggerchecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuitesPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonActionsdescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

