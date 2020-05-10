package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceObjectFiles extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit = js.native
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile = js.native
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile = js.native
  def Item(Index: Double): ISourceObjectFile = js.native
  def Remove(Index: Double): Unit = js.native
}

object ISourceObjectFiles {
  @scala.inline
  def apply(
    Add: (Double, ISourceObjectFile) => Unit,
    AddEmptyFile: (String, String) => ISourceObjectFile,
    AddFile: (String, String, String) => ISourceObjectFile,
    Count: Double,
    Item: Double => ISourceObjectFile,
    Remove: Double => Unit
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddEmptyFile = js.Any.fromFunction2(AddEmptyFile), AddFile = js.Any.fromFunction3(AddFile), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ISourceObjectFiles]
  }
  @scala.inline
  implicit class ISourceObjectFilesOps[Self <: ISourceObjectFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, ISourceObjectFile) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddEmptyFile(value: (String, String) => ISourceObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddEmptyFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddFile(value: (String, String, String) => ISourceObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => ISourceObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

