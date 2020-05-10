package typingsSlinky.phosphorVirtualdom.mod

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.std.Event_
import typingsSlinky.std.MediaStreamErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {readonly [ T in keyof @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap[T]): any} */
@js.native
trait ElementEventAttrs extends js.Object {
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.native
  val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.native
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.native
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  val onprogress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]] = js.native
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]] = js.native
}

object ElementEventAttrs {
  @scala.inline
  def apply(): ElementEventAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementEventAttrs]
  }
  @scala.inline
  implicit class ElementEventAttrsOps[Self <: ElementEventAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = {
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
    def withOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = {
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
    def withOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOncut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncut")(js.undefined)
        ret
    }
    @scala.inline
    def withOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = {
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
    def withOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]): Self = {
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
    def withOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = {
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
    def withOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = {
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
    def withOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = {
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
    def withOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = {
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
    def withOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = {
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
    def withOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnpaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = {
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
    def withOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, _]): Self = {
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
    def withOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = {
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
    def withOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = {
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
    def withOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
    def withOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event_, _]): Self = {
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
  }
  
}

