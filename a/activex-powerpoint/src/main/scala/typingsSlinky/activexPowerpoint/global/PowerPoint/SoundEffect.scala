package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexPowerpoint.PowerPoint.PpSoundEffectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SoundEffect")
@js.native
class SoundEffect protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.SoundEffect_typekey")
  override var PowerPointDotSoundEffect_typekey: typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect = js.native
  /* CompleteClass */
  override var Type: PpSoundEffectType = js.native
  /* CompleteClass */
  override def ImportFromFile(FileName: String): Unit = js.native
  /* CompleteClass */
  override def Play(): Unit = js.native
}

