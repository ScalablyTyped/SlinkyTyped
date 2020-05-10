package typingsSlinky.expressUseragent.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-useragent", "express")
@js.native
object express extends js.Object {
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ js.UndefOr[NextFunction], 
    Unit
  ] = js.native
}

