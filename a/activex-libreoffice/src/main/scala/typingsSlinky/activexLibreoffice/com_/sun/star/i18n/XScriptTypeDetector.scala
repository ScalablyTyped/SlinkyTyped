package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the help routines for layouting complex text
  *
  * Assumption - StartPos is inclusive and EndPos is exclusive.
  *
  * The **nScriptDirection** parameters are of type {@link ScriptDirection}
  * @since OOo 1.1.2
  */
@js.native
trait XScriptTypeDetector extends XInterface {
  /** @returns the position where the specified CTL Script Type starts. */
  def beginOfCTLScriptType(aText: String, nPos: Double): Double = js.native
  /** @returns the position where the specified Script Direction starts. */
  def beginOfScriptDirection(aText: String, nPos: Double, nScriptDirection: Double): Double = js.native
  /** @returns the position where the specified CTL Script Type ends. */
  def endOfCTLScriptType(aText: String, nPos: Double): Double = js.native
  /** @returns the position where the specified Script Direction ends. */
  def endOfScriptDirection(aText: String, nPos: Double, nScriptDirection: Double): Double = js.native
  /** @returns the CTL script type of the current position. ;  One of {@link CTLScriptType} constants. */
  def getCTLScriptType(aText: String, nPos: Double): Double = js.native
  /** @returns the Script Direction of the current position. */
  def getScriptDirection(aText: String, nPos: Double, nDefaultScriptDirection: Double): Double = js.native
}

object XScriptTypeDetector {
  @scala.inline
  def apply(
    acquire: () => Unit,
    beginOfCTLScriptType: (String, Double) => Double,
    beginOfScriptDirection: (String, Double, Double) => Double,
    endOfCTLScriptType: (String, Double) => Double,
    endOfScriptDirection: (String, Double, Double) => Double,
    getCTLScriptType: (String, Double) => Double,
    getScriptDirection: (String, Double, Double) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptTypeDetector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginOfCTLScriptType = js.Any.fromFunction2(beginOfCTLScriptType), beginOfScriptDirection = js.Any.fromFunction3(beginOfScriptDirection), endOfCTLScriptType = js.Any.fromFunction2(endOfCTLScriptType), endOfScriptDirection = js.Any.fromFunction3(endOfScriptDirection), getCTLScriptType = js.Any.fromFunction2(getCTLScriptType), getScriptDirection = js.Any.fromFunction3(getScriptDirection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptTypeDetector]
  }
  @scala.inline
  implicit class XScriptTypeDetectorOps[Self <: XScriptTypeDetector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginOfCTLScriptType(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginOfCTLScriptType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeginOfScriptDirection(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginOfScriptDirection")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEndOfCTLScriptType(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfCTLScriptType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndOfScriptDirection(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfScriptDirection")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCTLScriptType(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCTLScriptType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetScriptDirection(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptDirection")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

