package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object to represent a person.
  */
@js.native
trait SchemaPerson extends js.Object {
  /**
    * The person&#39;s email addresses
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.native
  /**
    * The resource name of the person to provide information about. See &lt;a
    * href=&quot;https://developers.google.com/people/api/rest/v1/people/get&quot;&gt;
    * People.get&lt;/a&gt; from Google People API.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Obfuscated ID of a person.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  /**
    * The person&#39;s name
    */
  var personNames: js.UndefOr[js.Array[SchemaName]] = js.native
  /**
    * A person&#39;s read-only photo. A picture shown next to the person&#39;s
    * name to help others recognize the person in search results.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}

object SchemaPerson {
  @scala.inline
  def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  @scala.inline
  implicit class SchemaPersonOps[Self <: SchemaPerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObfuscatedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObfuscatedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatedId")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonNames(value: js.Array[SchemaName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[SchemaPhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(js.undefined)
        ret
    }
  }
  
}

