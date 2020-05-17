package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text conversion result to be used with {@link XTextConversion} .
  * @since OOo 1.1.2
  */
@js.native
trait TextConversionResult extends js.Object {
  /**
    * The boundary of the first convertible word in the given text.
    *
    * If there is no convertible word found in the text, **startPos** and **endPos** for {@link Boundary} equal 0.
    */
  var Boundary: typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Boundary = js.native
  /** A list of replacement candidates for the first convertible word found in the given text. */
  var Candidates: SafeArray[String] = js.native
}

object TextConversionResult {
  @scala.inline
  def apply(Boundary: Boundary, Candidates: SafeArray[String]): TextConversionResult = {
    val __obj = js.Dynamic.literal(Boundary = Boundary.asInstanceOf[js.Any], Candidates = Candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConversionResult]
  }
  @scala.inline
  implicit class TextConversionResultOps[Self <: TextConversionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundary(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidates(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

