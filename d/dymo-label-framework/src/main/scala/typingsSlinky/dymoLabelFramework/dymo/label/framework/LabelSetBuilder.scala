package typingsSlinky.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * LabelSetBuilder is used to create a LabelSet to print multiple labels in one print job.
	 * LabelSet is a collection of records. Each record contains multiple pairs; each pair consists
	 * of the object name and the object text data/content. The data of each record are applied to all
	 * corresponend objects and for each record one label is printed.
	 */
@js.native
trait LabelSetBuilder extends js.Object {
  /**
  		 * Adds a new record to the LabelSet. Returns a record object.
  		 */
  def addRecord(): ILabelSetRecord = js.native
  /**
  		 * Get all record objects in this LabelSetBuilder.
  		 */
  def getRecords(): js.Array[ILabelSetRecord] = js.native
}

object LabelSetBuilder {
  @scala.inline
  def apply(addRecord: () => ILabelSetRecord, getRecords: () => js.Array[ILabelSetRecord]): LabelSetBuilder = {
    val __obj = js.Dynamic.literal(addRecord = js.Any.fromFunction0(addRecord), getRecords = js.Any.fromFunction0(getRecords))
    __obj.asInstanceOf[LabelSetBuilder]
  }
  @scala.inline
  implicit class LabelSetBuilderOps[Self <: LabelSetBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRecord(value: () => ILabelSetRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRecord")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecords(value: () => js.Array[ILabelSetRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

