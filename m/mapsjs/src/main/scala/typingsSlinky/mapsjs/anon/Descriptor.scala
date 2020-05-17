package typingsSlinky.mapsjs.anon

import typingsSlinky.mapsjs.mod.tile.renderer
import typingsSlinky.mapsjs.mod.tile.requestor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptor extends js.Object {
  var descriptor: js.UndefOr[js.Any] = js.native
  var enableTileFadeIn: js.UndefOr[Boolean] = js.native
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.native
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[Unit]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var renderer: js.UndefOr[typingsSlinky.mapsjs.mod.tile.renderer] = js.native
  var requestProcessor: js.UndefOr[js.Any] = js.native
  var requestor: js.UndefOr[typingsSlinky.mapsjs.mod.tile.requestor] = js.native
  var retainInterlevelContent: js.UndefOr[Boolean] = js.native
  var tileBleedPix: js.UndefOr[Double] = js.native
  var useBackdrop: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object Descriptor {
  @scala.inline
  def apply(): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor]
  }
  @scala.inline
  implicit class DescriptorOps[Self <: Descriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTileFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTileFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTileFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTileFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyErrorAction(value: /* msg */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyErrorAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyErrorAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyErrorAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyLoadingQueueHasEmptiedAction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyLoadingQueueHasEmptiedAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifyLoadingQueueHasEmptiedAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyLoadingQueueHasEmptiedAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestProcessor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestor(value: requestor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestor")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainInterlevelContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainInterlevelContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainInterlevelContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainInterlevelContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTileBleedPix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileBleedPix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileBleedPix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileBleedPix")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

