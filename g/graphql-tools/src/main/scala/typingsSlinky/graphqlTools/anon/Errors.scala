package typingsSlinky.graphqlTools.anon

import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphqlTools.graphqlToolsStrings.CHILDREN
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.native
  var kind: CHILDREN = js.native
}

object Errors {
  @scala.inline
  def apply(kind: CHILDREN): Errors = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: CHILDREN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[GraphQLFormattedError[Record[String, _]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

