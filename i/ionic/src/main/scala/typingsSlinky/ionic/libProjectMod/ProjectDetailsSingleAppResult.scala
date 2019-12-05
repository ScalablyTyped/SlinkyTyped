package typingsSlinky.ionic.libProjectMod

import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.ionicStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsSingleAppResult extends ProjectDetailsResultBase {
  val context: app
}

object ProjectDetailsSingleAppResult {
  @scala.inline
  def apply(context: app, errors: js.Array[ProjectDetailsError], `type`: ProjectType = null): ProjectDetailsSingleAppResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsSingleAppResult]
  }
}

