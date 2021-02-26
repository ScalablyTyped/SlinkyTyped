package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SampledProperty")
@js.native
class SampledProperty protected () extends PositionProperty {
  def this(`type`: Double) = this()
  def this(`type`: Packable) = this()
  def this(`type`: Double, derivativeTypes: js.Array[Packable]) = this()
  def this(`type`: Packable, derivativeTypes: js.Array[Packable]) = this()
  
  def addSample(time: JulianDate, value: Packable): Unit = js.native
  def addSample(time: JulianDate, value: Packable, derivatives: js.Array[Packable]): Unit = js.native
  
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable]): Unit = js.native
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable], derivativeValues: js.Array[js.Array[_]]): Unit = js.native
  
  def addSamplesPackedArray(packedSamples: js.Array[Double]): Unit = js.native
  def addSamplesPackedArray(packedSamples: js.Array[Double], epoch: JulianDate): Unit = js.native
  
  var backwardExtrapolationDuration: Double = js.native
  
  var backwardExtrapolationType: ExtrapolationType = js.native
  
  var derivativeTypes: js.Array[Packable] = js.native
  
  var forwardExtrapolationDuration: Double = js.native
  
  var forwardExtrapolationType: ExtrapolationType = js.native
  
  var interpolationAlgorithm: InterpolationAlgorithm = js.native
  
  var interpolationDegree: Double = js.native
  
  def setInterpolationOptions(): Unit = js.native
  def setInterpolationOptions(options: typingsSlinky.cesium.anon.InterpolationAlgorithm): Unit = js.native
  
  var `type`: js.Any = js.native
}
