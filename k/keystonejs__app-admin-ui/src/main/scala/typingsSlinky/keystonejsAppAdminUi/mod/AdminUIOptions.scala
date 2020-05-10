package typingsSlinky.keystonejsAppAdminUi.mod

import typingsSlinky.keystonejsAppAdminUi.AnonAuthentication
import typingsSlinky.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUIOptions[ListNames /* <: String */, UserType /* <: js.Object */] extends js.Object {
  var adminPath: js.UndefOr[String] = js.native
  var apiPath: js.UndefOr[String] = js.native
  var authStrategy: js.UndefOr[BaseAuthStrategy] = js.native
  var enableDefaultRoute: js.UndefOr[Boolean] = js.native
  var graphiqlPath: js.UndefOr[String] = js.native
  var isAccessAllowed: js.UndefOr[js.Function1[/* opts */ AnonAuthentication[UserType, ListNames], Boolean]] = js.native
  var pages: js.UndefOr[js.Array[_]] = js.native
  var schemaName: js.UndefOr[String] = js.native
}

object AdminUIOptions {
  @scala.inline
  def apply[ListNames, UserType](): AdminUIOptions[ListNames, UserType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminUIOptions[ListNames, UserType]]
  }
  @scala.inline
  implicit class AdminUIOptionsOps[Self[listnames, usertype] <: AdminUIOptions[listnames, usertype], ListNames, UserType] (val x: Self[ListNames, UserType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ListNames, UserType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ListNames, UserType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ListNames, UserType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ListNames, UserType]) with Other]
    @scala.inline
    def withAdminPath(value: String): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminPath: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminPath")(js.undefined)
        ret
    }
    @scala.inline
    def withApiPath(value: String): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiPath: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthStrategy(value: BaseAuthStrategy): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthStrategy: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDefaultRoute(value: Boolean): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDefaultRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDefaultRoute: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDefaultRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphiqlPath(value: String): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiqlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphiqlPath: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphiqlPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAccessAllowed(value: /* opts */ AnonAuthentication[UserType, ListNames] => Boolean): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAccessAllowed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsAccessAllowed: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAccessAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[_]): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self[ListNames, UserType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
  }
  
}

