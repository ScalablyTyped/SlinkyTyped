package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaySettings extends js.Object {
  var ActionVerb: String = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var HideWhileNotPlaying: MsoTriState = js.native
  var LoopUntilStopped: MsoTriState = js.native
  val Parent: js.Any = js.native
  var PauseAnimation: MsoTriState = js.native
  var PlayOnEntry: MsoTriState = js.native
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings = js.native
  var RewindMovie: MsoTriState = js.native
  var StopAfterSlides: Double = js.native
}

object PlaySettings {
  @scala.inline
  def apply(
    ActionVerb: String,
    Application: Application,
    HideWhileNotPlaying: MsoTriState,
    LoopUntilStopped: MsoTriState,
    Parent: js.Any,
    PauseAnimation: MsoTriState,
    PlayOnEntry: MsoTriState,
    PowerPointDotPlaySettings_typekey: PlaySettings,
    RewindMovie: MsoTriState,
    StopAfterSlides: Double
  ): PlaySettings = {
    val __obj = js.Dynamic.literal(ActionVerb = ActionVerb.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], HideWhileNotPlaying = HideWhileNotPlaying.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PauseAnimation = PauseAnimation.asInstanceOf[js.Any], PlayOnEntry = PlayOnEntry.asInstanceOf[js.Any], RewindMovie = RewindMovie.asInstanceOf[js.Any], StopAfterSlides = StopAfterSlides.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaySettings_typekey")(PowerPointDotPlaySettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySettings]
  }
  @scala.inline
  implicit class PlaySettingsOps[Self <: PlaySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionVerb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideWhileNotPlaying(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideWhileNotPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopUntilStopped(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoopUntilStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseAnimation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayOnEntry(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayOnEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPlaySettings_typekey(value: PlaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PlaySettings_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewindMovie(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RewindMovie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopAfterSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopAfterSlides")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

