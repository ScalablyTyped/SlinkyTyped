package typingsSlinky.mobxDashReactDashDevtools.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.mobxDashReactDashDevtools.Anon_HighlightTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UpdatesControl
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.UpdatesControl
    ] {
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(highlightTimeout: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.UpdatesControl
  ] = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.UpdatesControl
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod.UpdatesControl](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = Anon_HighlightTimeout
}

