package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Description
import typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicator")
  @js.native
  val ProgressIndicator: ReactComponentClass[IProgressIndicatorProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase")
  @js.native
  class ProgressIndicatorBase protected ()
    extends typingsSlinky.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase {
    def this(props: IProgressIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IProgressIndicatorProps, context: js.Any) = this()
  }
  /* static members */
  object ProgressIndicatorBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase.defaultProps")
    @js.native
    def defaultProps: Description = js.native
    @scala.inline
    def defaultProps_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
