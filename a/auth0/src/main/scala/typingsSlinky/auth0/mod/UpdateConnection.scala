package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnection extends js.Object {
  /**
    * The identifiers of the clients for which the connection is to
    * be enabled. If the array is empty or the property is not
    * specified, no clients are enabled.
    */
  var enabled_clients: js.UndefOr[js.Array[String]] = js.native
  /**
    * True if the connection is domain level.
    */
  var is_domain_connection: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Defines the realms for which the connection will be used
    * (ie: email domains). If the array is empty or the property is
    * not specified, the connection name will be added as realm.
    */
  var realms: js.UndefOr[js.Array[String]] = js.native
}

object UpdateConnection {
  @scala.inline
  def apply(): UpdateConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnection]
  }
  @scala.inline
  implicit class UpdateConnectionOps[Self <: UpdateConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled_clients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled_clients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled_clients")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_domain_connection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_domain_connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_domain_connection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_domain_connection")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRealms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realms")(js.undefined)
        ret
    }
  }
  
}

