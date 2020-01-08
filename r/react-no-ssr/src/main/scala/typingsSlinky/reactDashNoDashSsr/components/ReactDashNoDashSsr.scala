package typingsSlinky.reactDashNoDashSsr.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ReactChild
import typingsSlinky.reactDashNoDashSsr.Anon_OnSSR
import typingsSlinky.reactDashNoDashSsr.reactDashNoDashSsrMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNoDashSsr
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-no-ssr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onSSR: ReactChild = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onSSR != null) __obj.updateDynamic("onSSR")(onSSR.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNoDashSsr.reactDashNoDashSsrMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = Anon_OnSSR
}

