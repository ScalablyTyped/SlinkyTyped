package typingsSlinky.graphql.formatErrorMod

import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLFormattedError[TExtensions /* <: Record[String, _] */] extends js.Object {
  /**
    * Reserved for implementors to extend the protocol however they see fit,
    * and hence there are no additional restrictions on its contents.
    */
  val extensions: js.UndefOr[TExtensions] = js.native
  /**
    * If an error can be associated to a particular point in the requested
    * GraphQL document, it should contain a list of locations.
    */
  val locations: js.UndefOr[js.Array[SourceLocation]] = js.native
  /**
    * A short, human-readable summary of the problem that **SHOULD NOT** change
    * from occurrence to occurrence of the problem, except for purposes of
    * localization.
    */
  val message: String = js.native
  /**
    * If an error can be associated to a particular field in the GraphQL result,
    * it _must_ contain an entry with the key `path` that details the path of
    * the response field which experienced the error. This allows clients to
    * identify whether a null result is intentional or caused by a runtime error.
    */
  val path: js.UndefOr[js.Array[String | Double]] = js.native
}

object GraphQLFormattedError {
  @scala.inline
  def apply[TExtensions](message: String): GraphQLFormattedError[TExtensions] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFormattedError[TExtensions]]
  }
  @scala.inline
  implicit class GraphQLFormattedErrorOps[Self[textensions] <: GraphQLFormattedError[textensions], TExtensions] (val x: Self[TExtensions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TExtensions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TExtensions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TExtensions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TExtensions] with Other]
    @scala.inline
    def withMessage(value: String): Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: TExtensions): Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[SourceLocation]): Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String | Double]): Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[TExtensions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

