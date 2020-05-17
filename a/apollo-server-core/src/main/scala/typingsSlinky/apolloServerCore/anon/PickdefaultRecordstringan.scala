package typingsSlinky.apolloServerCore.anon

import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-core.apollo-server-core/dist/graphqlOptions.default<std.Record<string, any>, any>, 'debug' | 'formatError'> */
@js.native
trait PickdefaultRecordstringan extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
}

object PickdefaultRecordstringan {
  @scala.inline
  def apply(): PickdefaultRecordstringan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickdefaultRecordstringan]
  }
  @scala.inline
  implicit class PickdefaultRecordstringanOps[Self <: PickdefaultRecordstringan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
  }
  
}

