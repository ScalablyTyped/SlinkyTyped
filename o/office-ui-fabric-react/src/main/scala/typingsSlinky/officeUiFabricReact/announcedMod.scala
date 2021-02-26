package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.announcedTypesMod.IAnnouncedProps
import typingsSlinky.officeUiFabricReact.anon.PartialIAnnouncedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announcedMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Announced", "Announced")
  @js.native
  val Announced: ReactComponentClass[IAnnouncedProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Announced", "AnnouncedBase")
  @js.native
  class AnnouncedBase protected ()
    extends typingsSlinky.officeUiFabricReact.announcedBaseMod.AnnouncedBase {
    def this(props: IAnnouncedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IAnnouncedProps, context: js.Any) = this()
  }
  /* static members */
  object AnnouncedBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Announced", "AnnouncedBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Announced", "AnnouncedBase.defaultProps")
    @js.native
    def defaultProps: PartialIAnnouncedProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIAnnouncedProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
