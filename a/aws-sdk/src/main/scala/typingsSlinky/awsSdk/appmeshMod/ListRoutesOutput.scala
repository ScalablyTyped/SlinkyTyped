package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoutesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListRoutes request.
    When the results of a ListRoutes request exceed limit, you can
    use this value to retrieve the next page of results. This value is null when
    there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing routes for the specified service mesh and virtual router.
    */
  var routes: RouteList = js.native
}

object ListRoutesOutput {
  @scala.inline
  def apply(routes: RouteList): ListRoutesOutput = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutesOutput]
  }
  @scala.inline
  implicit class ListRoutesOutputOps[Self <: ListRoutesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutes(value: RouteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

