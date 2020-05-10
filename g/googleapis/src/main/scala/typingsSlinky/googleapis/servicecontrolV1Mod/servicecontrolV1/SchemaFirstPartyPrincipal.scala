package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * First party identity principal.
  */
@js.native
trait SchemaFirstPartyPrincipal extends js.Object {
  /**
    * The email address of a Google account. .
    */
  var principalEmail: js.UndefOr[String] = js.native
  /**
    * Metadata about the service that uses the service account. .
    */
  var serviceMetadata: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaFirstPartyPrincipal {
  @scala.inline
  def apply(): SchemaFirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyPrincipal]
  }
  @scala.inline
  implicit class SchemaFirstPartyPrincipalOps[Self <: SchemaFirstPartyPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipalEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMetadata(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMetadata")(js.undefined)
        ret
    }
  }
  
}

