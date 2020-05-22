package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: ParamsActions
  var createSuite: ParamsHeadsha
  var get: ParamsCheckrunid
  var getSuite: ParamsChecksuiteid
  var listAnnotations: ParamsCheckrunidOwner
  var listForRef: ParamsCheckname
  var listForSuite: ParamsFilter
  var listSuitesForRef: ParamsAppid
  var rerequestSuite: ParamsChecksuiteid
  var setSuitesPreferences: ParamsAutotriggerchecks
  var update: ParamsActionsdescription
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
}

