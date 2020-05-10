package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonContent extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Emitted while scrolling. This event is disabled by default. Look at the property: `scrollEvents`
    */
  var onIonScroll: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the scroll has ended.
    */
  var onIonScrollEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the scroll has started.
    */
  var onIonScrollStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: js.UndefOr[Boolean] = js.native
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: js.UndefOr[Boolean] = js.native
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: js.UndefOr[Boolean] = js.native
}

object IonContent {
  @scala.inline
  def apply(): IonContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonContent]
  }
  @scala.inline
  implicit class IonContentOps[Self <: IonContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withForceOverscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceOverscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceOverscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceOverscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonScroll(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonScrollEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScrollEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonScrollStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScrollStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonScrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(js.undefined)
        ret
    }
  }
  
}

