package typingsSlinky.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptionsInternal extends js.Object {
  var controls: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default]
  ] = js.native
  var interactions: js.UndefOr[
    typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default]
  ] = js.native
  var keyboardEventTarget: HTMLElement | Document = js.native
  var overlays: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] = js.native
  var values: StringDictionary[js.Any] = js.native
}

object MapOptionsInternal {
  @scala.inline
  def apply(
    keyboardEventTarget: HTMLElement | Document,
    overlays: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default],
    values: StringDictionary[js.Any]
  ): MapOptionsInternal = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptionsInternal]
  }
  @scala.inline
  implicit class MapOptionsInternalOps[Self <: MapOptionsInternal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardEventTargetDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTarget(value: HTMLElement | Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlays(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControls(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default]): Self = {
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
    def withInteractions(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(js.undefined)
        ret
    }
  }
  
}

