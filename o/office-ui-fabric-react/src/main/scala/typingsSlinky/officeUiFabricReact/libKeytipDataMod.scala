package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typingsSlinky.react.mod.Ref
import typingsSlinky.uifabricUtilities.irendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/KeytipData", "KeytipData")
  @js.native
  val KeytipData: ReactComponentClass[IKeytipDataProps with IRenderComponent[js.Object]] = js.native
  
  @JSImport("office-ui-fabric-react/lib/KeytipData", "useKeytipRef")
  @js.native
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = js.native
}
