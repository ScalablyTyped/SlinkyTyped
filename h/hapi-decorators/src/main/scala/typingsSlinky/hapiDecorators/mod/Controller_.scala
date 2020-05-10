package typingsSlinky.hapiDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller_ extends js.Object {
  var baseUrl: String = js.native
  def routes(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
  ] = js.native
}

object Controller_ {
  @scala.inline
  def apply(
    baseUrl: String,
    routes: () => js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
    ]
  ): Controller_ = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], routes = js.Any.fromFunction0(routes))
    __obj.asInstanceOf[Controller_]
  }
  @scala.inline
  implicit class Controller_Ops[Self <: Controller_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(
      value: () => js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

