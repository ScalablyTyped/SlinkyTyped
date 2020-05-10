package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * (default: internal ABR controller)
  * Customized Adaptive Bitrate Streaming Controller.
  */
@js.native
trait AbrController extends js.Object {
  /**
    * get: capping/max level value that could be used by ABR Controller
    * set: capping/max level value that could be used by ABR Controller
    */
  var autoLevelCapping: Double = js.native
  /**
    *  accumulated handled events
    */
  var handledEvents: js.Array[String] = js.native
  /**
    * current hls instance
    */
  var hls: Hls = js.native
  /**
    * last fragments corresponding level
    */
  var lastLoadedFragLevel: Double = js.native
  /**
    * get: next auto-quality levele/force next auto-quality level that should be returned
    * set: next auto-quality levele/force next auto-quality level that should be returned
    *  - currently used for emergency switch down
    */
  var nextAutoLevel: Double = js.native
  var useGenericHandler: Boolean = js.native
}

object AbrController {
  @scala.inline
  def apply(
    autoLevelCapping: Double,
    handledEvents: js.Array[String],
    hls: Hls,
    lastLoadedFragLevel: Double,
    nextAutoLevel: Double,
    useGenericHandler: Boolean
  ): AbrController = {
    val __obj = js.Dynamic.literal(autoLevelCapping = autoLevelCapping.asInstanceOf[js.Any], handledEvents = handledEvents.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], lastLoadedFragLevel = lastLoadedFragLevel.asInstanceOf[js.Any], nextAutoLevel = nextAutoLevel.asInstanceOf[js.Any], useGenericHandler = useGenericHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbrController]
  }
  @scala.inline
  implicit class AbrControllerOps[Self <: AbrController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLevelCapping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLevelCapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandledEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handledEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHls(value: Hls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastLoadedFragLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoadedFragLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextAutoLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAutoLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseGenericHandler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGenericHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

