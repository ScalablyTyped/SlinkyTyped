package typingsSlinky.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Company field in a Contact.
  */
@js.native
trait CompanyField extends js.Object {
  def deleteCompanyField(): Unit = js.native
  def getCompanyName(): String = js.native
  def getJobTitle(): String = js.native
  def isPrimary(): Boolean = js.native
  def setAsPrimary(): CompanyField = js.native
  def setCompanyName(company: String): CompanyField = js.native
  def setJobTitle(title: String): CompanyField = js.native
}

object CompanyField {
  @scala.inline
  def apply(
    deleteCompanyField: () => Unit,
    getCompanyName: () => String,
    getJobTitle: () => String,
    isPrimary: () => Boolean,
    setAsPrimary: () => CompanyField,
    setCompanyName: String => CompanyField,
    setJobTitle: String => CompanyField
  ): CompanyField = {
    val __obj = js.Dynamic.literal(deleteCompanyField = js.Any.fromFunction0(deleteCompanyField), getCompanyName = js.Any.fromFunction0(getCompanyName), getJobTitle = js.Any.fromFunction0(getJobTitle), isPrimary = js.Any.fromFunction0(isPrimary), setAsPrimary = js.Any.fromFunction0(setAsPrimary), setCompanyName = js.Any.fromFunction1(setCompanyName), setJobTitle = js.Any.fromFunction1(setJobTitle))
    __obj.asInstanceOf[CompanyField]
  }
  @scala.inline
  implicit class CompanyFieldOps[Self <: CompanyField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteCompanyField(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCompanyField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCompanyName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompanyName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJobTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJobTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPrimary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAsPrimary(value: () => CompanyField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsPrimary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCompanyName(value: String => CompanyField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompanyName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetJobTitle(value: String => CompanyField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJobTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

