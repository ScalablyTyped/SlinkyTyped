package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactHotkeys.mod.KeySequence because Already inherited */ @js.native
trait ExtendedKeyMapOptions extends KeyMapOptions {
  var description: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var sequences: js.Array[KeyMapOptions | MouseTrapKeySequence] = js.native
}

object ExtendedKeyMapOptions {
  @scala.inline
  def apply(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyMapOptions]
  }
  @scala.inline
  implicit class ExtendedKeyMapOptionsOps[Self <: ExtendedKeyMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequences(value: js.Array[KeyMapOptions | MouseTrapKeySequence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

