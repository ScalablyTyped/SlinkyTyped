package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.officeUiFabricReact.anon.AddMeasurementToCache
import typingsSlinky.officeUiFabricReact.anon.GetInitialResizeGroupState
import typingsSlinky.officeUiFabricReact.anon.IsMeasured
import typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ResizeGroup", JSImport.Namespace)
@js.native
object resizeGroupMod extends js.Object {
  @js.native
  class ResizeGroupBase protected ()
    extends typingsSlinky.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  val MeasuredContext: Context[IsMeasured] = js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typingsSlinky.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = js.native
  def getMeasurementCache(): AddMeasurementToCache = js.native
  def getNextResizeGroupStateProvider(): GetInitialResizeGroupState = js.native
  def getNextResizeGroupStateProvider(measurementCache: AddMeasurementToCache): GetInitialResizeGroupState = js.native
  @js.native
  object ResizeGroupDirection extends js.Object {
    /* 0 */ val horizontal: typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection with Double
      ] = js.native
  }
  
}

