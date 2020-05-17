package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var CurrentPosition: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: Player = js.native
  val State: PpPlayerState = js.native
  def GoToNextBookmark(): Unit = js.native
  def GoToPreviousBookmark(): Unit = js.native
  def Pause(): Unit = js.native
  def Play(): Unit = js.native
  def Stop(): Unit = js.native
}

object Player {
  @scala.inline
  def apply(
    Application: Application,
    CurrentPosition: Double,
    GoToNextBookmark: () => Unit,
    GoToPreviousBookmark: () => Unit,
    Parent: js.Any,
    Pause: () => Unit,
    Play: () => Unit,
    PowerPointDotPlayer_typekey: Player,
    State: PpPlayerState,
    Stop: () => Unit
  ): Player = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CurrentPosition = CurrentPosition.asInstanceOf[js.Any], GoToNextBookmark = js.Any.fromFunction0(GoToNextBookmark), GoToPreviousBookmark = js.Any.fromFunction0(GoToPreviousBookmark), Parent = Parent.asInstanceOf[js.Any], Pause = js.Any.fromFunction0(Pause), Play = js.Any.fromFunction0(Play), State = State.asInstanceOf[js.Any], Stop = js.Any.fromFunction0(Stop))
    __obj.updateDynamic("PowerPoint.Player_typekey")(PowerPointDotPlayer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
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
    def withCurrentPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToNextBookmark(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToNextBookmark")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoToPreviousBookmark(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToPreviousBookmark")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPowerPointDotPlayer_typekey(value: Player): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Player_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PpPlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

