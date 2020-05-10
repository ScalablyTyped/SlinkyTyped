package typingsSlinky.emberRouting.routeInfoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteInfo extends js.Object {
  /**
    * A reference to the childe route's `RouteInfo`.
    * This can be used to traverse downward to the leafmost `RouteInfo`.
    */
  val child: RouteInfo | Null = js.native
  /**
    * The final segment of the fully-qualified name of the route, like "index".
    */
  val localName: String = js.native
  /**
    * The dot-separated, fully-qualified name of the route, like "people.index".
    */
  val name: String = js.native
  /**
    * The ordered list of the names of the params required for this route.
    * It will contain the same strings as `Object.keys(params)`, but here the order is significant.
    * This allows users to correctly pass params into routes programmatically.
    */
  val paramNames: js.Array[String] = js.native
  /**
    * The values of the route's parameters.
    * These are the same params that are received as arguments to the route's `model` hook.
    * Contains only the parameters valid for this route, if any (params for parent or child routes are not merged).
    */
  val params: StringDictionary[js.UndefOr[String]] = js.native
  /**
    * A reference to the parent route's `RouteInfo`.
    * This can be used to traverse upward to the topmost `RouteInfo`.
    */
  val parent: RouteInfo | Null = js.native
  /**
    * The values of any query params on this route.
    */
  val queryParams: StringDictionary[js.UndefOr[String]] = js.native
  /**
    * Allows you to traverse through the linked list of `RouteInfo`s from the topmost to leafmost.
    * Returns the first `RouteInfo` in the linked list for which the callback returns true.
    *
    * @param callback the callback to execute.
    */
  def find(callback: js.Function1[/* item */ this.type, Boolean]): js.UndefOr[RouteInfo] = js.native
}

object RouteInfo {
  @scala.inline
  def apply(
    find: js.Function1[RouteInfo, Boolean] => js.UndefOr[RouteInfo],
    localName: String,
    name: String,
    paramNames: js.Array[String],
    params: StringDictionary[js.UndefOr[String]],
    queryParams: StringDictionary[js.UndefOr[String]]
  ): RouteInfo = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramNames = paramNames.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteInfo]
  }
  @scala.inline
  implicit class RouteInfoOps[Self <: RouteInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFind(value: js.Function1[RouteInfo, Boolean] => js.UndefOr[RouteInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParamNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParams(value: StringDictionary[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(value: RouteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(null)
        ret
    }
    @scala.inline
    def withParent(value: RouteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

