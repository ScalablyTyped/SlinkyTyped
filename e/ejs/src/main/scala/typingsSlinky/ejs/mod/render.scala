package typingsSlinky.ejs.mod

import typingsSlinky.ejs.anon.Optionsasyncfalse
import typingsSlinky.ejs.anon.Optionsasyncnever
import typingsSlinky.ejs.anon.Optionsasynctrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "render")
@js.native
object render extends js.Object {
  def apply(template: String): String = js.native
  def apply(template: String, data: js.UndefOr[Data], opts: Optionsasyncnever): String = js.native
  def apply(template: String, data: js.UndefOr[Data], opts: Optionsasynctrue): js.Promise[String] = js.native
  def apply(template: String, data: Data): String = js.native
  def apply(template: String, data: Data, opts: Optionsasyncfalse): String = js.native
  def apply(template: String, data: Data, opts: Options): String | js.Promise[String] = js.native
}

