package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Questmilestones")
@js.native
class ResourceQuestmilestones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * games.questMilestones.claim
    * @desc Report that a reward for the milestone corresponding to milestoneId
    * for the quest corresponding to questId has been claimed by the currently
    * authorized user.
    * @alias games.questMilestones.claim
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.milestoneId The ID of the milestone.
    * @param {string} params.questId The ID of the quest.
    * @param {string} params.requestId A numeric ID to ensure that the request is handled correctly across retries. Your client application must generate this ID randomly.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def claim(): GaxiosPromise[Unit] = js.native
  def claim(callback: BodyResponseCallback[Unit]): Unit = js.native
  def claim(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def claim(params: ParamsResourceQuestmilestonesClaim): GaxiosPromise[Unit] = js.native
  def claim(params: ParamsResourceQuestmilestonesClaim, callback: BodyResponseCallback[Unit]): Unit = js.native
  def claim(
    params: ParamsResourceQuestmilestonesClaim,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def claim(params: ParamsResourceQuestmilestonesClaim, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def claim(
    params: ParamsResourceQuestmilestonesClaim,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
