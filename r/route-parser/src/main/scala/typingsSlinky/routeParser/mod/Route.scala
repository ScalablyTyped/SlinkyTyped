package typingsSlinky.routeParser.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.routeParser.routeParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route[TParams /* <: js.Object */] extends js.Object {
  /**
    * Match a path against this route, returning the matched parameters if
    * it matches, false if not.
    * @example
    * var route = new Route('/this/is/my/route')
    * route.match('/this/is/my/route') // -> {}
    * @example
    * var route = new Route('/:one/:two')
    * route.match('/foo/bar/') // -> {one: 'foo', two: 'bar'}
    */
  def `match`(pathname: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typingsSlinky.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false` = js.native
  /**
    * Reverse a route specification to a path, returning false if it can't be
    * fulfilled
    * @example
    * var route = new Route('/:one/:two')
    * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
    */
  def reverse(params: TParams): String | `false` = js.native
}

object Route {
  @scala.inline
  def apply[TParams](
    `match`: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typingsSlinky.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false`,
    reverse: TParams => String | `false`
  ): Route[TParams] = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route[TParams]]
  }
  @scala.inline
  implicit class RouteOps[Self[tparams] <: Route[tparams], TParams] (val x: Self[TParams]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParams] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParams]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParams] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParams] with Other]
    @scala.inline
    def withMatch(
      value: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof TParams ]: string}
      */ typingsSlinky.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false`
    ): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReverse(value: TParams => String | `false`): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

