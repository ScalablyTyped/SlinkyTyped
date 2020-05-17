package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection of string-related arguments used on all canvas text interfaces.
  *
  * A possibly much larger string than later rendered is necessary here, because in several languages, glyph selection is context dependent.
  * @since OOo 2.0
  */
@js.native
trait StringContext extends js.Object {
  /**
    * Length of the substring to actually use.
    *
    * Must be within the range [0,INTMAX].
    */
  var Length: Double = js.native
  /**
    * Start position within the string.
    *
    * The first character has index 0.
    */
  var StartPosition: Double = js.native
  /** The complete text, from which a subset is selected by the parameters below. */
  var Text: String = js.native
}

object StringContext {
  @scala.inline
  def apply(Length: Double, StartPosition: Double, Text: String): StringContext = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringContext]
  }
  @scala.inline
  implicit class StringContextOps[Self <: StringContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

