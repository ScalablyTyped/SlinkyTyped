package typingsSlinky.atomKeymap.mod.global.AtomKeymap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBinding extends js.Object {
  var command: String = js.native
  // Properties
  var enabled: Boolean = js.native
  var keystrokeArray: js.Array[String] = js.native
  var keystrokeCount: Double = js.native
  var keystrokes: String = js.native
  var selector: String = js.native
  var source: String = js.native
  var specificity: Double = js.native
  /**
    *  Compare another KeyBinding to this instance.
    *  Returns <= -1 if the argument is considered lesser or of lower priority.
    *  Returns 0 if this binding is equivalent to the argument.
    *  Returns >= 1 if the argument is considered greater or of higher priority.
    */
  def compare(other: KeyBinding): Double = js.native
  // Comparison
  /** Determines whether the given keystroke matches any contained within this binding. */
  def matches(keystroke: String): Boolean = js.native
}

object KeyBinding {
  @scala.inline
  def apply(
    command: String,
    compare: KeyBinding => Double,
    enabled: Boolean,
    keystrokeArray: js.Array[String],
    keystrokeCount: Double,
    keystrokes: String,
    matches: String => Boolean,
    selector: String,
    source: String,
    specificity: Double
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), enabled = enabled.asInstanceOf[js.Any], keystrokeArray = keystrokeArray.asInstanceOf[js.Any], keystrokeCount = keystrokeCount.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBinding]
  }
  @scala.inline
  implicit class KeyBindingOps[Self <: KeyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare(value: KeyBinding => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystrokeArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokeArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystrokeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystrokes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecificity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

