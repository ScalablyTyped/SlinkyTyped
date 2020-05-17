package typingsSlinky.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatted extends js.Object {
  /** The family name (last name) of this person. */
  var familyName: js.UndefOr[String] = js.native
  /** The full name of this person, including middle names, suffixes, etc. */
  var formatted: js.UndefOr[String] = js.native
  /** The given name (first name) of this person. */
  var givenName: js.UndefOr[String] = js.native
  /** The honorific prefixes (such as "Dr." or "Mrs.") for this person. */
  var honorificPrefix: js.UndefOr[String] = js.native
  /** The honorific suffixes (such as "Jr.") for this person. */
  var honorificSuffix: js.UndefOr[String] = js.native
  /** The middle name of this person. */
  var middleName: js.UndefOr[String] = js.native
}

object Formatted {
  @scala.inline
  def apply(): Formatted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatted]
  }
  @scala.inline
  implicit class FormattedOps[Self <: Formatted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
        ret
    }
  }
  
}

