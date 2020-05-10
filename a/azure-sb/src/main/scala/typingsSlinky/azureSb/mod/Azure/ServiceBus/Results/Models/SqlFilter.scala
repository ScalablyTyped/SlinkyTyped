package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import typingsSlinky.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
  */
@js.native
trait SqlFilter extends js.Object {
  val CompatibilityLevel: String = js.native
  var Parameters: js.UndefOr[Dictionary[_]] = js.native
  var RequiresPreprocessing: js.UndefOr[String] = js.native
  var SqlExpression: String = js.native
}

object SqlFilter {
  @scala.inline
  def apply(CompatibilityLevel: String, SqlExpression: String): SqlFilter = {
    val __obj = js.Dynamic.literal(CompatibilityLevel = CompatibilityLevel.asInstanceOf[js.Any], SqlExpression = SqlExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFilter]
  }
  @scala.inline
  implicit class SqlFilterOps[Self <: SqlFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibilityLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibilityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresPreprocessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresPreprocessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresPreprocessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresPreprocessing")(js.undefined)
        ret
    }
  }
  
}

