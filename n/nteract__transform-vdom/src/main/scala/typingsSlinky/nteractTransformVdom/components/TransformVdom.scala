package typingsSlinky.nteractTransformVdom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.nteractTransformVdom.PartialProps
import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsSlinky.nteractTransformVdom.mod.default
import typingsSlinky.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsSlinky.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransformVdom
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: VDOMEl = null,
    mediaType: applicationSlashvdomDotv1Plussignjson = null,
    onVDOMEvent: (/* targetName */ String, /* event */ SerializedEvent[_]) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (onVDOMEvent != null) __obj.updateDynamic("onVDOMEvent")(js.Any.fromFunction2(onVDOMEvent))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.nteractTransformVdom.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialProps
}

