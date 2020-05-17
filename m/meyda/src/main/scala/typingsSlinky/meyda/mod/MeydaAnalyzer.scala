package typingsSlinky.meyda.mod

import org.scalajs.dom.raw.AudioNode
import typingsSlinky.meyda.anon.PartialMeydaFeaturesObjec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meyda", "MeydaAnalyzer")
@js.native
class MeydaAnalyzer () extends js.Object {
  def get(features: js.Array[MeydaAudioFeature]): PartialMeydaFeaturesObjec | Null = js.native
  def setSource(source: AudioNode): Unit = js.native
  def start(features: js.Array[MeydaAudioFeature]): Unit = js.native
  def stop(): Unit = js.native
}

