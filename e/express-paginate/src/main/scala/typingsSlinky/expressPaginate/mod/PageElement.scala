package typingsSlinky.expressPaginate.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElement extends js.Object {
  var number: Double = js.native
  @JSName("url")
  var url_Original: js.Function1[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
  ] = js.native
  def url(req: Request_[ParamsDictionary, _, _, Query]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = js.native
}

