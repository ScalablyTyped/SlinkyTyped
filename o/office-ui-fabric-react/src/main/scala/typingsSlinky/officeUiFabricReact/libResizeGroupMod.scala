package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.officeUiFabricReact.anon.AddMeasurementToCache
import typingsSlinky.officeUiFabricReact.anon.GetInitialResizeGroupState
import typingsSlinky.officeUiFabricReact.anon.IsMeasured
import typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizeGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "MeasuredContext")
  @js.native
  val MeasuredContext: Context[IsMeasured] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroup")
  @js.native
  class ResizeGroup protected ()
    extends typingsSlinky.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroup")
  @js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typingsSlinky.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroupBase")
  @js.native
  class ResizeGroupBase protected ()
    extends typingsSlinky.officeUiFabricReact.resizeGroupMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "ResizeGroupDirection")
  @js.native
  object ResizeGroupDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection with Double
      ] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.vertical with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "getMeasurementCache")
  @js.native
  def getMeasurementCache(): AddMeasurementToCache = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = js.native
  @JSImport("office-ui-fabric-react/lib/ResizeGroup", "getNextResizeGroupStateProvider")
  @js.native
  def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = js.native
}
