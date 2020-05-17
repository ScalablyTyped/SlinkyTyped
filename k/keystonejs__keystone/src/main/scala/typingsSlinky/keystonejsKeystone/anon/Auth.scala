package typingsSlinky.keystonejsKeystone.anon

import typingsSlinky.keystonejsKeystone.mod.Access
import typingsSlinky.keystonejsKeystone.mod.AccessCallback
import typingsSlinky.keystonejsKeystone.mod.AuthenticationContext
import typingsSlinky.keystonejsKeystone.mod.GraphQLWhereClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends Access {
  var auth: js.UndefOr[Boolean] = js.native
  var create: js.UndefOr[Boolean | AccessCallback] = js.native
  var delete: js.UndefOr[Boolean | AccessCallback] = js.native
  var read: js.UndefOr[Boolean | GraphQLWhereClause | AccessCallback] = js.native
  var update: js.UndefOr[Boolean | AccessCallback] = js.native
}

object Auth {
  @scala.inline
  def apply(): Auth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth]
  }
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Boolean | AccessCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Boolean | AccessCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: Boolean | GraphQLWhereClause | AccessCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean | AccessCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

