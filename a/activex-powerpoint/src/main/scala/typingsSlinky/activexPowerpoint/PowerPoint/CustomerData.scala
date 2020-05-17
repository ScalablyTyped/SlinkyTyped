package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerData extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData = js.native
  def Add(): CustomXMLPart = js.native
  def Delete(Id: String): Unit = js.native
  def Item(Id: String): CustomXMLPart = js.native
}

object CustomerData {
  @scala.inline
  def apply(
    Add: () => CustomXMLPart,
    Application: Application,
    Count: Double,
    Delete: String => Unit,
    Item: String => CustomXMLPart,
    Parent: js.Any,
    PowerPointDotCustomerData_typekey: CustomerData
  ): CustomerData = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction0(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomerData_typekey")(PowerPointDotCustomerData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerData]
  }
  @scala.inline
  implicit class CustomerDataOps[Self <: CustomerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: () => CustomXMLPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
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
    def withItem(value: String => CustomXMLPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotCustomerData_typekey(value: CustomerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.CustomerData_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

