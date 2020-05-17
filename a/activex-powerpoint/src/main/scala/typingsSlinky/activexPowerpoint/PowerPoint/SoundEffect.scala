package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundEffect extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: SoundEffect = js.native
  var Type: PpSoundEffectType = js.native
  def ImportFromFile(FileName: String): Unit = js.native
  def Play(): Unit = js.native
}

object SoundEffect {
  @scala.inline
  def apply(
    Application: Application,
    ImportFromFile: String => Unit,
    Name: String,
    Parent: js.Any,
    Play: () => Unit,
    PowerPointDotSoundEffect_typekey: SoundEffect,
    Type: PpSoundEffectType
  ): SoundEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ImportFromFile = js.Any.fromFunction1(ImportFromFile), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundEffect_typekey")(PowerPointDotSoundEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundEffect]
  }
  @scala.inline
  implicit class SoundEffectOps[Self <: SoundEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportFromFile(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportFromFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPowerPointDotSoundEffect_typekey(value: SoundEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SoundEffect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PpSoundEffectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

