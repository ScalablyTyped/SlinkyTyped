package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.fabricTypesMod.IFabricProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFabricMod {
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "Fabric")
  @js.native
  val Fabric: ForwardRefExoticComponent[
    IFabricProps with RefAttributes[typingsSlinky.officeUiFabricReact.fabricBaseMod.FabricBase]
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "FabricBase")
  @js.native
  class FabricBase protected ()
    extends typingsSlinky.officeUiFabricReact.fabricMod.FabricBase {
    def this(props: IFabricProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFabricProps, context: js.Any) = this()
  }
}
