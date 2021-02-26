package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.spinnerTypesMod.ISpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "Spinner")
  @js.native
  val Spinner: ReactComponentClass[ISpinnerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase")
  @js.native
  class SpinnerBase protected ()
    extends typingsSlinky.officeUiFabricReact.spinnerBaseMod.SpinnerBase {
    def this(props: ISpinnerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ISpinnerProps, context: js.Any) = this()
  }
  /* static members */
  object SpinnerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase.defaultProps")
    @js.native
    def defaultProps: ISpinnerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize with Double] = js.native
    
    /* 3 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    
    /* 2 */ val medium: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    
    /* 1 */ val small: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    
    /* 0 */ val xSmall: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerType")
  @js.native
  object SpinnerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType with Double] = js.native
    
    /* 1 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
  }
}
