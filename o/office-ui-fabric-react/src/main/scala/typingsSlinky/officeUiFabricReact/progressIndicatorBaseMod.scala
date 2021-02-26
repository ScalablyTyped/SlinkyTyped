package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.Description
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase")
  @js.native
  class ProgressIndicatorBase protected ()
    extends Component[IProgressIndicatorProps, js.Object, js.Any] {
    def this(props: IProgressIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IProgressIndicatorProps, context: js.Any) = this()
    
    var _onRenderProgress: js.Any = js.native
  }
  /* static members */
  object ProgressIndicatorBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase.defaultProps")
    @js.native
    def defaultProps: Description = js.native
    @scala.inline
    def defaultProps_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
