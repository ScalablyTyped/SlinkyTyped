package typingsSlinky.atom.anon

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atom.mod.CommandEvent
import typingsSlinky.atom.mod.CommandRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description[TargetType /* <: EventTarget */] extends CommandRegistryListener[TargetType] {
  var description: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.native
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit] = js.native
}

object Description {
  @scala.inline
  def apply[TargetType](didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Description[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    __obj.asInstanceOf[Description[TargetType]]
  }
  @scala.inline
  implicit class DescriptionOps[Self[targettype] <: Description[targettype], TargetType] (val x: Self[TargetType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TargetType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TargetType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TargetType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TargetType] with Other]
    @scala.inline
    def withDidDispatch(value: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didDispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenInCommandPalette(value: Boolean): Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenInCommandPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenInCommandPalette: Self[TargetType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenInCommandPalette")(js.undefined)
        ret
    }
  }
  
}

