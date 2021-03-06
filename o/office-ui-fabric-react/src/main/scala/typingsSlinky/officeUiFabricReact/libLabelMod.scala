package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.labelTypesMod.ILabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabelMod {
  
  @JSImport("office-ui-fabric-react/lib/Label", "Label")
  @js.native
  val Label: ReactComponentClass[ILabelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Label", "LabelBase")
  @js.native
  class LabelBase protected ()
    extends typingsSlinky.officeUiFabricReact.labelMod.LabelBase {
    def this(props: ILabelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILabelProps, context: js.Any) = this()
  }
}
