package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.authorizedMod.IAuthorizedProps
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Authorized
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antDesignPro.authorizedMod.Authorized] {
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(authority: authority, noMatch: TagMod[Any] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.antDesignPro.authorizedMod.Authorized] = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAuthorizedProps
}

