package typingsSlinky.netflixNerror.mod

import typingsSlinky.netflixNerror.mod.VError.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@netflix/nerror", "VError")
@js.native
class VError_ protected () extends Error {
  def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
  def this(message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
  def this(options: js.Error, message: String, params: js.Any*) = this()
  
  def cause(): js.UndefOr[js.Error] = js.native
}
