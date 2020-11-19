package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typingsSlinky.react.mod.Ref
import typingsSlinky.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/KeytipData", JSImport.Namespace)
@js.native
object keytipDataMod extends js.Object {
  
  val KeytipData: ReactComponentClass[IKeytipDataProps with IRenderComponent[js.Object]] = js.native
  
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = js.native
}
