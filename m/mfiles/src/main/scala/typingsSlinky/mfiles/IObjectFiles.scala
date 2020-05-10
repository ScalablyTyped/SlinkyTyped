package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectFiles extends js.Object {
  val Count: Double = js.native
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile = js.native
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double = js.native
  def Item(Index: Double): IObjectFile = js.native
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit = js.native
  def ToJSON(): String = js.native
}

object IObjectFiles {
  @scala.inline
  def apply(
    Count: Double,
    GetObjectFileByNameForFileSystem: String => IObjectFile,
    GetObjectFileIndexByNameForFileSystem: String => Double,
    Item: Double => IObjectFile,
    Sort: IObjectFileComparer => Unit,
    ToJSON: () => String
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GetObjectFileByNameForFileSystem = js.Any.fromFunction1(GetObjectFileByNameForFileSystem), GetObjectFileIndexByNameForFileSystem = js.Any.fromFunction1(GetObjectFileIndexByNameForFileSystem), Item = js.Any.fromFunction1(Item), Sort = js.Any.fromFunction1(Sort), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjectFiles]
  }
  @scala.inline
  implicit class IObjectFilesOps[Self <: IObjectFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObjectFileByNameForFileSystem(value: String => IObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectFileByNameForFileSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetObjectFileIndexByNameForFileSystem(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectFileIndexByNameForFileSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IObjectFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: IObjectFileComparer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

