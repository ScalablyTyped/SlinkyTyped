package typingsSlinky.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breach_ extends js.Object {
  var AddedDate: String = js.native
  var BreachDate: String = js.native
  var DataClasses: js.Array[String] = js.native
  var Description: String = js.native
  var Domain: String = js.native
  var IsFabricated: Boolean = js.native
  var IsRetired: Boolean = js.native
  var IsSensitive: Boolean = js.native
  var IsSpamList: Boolean = js.native
  var IsVerified: Boolean = js.native
  var LogoPath: String = js.native
  var ModifiedDate: String = js.native
  var Name: String = js.native
  var PwnCount: Double = js.native
  var Title: String = js.native
}

object Breach_ {
  @scala.inline
  def apply(
    AddedDate: String,
    BreachDate: String,
    DataClasses: js.Array[String],
    Description: String,
    Domain: String,
    IsFabricated: Boolean,
    IsRetired: Boolean,
    IsSensitive: Boolean,
    IsSpamList: Boolean,
    IsVerified: Boolean,
    LogoPath: String,
    ModifiedDate: String,
    Name: String,
    PwnCount: Double,
    Title: String
  ): Breach_ = {
    val __obj = js.Dynamic.literal(AddedDate = AddedDate.asInstanceOf[js.Any], BreachDate = BreachDate.asInstanceOf[js.Any], DataClasses = DataClasses.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], IsFabricated = IsFabricated.asInstanceOf[js.Any], IsRetired = IsRetired.asInstanceOf[js.Any], IsSensitive = IsSensitive.asInstanceOf[js.Any], IsSpamList = IsSpamList.asInstanceOf[js.Any], IsVerified = IsVerified.asInstanceOf[js.Any], LogoPath = LogoPath.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PwnCount = PwnCount.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breach_]
  }
  @scala.inline
  implicit class Breach_Ops[Self <: Breach_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreachDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreachDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFabricated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFabricated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRetired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRetired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpamList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpamList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogoPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPwnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PwnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

