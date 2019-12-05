package typingsSlinky.nextDashSeo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.nextDashSeo.nextDashSeoMod.Config
import typingsSlinky.nextDashSeo.nextDashSeoMod.NextSeoProps
import typingsSlinky.nextDashSeo.nextDashSeoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NextDashSeo
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("next-seo", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(config: Config, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NextSeoProps
}

