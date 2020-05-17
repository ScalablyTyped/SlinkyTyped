package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataSequence
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An internal DataProvider that has more access to data than a plain DataProvider. */
@js.native
trait XInternalDataProvider extends XDataProvider {
  /** same as insertSequence with nAfterIndex being the largest current index of the data, i.e. (size - 1) */
  def appendSequence(): Unit = js.native
  /**
    * deletes an additional sequence for categories at nLevel>=1; categories at level 0 are always present and cannot be deleted
    * @since OOo 3.3
    */
  def deleteComplexCategoryLevel(nLevel: Double): Unit = js.native
  def deleteDataPointForAllSequences(nAtIndex: Double): Unit = js.native
  def deleteSequence(nAtIndex: Double): Unit = js.native
  def getDataByRangeRepresentation(aRange: String): SafeArray[_] = js.native
  def hasDataByRangeRepresentation(aRange: String): Boolean = js.native
  /**
    * insert an additional sequence for categories nLevel>=1; categories at level 0 are always present and cannot be inserted or deleted
    * @since OOo 3.3
    */
  def insertComplexCategoryLevel(nLevel: Double): Unit = js.native
  def insertDataPointForAllSequences(nAfterIndex: Double): Unit = js.native
  def insertSequence(nAfterIndex: Double): Unit = js.native
  /**
    * If range representations of data sequences change due to internal structural changes, they must be registered at the data provider.
    *
    * Sequences that are directly retrieved via the methods of the XDataProvider interface are already registered. If a labeled data sequence was created by
    * cloning an existing one, it has to be explicitly registered via this method.
    */
  def registerDataSequenceForChanges(xSeq: XDataSequence): Unit = js.native
  def setDataByRangeRepresentation(aRange: String, aNewData: SeqEquiv[_]): Unit = js.native
  def swapDataPointWithNextOneForAllSequences(nAtIndex: Double): Unit = js.native
}

object XInternalDataProvider {
  @scala.inline
  def apply(
    RangeSelection: XRangeSelection,
    acquire: () => Unit,
    appendSequence: () => Unit,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    deleteComplexCategoryLevel: Double => Unit,
    deleteDataPointForAllSequences: Double => Unit,
    deleteSequence: Double => Unit,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    getDataByRangeRepresentation: String => SafeArray[_],
    getRangeSelection: () => XRangeSelection,
    hasDataByRangeRepresentation: String => Boolean,
    insertComplexCategoryLevel: Double => Unit,
    insertDataPointForAllSequences: Double => Unit,
    insertSequence: Double => Unit,
    queryInterface: `type` => js.Any,
    registerDataSequenceForChanges: XDataSequence => Unit,
    release: () => Unit,
    setDataByRangeRepresentation: (String, SeqEquiv[_]) => Unit,
    swapDataPointWithNextOneForAllSequences: Double => Unit
  ): XInternalDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendSequence = js.Any.fromFunction0(appendSequence), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), deleteComplexCategoryLevel = js.Any.fromFunction1(deleteComplexCategoryLevel), deleteDataPointForAllSequences = js.Any.fromFunction1(deleteDataPointForAllSequences), deleteSequence = js.Any.fromFunction1(deleteSequence), detectArguments = js.Any.fromFunction1(detectArguments), getDataByRangeRepresentation = js.Any.fromFunction1(getDataByRangeRepresentation), getRangeSelection = js.Any.fromFunction0(getRangeSelection), hasDataByRangeRepresentation = js.Any.fromFunction1(hasDataByRangeRepresentation), insertComplexCategoryLevel = js.Any.fromFunction1(insertComplexCategoryLevel), insertDataPointForAllSequences = js.Any.fromFunction1(insertDataPointForAllSequences), insertSequence = js.Any.fromFunction1(insertSequence), queryInterface = js.Any.fromFunction1(queryInterface), registerDataSequenceForChanges = js.Any.fromFunction1(registerDataSequenceForChanges), release = js.Any.fromFunction0(release), setDataByRangeRepresentation = js.Any.fromFunction2(setDataByRangeRepresentation), swapDataPointWithNextOneForAllSequences = js.Any.fromFunction1(swapDataPointWithNextOneForAllSequences))
    __obj.asInstanceOf[XInternalDataProvider]
  }
  @scala.inline
  implicit class XInternalDataProviderOps[Self <: XInternalDataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendSequence(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSequence")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteComplexCategoryLevel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComplexCategoryLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteDataPointForAllSequences(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDataPointForAllSequences")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteSequence(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSequence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDataByRangeRepresentation(value: String => SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataByRangeRepresentation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasDataByRangeRepresentation(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDataByRangeRepresentation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertComplexCategoryLevel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertComplexCategoryLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertDataPointForAllSequences(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertDataPointForAllSequences")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertSequence(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSequence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterDataSequenceForChanges(value: XDataSequence => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerDataSequenceForChanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataByRangeRepresentation(value: (String, SeqEquiv[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataByRangeRepresentation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSwapDataPointWithNextOneForAllSequences(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDataPointWithNextOneForAllSequences")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

