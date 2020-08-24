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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyboardEventTargetDocument(value: Document): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardEventTargetHTMLElement(value: HTMLElement): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardEventTarget(value: HTMLElement | Document): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlays(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: StringDictionary[js.Any]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setControls(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setInteractions(value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default]): Self = this.set("interactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractions: Self = this.set("interactions", js.undefined)
  }
  
}

