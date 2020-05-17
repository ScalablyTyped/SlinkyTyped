package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to modify the suggestion list returned by a spell checker.
  *
  * Basically this is needed to post-add further suggestions while keeping the originally returned reference from the spell checker. E.g. from the user
  * dictionaries.
  * @see com.sun.star.linguistic2.XSpellAlternatives
  */
@js.native
trait XSetSpellAlternatives extends XInterface {
  /**
    * set the list of suggestions to be returned.
    * @since OOo 3.0.1
    */
  def setAlternatives(aAlternatives: SeqEquiv[String]): Unit = js.native
  /**
    * set the type of error found.
    * @see com.sun.star.linguistic2.SpellFailure
    * @since OOo 3.0.1
    */
  def setFailureType(nFailureType: Double): Unit = js.native
}

object XSetSpellAlternatives {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAlternatives: SeqEquiv[String] => Unit,
    setFailureType: Double => Unit
  ): XSetSpellAlternatives = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlternatives = js.Any.fromFunction1(setAlternatives), setFailureType = js.Any.fromFunction1(setFailureType))
    __obj.asInstanceOf[XSetSpellAlternatives]
  }
  @scala.inline
  implicit class XSetSpellAlternativesOps[Self <: XSetSpellAlternatives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAlternatives(value: SeqEquiv[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlternatives")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFailureType(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFailureType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

