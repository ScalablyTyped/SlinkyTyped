package typingsSlinky.express.expressMod

import typingsSlinky.express.Typeofm
import typingsSlinky.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("express", "static")
@js.native
object static extends js.Object {
  var mime: Typeofm = js.native
  def apply(root: String): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def apply(root: String, options: ServeStaticOptions): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(root: String): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler = js.native
}

