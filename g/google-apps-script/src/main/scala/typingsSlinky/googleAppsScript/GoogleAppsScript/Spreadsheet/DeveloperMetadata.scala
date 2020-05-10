package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
@js.native
trait DeveloperMetadata extends js.Object {
  def getId(): Integer = js.native
  def getKey(): String = js.native
  def getLocation(): DeveloperMetadataLocation = js.native
  def getValue(): String | Null = js.native
  def getVisibility(): DeveloperMetadataVisibility = js.native
  def moveToColumn(column: Range): DeveloperMetadata = js.native
  def moveToRow(row: Range): DeveloperMetadata = js.native
  def moveToSheet(sheet: Sheet): DeveloperMetadata = js.native
  def moveToSpreadsheet(): DeveloperMetadata = js.native
  def remove(): Unit = js.native
  def setKey(key: String): DeveloperMetadata = js.native
  def setValue(value: String): DeveloperMetadata = js.native
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata = js.native
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: () => Integer,
    getKey: () => String,
    getLocation: () => DeveloperMetadataLocation,
    getValue: () => String | Null,
    getVisibility: () => DeveloperMetadataVisibility,
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: () => DeveloperMetadata,
    remove: () => Unit,
    setKey: String => DeveloperMetadata,
    setValue: String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getKey = js.Any.fromFunction0(getKey), getLocation = js.Any.fromFunction0(getLocation), getValue = js.Any.fromFunction0(getValue), getVisibility = js.Any.fromFunction0(getVisibility), moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = js.Any.fromFunction0(moveToSpreadsheet), remove = js.Any.fromFunction0(remove), setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[DeveloperMetadata]
  }
  @scala.inline
  implicit class DeveloperMetadataOps[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocation(value: () => DeveloperMetadataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibility(value: () => DeveloperMetadataVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibility")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToColumn(value: Range => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToRow(value: Range => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToSheet(value: Sheet => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToSpreadsheet(value: () => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToSpreadsheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetKey(value: String => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisibility(value: DeveloperMetadataVisibility => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibility")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

