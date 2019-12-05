package typingsSlinky.officeDashUiDashFabricDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libIRenderComponentMod.IRenderComponent
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsKeytipDataKeytipDataDotTypesMod.IKeytipDataProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object KeytipData
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libKeytipDataMod.KeytipData
    ] {
  @JSImport("office-ui-fabric-react/lib/KeytipData", "KeytipData")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IKeytipDataProps with IRenderComponent[js.Object]
}

