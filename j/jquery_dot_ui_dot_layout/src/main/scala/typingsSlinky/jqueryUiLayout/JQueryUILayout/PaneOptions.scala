package typingsSlinky.jqueryUiLayout.JQueryUILayout

import typingsSlinky.jquery.JQueryAnimationOptions
import typingsSlinky.jqueryUiLayout.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneOptions extends js.Object {
  var applyDefaultStyles: js.UndefOr[Boolean] = js.native
  var buttonClass: js.UndefOr[String] = js.native
  var closable: js.UndefOr[Boolean] = js.native
  var contentIgnoreSelector: js.UndefOr[String] = js.native
  var contentSelector: js.UndefOr[String] = js.native
  var customHotkey: js.UndefOr[String | Double] = js.native
  var customHotkeyModifier: js.UndefOr[String] = js.native
  var enableCursorHotkey: js.UndefOr[Boolean] = js.native
  var fxName: js.UndefOr[String] = js.native
  var fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
  var fxSpeed: js.UndefOr[String | Double] = js.native
  var hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
  var initClosed: js.UndefOr[Boolean] = js.native
  var initHidden: js.UndefOr[Boolean] = js.native
  var maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.native
  var onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.native
  var onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.native
  var onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.native
  var onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.native
  var onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.native
  var paneClass: js.UndefOr[String] = js.native
  var paneSelector: js.UndefOr[String] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resizerClass: js.UndefOr[String] = js.native
  var resizerCursor: js.UndefOr[String] = js.native
  var resizerDragOpacity: js.UndefOr[Double] = js.native
  var resizerTip: js.UndefOr[String] = js.native
  var scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
  var showOverflowOnHover: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String | Double] = js.native
  var slidable: js.UndefOr[Boolean] = js.native
  var slideTrigger_close: js.UndefOr[String] = js.native
  var slideTrigger_open: js.UndefOr[String] = js.native
  var sliderCursor: js.UndefOr[String] = js.native
  var sliderTip: js.UndefOr[String] = js.native
  var spacing_closed: js.UndefOr[Double] = js.native
  var spacing_open: js.UndefOr[Double] = js.native
  var togglerAlign_closed: js.UndefOr[String | Double] = js.native
  var togglerAlign_open: js.UndefOr[String | Double] = js.native
  var togglerClass: js.UndefOr[String] = js.native
  var togglerContent_closed: js.UndefOr[String] = js.native
  var togglerContent_open: js.UndefOr[String] = js.native
  var togglerLength_closed: js.UndefOr[Double | String] = js.native
  var togglerLength_open: js.UndefOr[Double | String] = js.native
  var togglerTip_closed: js.UndefOr[String] = js.native
  var togglerTip_open: js.UndefOr[String] = js.native
}

object PaneOptions {
  @scala.inline
  def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  @scala.inline
  implicit class PaneOptionsOps[Self <: PaneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyDefaultStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDefaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyDefaultStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDefaultStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withContentIgnoreSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIgnoreSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentIgnoreSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIgnoreSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withContentSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHotkey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHotkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHotkey")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHotkeyModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHotkeyModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHotkeyModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHotkeyModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCursorHotkey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCursorHotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCursorHotkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCursorHotkey")(js.undefined)
        ret
    }
    @scala.inline
    def withFxName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFxName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxName")(js.undefined)
        ret
    }
    @scala.inline
    def withFxSettings(value: JQueryAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFxSpeed(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFxSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTogglerOnSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTogglerOnSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTogglerOnSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTogglerOnSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withInitClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withInitHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskIframesOnResize(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskIframesOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskIframesOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskIframesOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOncloseFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnclose(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_end")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnclose_end(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_end")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_start")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnclose_start(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose_start")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhideFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnhide(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnhide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhide_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_end")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnhide_end(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnhide_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_end")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhide_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_start")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnhide_start(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnhide_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide_start")(js.undefined)
        ret
    }
    @scala.inline
    def withOnopenFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnopen(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnopen_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_end")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnopen_end(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnopen_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_end")(js.undefined)
        ret
    }
    @scala.inline
    def withOnopen_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_start")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnopen_start(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnopen_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen_start")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresizeFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnresize(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_end")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnresize_end(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresize_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_end")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_start")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnresize_start(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnresize_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onresize_start")(js.undefined)
        ret
    }
    @scala.inline
    def withOnshowFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnshow(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnshow_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_end")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnshow_end(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnshow_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_end")(js.undefined)
        ret
    }
    @scala.inline
    def withOnshow_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_start")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnshow_start(
      value: String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnshow_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow_start")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaneClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaneSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerDragOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerDragOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerDragOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerDragOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerTip")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToBookmarkOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToBookmarkOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToBookmarkOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToBookmarkOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverflowOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverflowOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverflowOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidable")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideTrigger_close(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTrigger_close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideTrigger_close: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTrigger_close")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideTrigger_open(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTrigger_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideTrigger_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTrigger_open")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderTip")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing_closed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing_open(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_open")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerAlign_closed(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerAlign_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerAlign_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerAlign_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerAlign_open(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerAlign_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerAlign_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerAlign_open")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerContent_closed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerContent_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerContent_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerContent_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerContent_open(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerContent_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerContent_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerContent_open")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerLength_closed(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerLength_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerLength_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerLength_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerLength_open(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerLength_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerLength_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerLength_open")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerTip_closed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerTip_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerTip_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerTip_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglerTip_open(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerTip_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglerTip_open: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglerTip_open")(js.undefined)
        ret
    }
  }
  
}

