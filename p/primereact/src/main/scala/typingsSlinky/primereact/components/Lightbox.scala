package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.lightboxMod.LightboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lightbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactLightboxMod.Lightbox] {
  @JSImport("primereact/lightbox", "Lightbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, target */
  def apply(
    easing: String = null,
    effectDuration: String = null,
    images: js.Array[_] = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactLightboxMod.Lightbox] = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactLightboxMod.Lightbox] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactLightboxMod.Lightbox](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LightboxProps
}

