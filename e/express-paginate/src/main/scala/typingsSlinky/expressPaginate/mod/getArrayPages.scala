package typingsSlinky.expressPaginate.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "getArrayPages")
@js.native
object getArrayPages extends js.Object {
  def apply(req: Request_[ParamsDictionary]): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = js.native
}

