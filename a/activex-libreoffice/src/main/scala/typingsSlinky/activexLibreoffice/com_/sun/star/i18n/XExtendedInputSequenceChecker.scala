package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface perform input sequence correction for the languages like Thai and Hindi
  *
  * It is derived from {@link com.sun.star.i18n.XInputSequenceChecker} and provides additional functionality to correct input sequence.
  * @since OOo 2.0.1
  */
@js.native
trait XExtendedInputSequenceChecker extends XInputSequenceChecker {
  
  /**
    * @param aText Text to be checked and corrected.
    * @param nPos Index in aText where checking starts.
    * @param cInputChar The input character. Or at least, a UTF16 code unit thereof. It looks like this interface was not designed with non-BMP characters in
    * @param nInputCheckMode One of {@link InputSequenceCheckMode} constants.
    * @returns Next nPos, or length of aText if nothing is corrected.
    */
  def correctInputSequence(aText: js.Array[String], nPos: Double, cInputChar: String, nInputCheckMode: Double): Double = js.native
}
object XExtendedInputSequenceChecker {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    checkInputSequence: (String, Double, String, Double) => Boolean,
    correctInputSequence: (js.Array[String], Double, String, Double) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExtendedInputSequenceChecker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkInputSequence = js.Any.fromFunction4(checkInputSequence), correctInputSequence = js.Any.fromFunction4(correctInputSequence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExtendedInputSequenceChecker]
  }
  
  @scala.inline
  implicit class XExtendedInputSequenceCheckerOps[Self <: XExtendedInputSequenceChecker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCorrectInputSequence(value: (js.Array[String], Double, String, Double) => Double): Self = this.set("correctInputSequence", js.Any.fromFunction4(value))
  }
}
