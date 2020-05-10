package typingsSlinky.googleDriveRealtimeApi.rtclient

import typingsSlinky.googleDriveRealtimeApi.AnonFileIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientUtils extends js.Object {
  var RealtimeLoader: RealtimeLoaderFactory = js.native
  // INCOMPLETE
  var params: AnonFileIds = js.native
  /**
  		 * Creates a new Realtime file.
  		 * @param title {string} title of the newly created file.
  		 * @param mimeType {string} the MIME type of the new file.
  		 * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
  		 */
  def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit = js.native
}

object ClientUtils {
  @scala.inline
  def apply(
    RealtimeLoader: RealtimeLoaderFactory,
    createRealtimeFile: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit,
    params: AnonFileIds
  ): ClientUtils = {
    val __obj = js.Dynamic.literal(RealtimeLoader = RealtimeLoader.asInstanceOf[js.Any], createRealtimeFile = js.Any.fromFunction3(createRealtimeFile), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUtils]
  }
  @scala.inline
  implicit class ClientUtilsOps[Self <: ClientUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRealtimeLoader(value: RealtimeLoaderFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealtimeLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRealtimeFile(value: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRealtimeFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParams(value: AnonFileIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

