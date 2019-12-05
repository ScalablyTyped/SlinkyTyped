package typingsSlinky.expressDashUseragent.expressDashUseragentMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-useragent", "express")
@js.native
object express extends js.Object {
  def apply(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.UndefOr[NextFunction], 
    Unit
  ] = js.native
}

