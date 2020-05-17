package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives information about a word's possible hyphenation points.
  *
  * Example: In German pre-spelling-reform you may have the following: getWord: Dampfschiffahrt getPossibleHyphens: Dampf=schiff=fahrt
  * getOrigHyphensPositions: 4, 9 That is "Dampfschiffahrt" can be hyphenated after the "pf" (4) and between the double "ff" (9). And if you are going to
  * hyphenate it at position 9 you will get an additional "f" before the hyphen character.
  * @see com.sun.star.linguistic2.XHyphenator
  */
@js.native
trait XPossibleHyphens extends XInterface {
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  val HyphenationPositions: SafeArray[Double] = js.native
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  val PossibleHyphens: String = js.native
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  val Word: String = js.native
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  def getHyphenationPositions(): SafeArray[Double] = js.native
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  def getPossibleHyphens(): String = js.native
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  def getWord(): String = js.native
}

object XPossibleHyphens {
  @scala.inline
  def apply(
    HyphenationPositions: SafeArray[Double],
    Locale: Locale,
    PossibleHyphens: String,
    Word: String,
    acquire: () => Unit,
    getHyphenationPositions: () => SafeArray[Double],
    getLocale: () => Locale,
    getPossibleHyphens: () => String,
    getWord: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal(HyphenationPositions = HyphenationPositions.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], PossibleHyphens = PossibleHyphens.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHyphenationPositions = js.Any.fromFunction0(getHyphenationPositions), getLocale = js.Any.fromFunction0(getLocale), getPossibleHyphens = js.Any.fromFunction0(getPossibleHyphens), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPossibleHyphens]
  }
  @scala.inline
  implicit class XPossibleHyphensOps[Self <: XPossibleHyphens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHyphenationPositions(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyphenationPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPossibleHyphens(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PossibleHyphens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHyphenationPositions(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHyphenationPositions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocale(value: () => Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPossibleHyphens(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPossibleHyphens")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWord(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWord")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

