package typingsSlinky.meyda.mod

import typingsSlinky.meyda.anon.PartialMeydaFeaturesObjec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meyda", "extract")
@js.native
object extract extends js.Object {
  
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
}
