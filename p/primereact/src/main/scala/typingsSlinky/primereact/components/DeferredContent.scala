package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.deferredContentMod.DeferredContentProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DeferredContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent] {
  @JSImport("primereact/deferredcontent", "DeferredContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onLoad: /* event */ Event_ => Unit = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent] = {
    val __obj = js.Dynamic.literal()
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactDeferredcontentMod.DeferredContent](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DeferredContentProps
}

