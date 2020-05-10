package typingsSlinky.passportSaml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends /* attributeName */ StringDictionary[js.Any] {
  var ID: js.UndefOr[String] = js.native
   // InCommon Attribute urn:oid:0.9.2342.19200300.100.1.3
  var email: js.UndefOr[String] = js.native
  var issuer: js.UndefOr[String] = js.native
  var mail: js.UndefOr[String] = js.native
  var nameID: js.UndefOr[String] = js.native
  var nameIDFormat: js.UndefOr[String] = js.native
  var nameQualifier: js.UndefOr[String] = js.native
  var sessionIndex: js.UndefOr[String] = js.native
  var spNameQualifier: js.UndefOr[String] = js.native
   // get the raw assertion XML
  def getAssertion(): js.Object = js.native
   // `mail` if not present in the assertion
  def getAssertionXml(): String = js.native
   // get the assertion XML parsed as a JavaScript object
  def getSamlResponseXml(): String = js.native
}

object Profile {
  @scala.inline
  def apply(getAssertion: () => js.Object, getAssertionXml: () => String, getSamlResponseXml: () => String): Profile = {
    val __obj = js.Dynamic.literal(getAssertion = js.Any.fromFunction0(getAssertion), getAssertionXml = js.Any.fromFunction0(getAssertionXml), getSamlResponseXml = js.Any.fromFunction0(getSamlResponseXml))
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAssertion(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssertion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAssertionXml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAssertionXml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSamlResponseXml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSamlResponseXml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withMail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(js.undefined)
        ret
    }
    @scala.inline
    def withNameID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameID")(js.undefined)
        ret
    }
    @scala.inline
    def withNameIDFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIDFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameIDFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIDFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNameQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSpNameQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spNameQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpNameQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spNameQualifier")(js.undefined)
        ret
    }
  }
  
}

