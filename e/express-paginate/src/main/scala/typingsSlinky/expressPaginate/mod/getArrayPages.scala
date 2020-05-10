package typingsSlinky.expressPaginate.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "getArrayPages")
@js.native
object getArrayPages extends js.Object {
  def apply(req: Request_[ParamsDictionary, _, _, Query]): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = js.native
}

