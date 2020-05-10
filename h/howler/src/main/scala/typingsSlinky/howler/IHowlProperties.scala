package typingsSlinky.howler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHowlProperties extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[js.Array[String] | String] = js.native
  var html5: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var mute: js.UndefOr[Boolean] = js.native
  var onend: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onfade: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onload: js.UndefOr[js.Function0[Unit]] = js.native
  var onloaderror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.native
  var onmute: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onpause: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onplay: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onplayerror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.native
  var onrate: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onseek: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onstop: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onunlock: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var onvolume: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.native
  var pool: js.UndefOr[Double] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var rate: js.UndefOr[Double] = js.native
  var sprite: js.UndefOr[IHowlSoundSpriteDefinition] = js.native
  var src: String | js.Array[String] = js.native
  var volume: js.UndefOr[Double] = js.native
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}

object IHowlProperties {
  @scala.inline
  def apply(src: String | js.Array[String]): IHowlProperties = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHowlProperties]
  }
  @scala.inline
  implicit class IHowlPropertiesOps[Self <: IHowlProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(js.undefined)
        ret
    }
    @scala.inline
    def withOnend(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfade(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnfade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfade")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloaderror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloaderror")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnloaderror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloaderror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmute(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmute")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpause(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnpause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplay(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplayerror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplayerror")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnplayerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplayerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnrate(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnseek(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnseek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseek")(js.undefined)
        ret
    }
    @scala.inline
    def withOnstop(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnstop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnunlock(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunlock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnunlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunlock")(js.undefined)
        ret
    }
    @scala.inline
    def withOnvolume(value: /* soundId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnvolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolume")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(value: IHowlSoundSpriteDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(js.undefined)
        ret
    }
  }
  
}

