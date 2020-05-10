package typingsSlinky.emberComponent.textFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Component.extend(TextSupport) * / any */ @js.native
trait TextField extends js.Object {
  /**
    * The `max` attribute of input element used with `type="number"` or `type="range"`.
    */
  var max: String = js.native
  /**
    * The `min` attribute of input element used with `type="number"` or `type="range"`.
    */
  var min: String = js.native
  /**
    * The `pattern` attribute of input element.
    */
  var pattern: String = js.native
  /**
    * The `size` of the text field in characters.
    */
  var size: String = js.native
  /**
    * The `type` attribute of the input element.
    */
  var `type`: String = js.native
  /**
    * The `value` attribute of the input element. As the user inputs text, this
    * property is updated live.
    */
  var value: String = js.native
}

object TextField {
  @scala.inline
  def apply(max: String, min: String, pattern: String, size: String, `type`: String, value: String): TextField = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextField]
  }
  @scala.inline
  implicit class TextFieldOps[Self <: TextField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

