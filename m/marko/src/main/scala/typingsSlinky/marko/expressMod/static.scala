package typingsSlinky.marko.expressMod

import typingsSlinky.express.anon.Typeofm
import typingsSlinky.expressServeStaticCore.mod.Handler
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("marko/express", "static")
@js.native
object static extends js.Object {
  
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
  
  var mime: Typeofm = js.native
  
  def serveStatic(root: String): Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
}
