package typingsSlinky.plottable.commonsMod

import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.interfacesMod.IRangeProjector
import typingsSlinky.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransformableAccessorScaleBinding[D, R] extends js.Object {
  
  def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any = js.native
  @JSName("accessor")
  var accessor_Original: IAccessor[_] = js.native
  
  var postScale: js.UndefOr[IRangeProjector[R]] = js.native
  
  var scale: js.UndefOr[TransformableScale[D, R]] = js.native
}
