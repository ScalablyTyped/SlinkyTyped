package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XConditionalFormat extends XIndexAccess {
  /**
    * Creates a new conditional format entry and insert its at the position.
    * @param Type a com.sun.star.sheet.ConditionFormatEntryType specifying the type of the new entry
    * @param Position the position in the conditional format
    */
  def createEntry(Type: Double, Position: Double): Unit = js.native
  def removeByIndex(Index: Double): Unit = js.native
}

object XConditionalFormat {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    createEntry: (Double, Double) => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XConditionalFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEntry = js.Any.fromFunction2(createEntry), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XConditionalFormat]
  }
  @scala.inline
  implicit class XConditionalFormatOps[Self <: XConditionalFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateEntry(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveByIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeByIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

