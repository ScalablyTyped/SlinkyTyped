package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the source CSS.
  */
@js.native
trait Input extends js.Object {
  /**
    * The absolute path to the CSS source file defined with the "from" option.
    * Either this property or the "id" property are always defined.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * The CSS source identifier. Contains input.file if the user set the
    * "from" option, or input.id if they did not.
    */
  var from: String = js.native
  /**
    * The flag to indicate whether or not the source code has Unicode BOM.
    */
  var hasBOM: Boolean = js.native
  /**
    * The unique ID of the CSS source. Used if "from" option is not provided
    * (because PostCSS does not know the file path). Either this property
    * or the "file" property are always defined.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Represents the input source map passed from a compilation step before
    * PostCSS (e.g., from the Sass compiler).
    */
  var map: PreviousMap = js.native
  /**
    * Reads the input source map.
    * @returns A symbol position in the input source (e.g., in a Sass file
    * that was compiled to CSS before being passed to PostCSS):
    */
  def origin(line: Double, column: Double): InputOrigin = js.native
}

object Input {
  @scala.inline
  def apply(from: String, hasBOM: Boolean, map: PreviousMap, origin: (Double, Double) => InputOrigin): Input = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], hasBOM = hasBOM.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], origin = js.Any.fromFunction2(origin))
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: PreviousMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: (Double, Double) => InputOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

