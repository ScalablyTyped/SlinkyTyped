package typingsSlinky.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  @JSName("DAO.Error_typekey")
  var DAODotError_typekey: Error = js.native
  val Description: String = js.native
  val HelpContext: Double = js.native
  val HelpFile: String = js.native
  val Number: Double = js.native
  val Source: String = js.native
}

object Error {
  @scala.inline
  def apply(
    DAODotError_typekey: Error,
    Description: String,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    Source: String
  ): Error = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Error_typekey")(DAODotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDAODotError_typekey(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.Error_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpContext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

