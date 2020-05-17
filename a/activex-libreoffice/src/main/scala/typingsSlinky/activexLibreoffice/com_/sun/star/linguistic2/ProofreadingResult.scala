package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the results from proofreading a sentence.
  * @since OOo 3.0.1
  */
@js.native
trait ProofreadingResult extends js.Object {
  var aDocumentIdentifier: String = js.native
  var aErrors: SafeArray[SingleProofreadingError] = js.native
  var aLocale: Locale = js.native
  var aProperties: SafeArray[PropertyValue] = js.native
  var aText: String = js.native
  var nBehindEndOfSentencePosition: Double = js.native
  var nStartOfNextSentencePosition: Double = js.native
  var nStartOfSentencePosition: Double = js.native
  var xFlatParagraph: XFlatParagraph = js.native
  var xProofreader: XProofreader = js.native
}

object ProofreadingResult {
  @scala.inline
  def apply(
    aDocumentIdentifier: String,
    aErrors: SafeArray[SingleProofreadingError],
    aLocale: Locale,
    aProperties: SafeArray[PropertyValue],
    aText: String,
    nBehindEndOfSentencePosition: Double,
    nStartOfNextSentencePosition: Double,
    nStartOfSentencePosition: Double,
    xFlatParagraph: XFlatParagraph,
    xProofreader: XProofreader
  ): ProofreadingResult = {
    val __obj = js.Dynamic.literal(aDocumentIdentifier = aDocumentIdentifier.asInstanceOf[js.Any], aErrors = aErrors.asInstanceOf[js.Any], aLocale = aLocale.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aText = aText.asInstanceOf[js.Any], nBehindEndOfSentencePosition = nBehindEndOfSentencePosition.asInstanceOf[js.Any], nStartOfNextSentencePosition = nStartOfNextSentencePosition.asInstanceOf[js.Any], nStartOfSentencePosition = nStartOfSentencePosition.asInstanceOf[js.Any], xFlatParagraph = xFlatParagraph.asInstanceOf[js.Any], xProofreader = xProofreader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingResult]
  }
  @scala.inline
  implicit class ProofreadingResultOps[Self <: ProofreadingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADocumentIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aDocumentIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAErrors(value: SafeArray[SingleProofreadingError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAProperties(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNBehindEndOfSentencePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nBehindEndOfSentencePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNStartOfNextSentencePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nStartOfNextSentencePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNStartOfSentencePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nStartOfSentencePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXFlatParagraph(value: XFlatParagraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFlatParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXProofreader(value: XProofreader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xProofreader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

