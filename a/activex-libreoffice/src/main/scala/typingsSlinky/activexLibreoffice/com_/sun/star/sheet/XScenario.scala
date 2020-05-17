package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XScenario extends XInterface {
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean = js.native
  /** returns the comment for the scenario. */
  var ScenarioComment: String = js.native
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit = js.native
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit = js.native
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean = js.native
  /** returns the comment for the scenario. */
  def getScenarioComment(): String = js.native
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit = js.native
}

object XScenario {
  @scala.inline
  def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: () => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScenarioComment: String => Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
    __obj.asInstanceOf[XScenario]
  }
  @scala.inline
  implicit class XScenarioOps[Self <: XScenario] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsScenario(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsScenario")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenarioComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScenarioComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsScenario(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsScenario")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScenarioComment(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScenarioComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetScenarioComment(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScenarioComment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

