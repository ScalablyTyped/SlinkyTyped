package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultSequence extends js.Object {
  var defaultSequence: String = js.native
  var enabled: Boolean = js.native
  var items: AnonKeystrokeSequence = js.native
  var obfuscation: Double = js.native
}

object AnonDefaultSequence {
  @scala.inline
  def apply(defaultSequence: String, enabled: Boolean, items: AnonKeystrokeSequence, obfuscation: Double): AnonDefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultSequence]
  }
  @scala.inline
  implicit class AnonDefaultSequenceOps[Self <: AnonDefaultSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: AnonKeystrokeSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObfuscation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

