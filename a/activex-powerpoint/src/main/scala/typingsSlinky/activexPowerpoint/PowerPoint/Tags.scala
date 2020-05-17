package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags = js.native
  def Add(Name: String, Value: String): Unit = js.native
  def AddBinary(Name: String, FilePath: String): Unit = js.native
  def BinaryValue(Name: String): Double = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Name: String): String = js.native
  def Name(Index: Double): String = js.native
  def Value(Index: Double): String = js.native
}

object Tags {
  @scala.inline
  def apply(
    Add: (String, String) => Unit,
    AddBinary: (String, String) => Unit,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Unit,
    Item: String => String,
    Name: Double => String,
    Parent: js.Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddBinary = js.Any.fromFunction2(AddBinary), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddBinary(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddBinary")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryValue(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTags_typekey(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Tags_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

