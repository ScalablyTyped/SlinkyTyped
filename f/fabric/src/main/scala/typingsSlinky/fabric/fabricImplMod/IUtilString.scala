package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilString extends js.Object {
  /**
  	 * Camelizes a string
  	 * @param string String to camelize
  	 */
  def camelize(string: String): String = js.native
  /**
  	 * Capitalizes a string
  	 * @param string String to capitalize
  	 * @param [firstLetterOnly] If true only first letter is capitalized
  	 * and other letters stay untouched, if false first letter is capitalized
  	 * and other letters are converted to lowercase.
  	 */
  def capitalize(string: String, firstLetterOnly: Boolean): String = js.native
  /**
  	 * Escapes XML in a string
  	 * @param string String to escape
  	 */
  def escapeXml(string: String): String = js.native
  /**
  	 * Divide a string in the user perceived single units
  	 * @param {String} textstring String to escape
  	 * @return {Array} array containing the graphemes
  	 */
  def graphemeSplit(string: String): js.Array[String] = js.native
}

object IUtilString {
  @scala.inline
  def apply(
    camelize: String => String,
    capitalize: (String, Boolean) => String,
    escapeXml: String => String,
    graphemeSplit: String => js.Array[String]
  ): IUtilString = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), capitalize = js.Any.fromFunction2(capitalize), escapeXml = js.Any.fromFunction1(escapeXml), graphemeSplit = js.Any.fromFunction1(graphemeSplit))
    __obj.asInstanceOf[IUtilString]
  }
  @scala.inline
  implicit class IUtilStringOps[Self <: IUtilString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamelize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCapitalize(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEscapeXml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeXml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGraphemeSplit(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphemeSplit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

