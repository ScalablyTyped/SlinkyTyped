package typingsSlinky.rcDashMentions.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ProviderProps
import typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextProvider
    ] {
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(value: MentionsContextProps, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.rcDashMentions.libMentionsContextMod.MentionsContextProvider
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProviderProps[MentionsContextProps]
}

