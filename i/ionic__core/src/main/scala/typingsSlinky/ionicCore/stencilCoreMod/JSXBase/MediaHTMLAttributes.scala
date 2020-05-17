package typingsSlinky.ionicCore.stencilCoreMod.JSXBase

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var crossorigin: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var mediagroup: js.UndefOr[String] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  // https://developer.mozilla.org/en-US/docs/Web/Guide/Events/Media_events
  var onAbort: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onCanPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onDurationChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onEmptied: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onEnded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInterruptBegin: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInterruptEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadedData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadedMetaData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMozAudioAvailable: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onPause: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onPlaying: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onRateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSeeking: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onStalled: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSuspend: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onWaiting: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var preload: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  @scala.inline
  implicit class MediaHTMLAttributesOps[Self[t] <: MediaHTMLAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAutoPlay(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaGroup(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaGroup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInterruptBegin(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInterruptBegin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInterruptEnd(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInterruptEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInterruptEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetaData(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetaData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetaData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetaData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMozAudioAvailable(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMozAudioAvailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMozAudioAvailable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMozAudioAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: /* event */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

