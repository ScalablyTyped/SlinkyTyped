package typingsSlinky.linkifyjs

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.linkifyjs.linkifyjsStrings.abort
import typingsSlinky.std.Event_
import typingsSlinky.std.OnErrorEventHandler
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.GlobalEventHandlers> */
@js.native
trait PartialGlobalEventHandler extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.native
  var onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  var onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.native
  var onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  var oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.native
  var ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onerror: js.UndefOr[OnErrorEventHandler] = js.native
  var onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.native
  var ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.native
  var onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.native
  var onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.native
  var onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]] = js.native
  var onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.native
  var onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.native
  var onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.native
  var ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.native
  var onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.native
  var onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.native
  var removeEventListener: js.UndefOr[
    js.Function2[
      abort, 
      /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _], 
      Unit
    ]
  ] = js.native
}

object PartialGlobalEventHandler {
  @scala.inline
  def apply(): PartialGlobalEventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGlobalEventHandler]
  }
  @scala.inline
  implicit class PartialGlobalEventHandlerOps[Self <: PartialGlobalEventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(
      value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withOnabort(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnabort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationiteration(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationiteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationiteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationiteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnanimationstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ AnimationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnanimationstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanimationstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnauxclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onauxclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnauxclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onauxclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnblur(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOncanplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncanplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOncanplaythrough(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplaythrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncanplaythrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplaythrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
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
    def withOncontextmenu(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncontextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOncuechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncuechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncuechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncuechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOndblclick(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrag(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragexit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragexit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragexit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragexit")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrop(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ DragEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOndurationchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondurationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOndurationchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondurationchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnemptied(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onemptied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnemptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onemptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnended(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onended")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(
      value: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(null)
        ret
    }
    @scala.inline
    def withOnfocus(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ FocusEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOngotpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongotpointercapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOngotpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongotpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOninput(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(js.undefined)
        ret
    }
    @scala.inline
    def withOninvalid(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOninvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeydown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeypress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeyup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ KeyboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadeddata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadeddata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadeddata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadeddata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadedmetadata(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadedmetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadedmetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadedmetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlostpointercapture(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlostpointercapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlostpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlostpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousedown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousemove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ MouseEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpause(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplay(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnplaying(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnplaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointercancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointercancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerdown(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerdown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerenter(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerleave(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointermove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointermove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerout(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerover(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpointerup(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ PointerEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpointerup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprogress(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ ProgressEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnratechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onratechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnratechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onratechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreset(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnresize(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]): Self = {
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
    def withOnscroll(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsecuritypolicyviolation(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ SecurityPolicyViolationEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsecuritypolicyviolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsecuritypolicyviolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsecuritypolicyviolation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnseeked(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnseeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnseeking(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnseeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselect(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselectionchange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectionchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselectionchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectionchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselectstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselectstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnstalled(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsubmit(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsuspend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntimeupdate(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntimeupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOntoggle(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontoggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntoggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontoggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchcancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchmove(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TouchEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitioncancel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitioncancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitioncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitioncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionend(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionrun(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionrun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionrun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionrun")(js.undefined)
        ret
    }
    @scala.inline
    def withOntransitionstart(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ TransitionEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOntransitionstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontransitionstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnvolumechange(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnvolumechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwaiting(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnwaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwheel(value: js.ThisFunction1[PartialGlobalEventHandler, /* ev */ WheelEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnwheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwheel")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEventListener(
      value: (abort, /* listener */ js.ThisFunction1[PartialGlobalEventHandler, /* ev */ UIEvent, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.undefined)
        ret
    }
  }
  
}

