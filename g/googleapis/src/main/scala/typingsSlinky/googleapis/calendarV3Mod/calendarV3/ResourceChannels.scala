package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Channels")
@js.native
class ResourceChannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * calendar.channels.stop
    * @desc Stop watching resources through this channel
    * @alias calendar.channels.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsResourceChannelsStop,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def stop(params: ParamsResourceChannelsStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
}
