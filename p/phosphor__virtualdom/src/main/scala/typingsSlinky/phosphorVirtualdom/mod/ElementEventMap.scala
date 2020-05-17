package typingsSlinky.phosphorVirtualdom.mod

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.std.MediaStreamErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementEventMap extends js.Object {
  var onabort: UIEvent = js.native
  var onauxclick: MouseEvent = js.native
  var onblur: FocusEvent = js.native
  var oncanplay: Event = js.native
  var oncanplaythrough: Event = js.native
  var onchange: Event = js.native
  var onclick: MouseEvent = js.native
  var oncontextmenu: PointerEvent = js.native
  var oncopy: ClipboardEvent = js.native
  var oncuechange: Event = js.native
  var oncut: ClipboardEvent = js.native
  var ondblclick: MouseEvent = js.native
  var ondrag: DragEvent = js.native
  var ondragend: DragEvent = js.native
  var ondragenter: DragEvent = js.native
  var ondragexit: DragEvent = js.native
  var ondragleave: DragEvent = js.native
  var ondragover: DragEvent = js.native
  var ondragstart: DragEvent = js.native
  var ondrop: DragEvent = js.native
  var ondurationchange: Event = js.native
  var onemptied: Event = js.native
  var onended: MediaStreamErrorEvent = js.native
  var onerror: ErrorEvent = js.native
  var onfocus: FocusEvent = js.native
  var oninput: Event = js.native
  var oninvalid: Event = js.native
  var onkeydown: KeyboardEvent = js.native
  var onkeypress: KeyboardEvent = js.native
  var onkeyup: KeyboardEvent = js.native
  var onload: Event = js.native
  var onloadeddata: Event = js.native
  var onloadedmetadata: Event = js.native
  var onloadend: Event = js.native
  var onloadstart: Event = js.native
  var onmousedown: MouseEvent = js.native
  var onmouseenter: MouseEvent = js.native
  var onmouseleave: MouseEvent = js.native
  var onmousemove: MouseEvent = js.native
  var onmouseout: MouseEvent = js.native
  var onmouseover: MouseEvent = js.native
  var onmouseup: MouseEvent = js.native
  var onmousewheel: WheelEvent = js.native
  var onpaste: ClipboardEvent = js.native
  var onpause: Event = js.native
  var onplay: Event = js.native
  var onplaying: Event = js.native
  var onpointercancel: PointerEvent = js.native
  var onpointerdown: PointerEvent = js.native
  var onpointerenter: PointerEvent = js.native
  var onpointerleave: PointerEvent = js.native
  var onpointermove: PointerEvent = js.native
  var onpointerout: PointerEvent = js.native
  var onpointerover: PointerEvent = js.native
  var onpointerup: PointerEvent = js.native
  var onprogress: ProgressEvent = js.native
  var onratechange: Event = js.native
  var onreset: Event = js.native
  var onscroll: UIEvent = js.native
  var onseeked: Event = js.native
  var onseeking: Event = js.native
  var onselect: UIEvent = js.native
  var onselectstart: Event = js.native
  var onstalled: Event = js.native
  var onsubmit: Event = js.native
  var onsuspend: Event = js.native
  var ontimeupdate: Event = js.native
  var onvolumechange: Event = js.native
  var onwaiting: Event = js.native
}

object ElementEventMap {
  @scala.inline
  def apply(
    onabort: UIEvent,
    onauxclick: MouseEvent,
    onblur: FocusEvent,
    oncanplay: Event,
    oncanplaythrough: Event,
    onchange: Event,
    onclick: MouseEvent,
    oncontextmenu: PointerEvent,
    oncopy: ClipboardEvent,
    oncuechange: Event,
    oncut: ClipboardEvent,
    ondblclick: MouseEvent,
    ondrag: DragEvent,
    ondragend: DragEvent,
    ondragenter: DragEvent,
    ondragexit: DragEvent,
    ondragleave: DragEvent,
    ondragover: DragEvent,
    ondragstart: DragEvent,
    ondrop: DragEvent,
    ondurationchange: Event,
    onemptied: Event,
    onended: MediaStreamErrorEvent,
    onerror: ErrorEvent,
    onfocus: FocusEvent,
    oninput: Event,
    oninvalid: Event,
    onkeydown: KeyboardEvent,
    onkeypress: KeyboardEvent,
    onkeyup: KeyboardEvent,
    onload: Event,
    onloadeddata: Event,
    onloadedmetadata: Event,
    onloadend: Event,
    onloadstart: Event,
    onmousedown: MouseEvent,
    onmouseenter: MouseEvent,
    onmouseleave: MouseEvent,
    onmousemove: MouseEvent,
    onmouseout: MouseEvent,
    onmouseover: MouseEvent,
    onmouseup: MouseEvent,
    onmousewheel: WheelEvent,
    onpaste: ClipboardEvent,
    onpause: Event,
    onplay: Event,
    onplaying: Event,
    onpointercancel: PointerEvent,
    onpointerdown: PointerEvent,
    onpointerenter: PointerEvent,
    onpointerleave: PointerEvent,
    onpointermove: PointerEvent,
    onpointerout: PointerEvent,
    onpointerover: PointerEvent,
    onpointerup: PointerEvent,
    onprogress: ProgressEvent,
    onratechange: Event,
    onreset: Event,
    onscroll: UIEvent,
    onseeked: Event,
    onseeking: Event,
    onselect: UIEvent,
    onselectstart: Event,
    onstalled: Event,
    onsubmit: Event,
    onsuspend: Event,
    ontimeupdate: Event,
    onvolumechange: Event,
    onwaiting: Event
  ): ElementEventMap = {
    val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any], onauxclick = onauxclick.asInstanceOf[js.Any], onblur = onblur.asInstanceOf[js.Any], oncanplay = oncanplay.asInstanceOf[js.Any], oncanplaythrough = oncanplaythrough.asInstanceOf[js.Any], onchange = onchange.asInstanceOf[js.Any], onclick = onclick.asInstanceOf[js.Any], oncontextmenu = oncontextmenu.asInstanceOf[js.Any], oncopy = oncopy.asInstanceOf[js.Any], oncuechange = oncuechange.asInstanceOf[js.Any], oncut = oncut.asInstanceOf[js.Any], ondblclick = ondblclick.asInstanceOf[js.Any], ondrag = ondrag.asInstanceOf[js.Any], ondragend = ondragend.asInstanceOf[js.Any], ondragenter = ondragenter.asInstanceOf[js.Any], ondragexit = ondragexit.asInstanceOf[js.Any], ondragleave = ondragleave.asInstanceOf[js.Any], ondragover = ondragover.asInstanceOf[js.Any], ondragstart = ondragstart.asInstanceOf[js.Any], ondrop = ondrop.asInstanceOf[js.Any], ondurationchange = ondurationchange.asInstanceOf[js.Any], onemptied = onemptied.asInstanceOf[js.Any], onended = onended.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onfocus = onfocus.asInstanceOf[js.Any], oninput = oninput.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeypress = onkeypress.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], onloadeddata = onloadeddata.asInstanceOf[js.Any], onloadedmetadata = onloadedmetadata.asInstanceOf[js.Any], onloadend = onloadend.asInstanceOf[js.Any], onloadstart = onloadstart.asInstanceOf[js.Any], onmousedown = onmousedown.asInstanceOf[js.Any], onmouseenter = onmouseenter.asInstanceOf[js.Any], onmouseleave = onmouseleave.asInstanceOf[js.Any], onmousemove = onmousemove.asInstanceOf[js.Any], onmouseout = onmouseout.asInstanceOf[js.Any], onmouseover = onmouseover.asInstanceOf[js.Any], onmouseup = onmouseup.asInstanceOf[js.Any], onmousewheel = onmousewheel.asInstanceOf[js.Any], onpaste = onpaste.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onplay = onplay.asInstanceOf[js.Any], onplaying = onplaying.asInstanceOf[js.Any], onpointercancel = onpointercancel.asInstanceOf[js.Any], onpointerdown = onpointerdown.asInstanceOf[js.Any], onpointerenter = onpointerenter.asInstanceOf[js.Any], onpointerleave = onpointerleave.asInstanceOf[js.Any], onpointermove = onpointermove.asInstanceOf[js.Any], onpointerout = onpointerout.asInstanceOf[js.Any], onpointerover = onpointerover.asInstanceOf[js.Any], onpointerup = onpointerup.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onratechange = onratechange.asInstanceOf[js.Any], onreset = onreset.asInstanceOf[js.Any], onscroll = onscroll.asInstanceOf[js.Any], onseeked = onseeked.asInstanceOf[js.Any], onseeking = onseeking.asInstanceOf[js.Any], onselect = onselect.asInstanceOf[js.Any], onselectstart = onselectstart.asInstanceOf[js.Any], onstalled = onstalled.asInstanceOf[js.Any], onsubmit = onsubmit.asInstanceOf[js.Any], onsuspend = onsuspend.asInstanceOf[js.Any], ontimeupdate = ontimeupdate.asInstanceOf[js.Any], onvolumechange = onvolumechange.asInstanceOf[js.Any], onwaiting = onwaiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  @scala.inline
  implicit class ElementEventMapOps[Self <: ElementEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnabort(value: UIEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnauxclick(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onauxclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnblur(value: FocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncanplay(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncanplaythrough(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanplaythrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnchange(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnclick(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncontextmenu(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncopy(value: ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncuechange(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncuechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncut(value: ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndblclick(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndrag(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragend(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragenter(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragexit(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragexit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragleave(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragover(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndragstart(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndrop(value: DragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndurationchange(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondurationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnemptied(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onemptied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnended(value: MediaStreamErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: ErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnfocus(value: FocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOninput(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOninvalid(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeydown(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeypress(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeyup(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnload(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnloadeddata(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadeddata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnloadedmetadata(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadedmetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnloadend(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnloadstart(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmousedown(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmouseenter(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmouseleave(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmousemove(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmouseout(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmouseover(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmouseup(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmousewheel(value: WheelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpaste(value: ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpause(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplay(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplaying(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointercancel(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerdown(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerenter(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerleave(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointermove(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerout(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerover(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerup(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprogress(value: ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnratechange(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onratechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnreset(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnscroll(value: UIEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnseeked(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnseeking(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onseeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnselect(value: UIEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnselectstart(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselectstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstalled(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsubmit(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsuspend(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntimeupdate(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnvolumechange(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvolumechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnwaiting(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwaiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

