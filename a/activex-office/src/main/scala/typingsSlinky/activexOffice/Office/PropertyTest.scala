package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyTest extends js.Object {
  val Application: js.Any = js.native
  val Condition: MsoCondition = js.native
  val Connector: MsoConnector = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  @JSName("Office.PropertyTest_typekey")
  var OfficeDotPropertyTest_typekey: PropertyTest = js.native
  val SecondValue: js.Any = js.native
  val Value: js.Any = js.native
}

object PropertyTest {
  @scala.inline
  def apply(
    Application: js.Any,
    Condition: MsoCondition,
    Connector: MsoConnector,
    Creator: Double,
    Name: String,
    OfficeDotPropertyTest_typekey: PropertyTest,
    SecondValue: js.Any,
    Value: js.Any
  ): PropertyTest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Connector = Connector.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SecondValue = SecondValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PropertyTest_typekey")(OfficeDotPropertyTest_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyTest]
  }
  @scala.inline
  implicit class PropertyTestOps[Self <: PropertyTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: MsoCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnector(value: MsoConnector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotPropertyTest_typekey(value: PropertyTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.PropertyTest_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

