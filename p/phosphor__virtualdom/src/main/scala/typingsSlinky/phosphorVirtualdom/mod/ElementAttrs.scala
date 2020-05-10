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

/* Inlined @phosphor/virtualdom.@phosphor/virtualdom.ElementBaseAttrs & @phosphor/virtualdom.@phosphor/virtualdom.ElementEventAttrs & @phosphor/virtualdom.@phosphor/virtualdom.ElementSpecialAttrs */
@js.native
trait ElementAttrs extends js.Object {
  val abbr: js.UndefOr[String] = js.native
  val accept: js.UndefOr[String] = js.native
  val `accept-charset`: js.UndefOr[String] = js.native
  val accesskey: js.UndefOr[String] = js.native
  val action: js.UndefOr[String] = js.native
  val allowfullscreen: js.UndefOr[String] = js.native
  val alt: js.UndefOr[String] = js.native
  val autocomplete: js.UndefOr[String] = js.native
  val autofocus: js.UndefOr[String] = js.native
  val autoplay: js.UndefOr[String] = js.native
  val autosave: js.UndefOr[String] = js.native
  val checked: js.UndefOr[String] = js.native
  val cite: js.UndefOr[String] = js.native
  /**
    * The JS-safe name for the HTML `class` attribute.
    */
  val className: js.UndefOr[String] = js.native
  val cols: js.UndefOr[String] = js.native
  val colspan: js.UndefOr[String] = js.native
  val contenteditable: js.UndefOr[String] = js.native
  val controls: js.UndefOr[String] = js.native
  val coords: js.UndefOr[String] = js.native
  val crossorigin: js.UndefOr[String] = js.native
  val data: js.UndefOr[String] = js.native
  /**
    * The dataset for the rendered DOM element.
    */
  val dataset: js.UndefOr[ElementDataset] = js.native
  val datetime: js.UndefOr[String] = js.native
  val default: js.UndefOr[String] = js.native
  val dir: js.UndefOr[String] = js.native
  val dirname: js.UndefOr[String] = js.native
  val disabled: js.UndefOr[String] = js.native
  val download: js.UndefOr[String] = js.native
  val draggable: js.UndefOr[String] = js.native
  val dropzone: js.UndefOr[String] = js.native
  val enctype: js.UndefOr[String] = js.native
  val form: js.UndefOr[String] = js.native
  val formaction: js.UndefOr[String] = js.native
  val formenctype: js.UndefOr[String] = js.native
  val formmethod: js.UndefOr[String] = js.native
  val formnovalidate: js.UndefOr[String] = js.native
  val formtarget: js.UndefOr[String] = js.native
  val headers: js.UndefOr[String] = js.native
  val height: js.UndefOr[String] = js.native
  val hidden: js.UndefOr[String] = js.native
  val high: js.UndefOr[String] = js.native
  val href: js.UndefOr[String] = js.native
  val hreflang: js.UndefOr[String] = js.native
  /**
    * The JS-safe name for the HTML `for` attribute.
    */
  val htmlFor: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  val inputmode: js.UndefOr[String] = js.native
  val integrity: js.UndefOr[String] = js.native
  val ismap: js.UndefOr[String] = js.native
  /**
    * The key id for the virtual element node.
    *
    * If a node is given a key id, the generated DOM node will not be
    * recreated during a rendering update if it only moves among its
    * siblings in the render tree.
    *
    * In general, reordering child nodes will cause the nodes to be
    * completely re-rendered. Keys allow this to be optimized away.
    *
    * If a key is provided, it must be unique among sibling nodes.
    */
  val key: js.UndefOr[String] = js.native
  val kind: js.UndefOr[String] = js.native
  val label: js.UndefOr[String] = js.native
  val lang: js.UndefOr[String] = js.native
  val list: js.UndefOr[String] = js.native
  val loop: js.UndefOr[String] = js.native
  val low: js.UndefOr[String] = js.native
  val max: js.UndefOr[String] = js.native
  val maxlength: js.UndefOr[String] = js.native
  val media: js.UndefOr[String] = js.native
  val mediagroup: js.UndefOr[String] = js.native
  val method: js.UndefOr[String] = js.native
  val min: js.UndefOr[String] = js.native
  val minlength: js.UndefOr[String] = js.native
  val multiple: js.UndefOr[String] = js.native
  val muted: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
  val novalidate: js.UndefOr[String] = js.native
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
  val optimum: js.UndefOr[String] = js.native
  val pattern: js.UndefOr[String] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val poster: js.UndefOr[String] = js.native
  val preload: js.UndefOr[String] = js.native
  val readonly: js.UndefOr[String] = js.native
  val rel: js.UndefOr[String] = js.native
  val required: js.UndefOr[String] = js.native
  val reversed: js.UndefOr[String] = js.native
  val rows: js.UndefOr[String] = js.native
  val rowspan: js.UndefOr[String] = js.native
  val sandbox: js.UndefOr[String] = js.native
  val scope: js.UndefOr[String] = js.native
  val selected: js.UndefOr[String] = js.native
  val shape: js.UndefOr[String] = js.native
  val size: js.UndefOr[String] = js.native
  val sizes: js.UndefOr[String] = js.native
  val span: js.UndefOr[String] = js.native
  val spellcheck: js.UndefOr[String] = js.native
  val src: js.UndefOr[String] = js.native
  val srcdoc: js.UndefOr[String] = js.native
  val srclang: js.UndefOr[String] = js.native
  val srcset: js.UndefOr[String] = js.native
  val start: js.UndefOr[String] = js.native
  val step: js.UndefOr[String] = js.native
  /**
    * The inline style for the rendered DOM element.
    */
  val style: js.UndefOr[ElementInlineStyle] = js.native
  val tabindex: js.UndefOr[String] = js.native
  val target: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[String] = js.native
  val typemustmatch: js.UndefOr[String] = js.native
  val usemap: js.UndefOr[String] = js.native
  val value: js.UndefOr[String] = js.native
  val width: js.UndefOr[String] = js.native
  val wrap: js.UndefOr[String] = js.native
}

object ElementAttrs {
  @scala.inline
  def apply(): ElementAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAttrs]
  }
  @scala.inline
  implicit class ElementAttrsOps[Self <: ElementAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(js.undefined)
        ret
    }
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-charset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-charset")(js.undefined)
        ret
    }
    @scala.inline
    def withAccesskey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accesskey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccesskey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accesskey")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowfullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowfullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowfullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowfullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: String): Self = {
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
    def withAutosave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withColspan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColspan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(js.undefined)
        ret
    }
    @scala.inline
    def withContenteditable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contenteditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContenteditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contenteditable")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withCoords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossorigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossorigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: ElementDataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDropzone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropzone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(js.undefined)
        ret
    }
    @scala.inline
    def withEnctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withFormaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formaction")(js.undefined)
        ret
    }
    @scala.inline
    def withFormenctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formenctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormenctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formenctype")(js.undefined)
        ret
    }
    @scala.inline
    def withFormmethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formmethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormmethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formmethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFormnovalidate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formnovalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormnovalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formnovalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormtarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formtarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormtarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formtarget")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHreflang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hreflang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHreflang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hreflang")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsmap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ismap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ismap")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: String): Self = {
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
    def withLow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxlength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxlength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMediagroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediagroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediagroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediagroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinlength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinlength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNovalidate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("novalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNovalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("novalidate")(js.undefined)
        ret
    }
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
    @scala.inline
    def withOptimum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimum")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: String): Self = {
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
    def withReadonly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowspan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowspan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowspan")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
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
    def withSizes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcdoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcdoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcdoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcdoc")(js.undefined)
        ret
    }
    @scala.inline
    def withSrclang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srclang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrclang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srclang")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ElementInlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypemustmatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typemustmatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypemustmatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typemustmatch")(js.undefined)
        ret
    }
    @scala.inline
    def withUsemap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemap")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

