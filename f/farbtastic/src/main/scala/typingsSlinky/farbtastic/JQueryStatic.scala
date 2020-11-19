package typingsSlinky.farbtastic

import typingsSlinky.farbtastic.JQueryFarbtastic.Callback
import typingsSlinky.farbtastic.JQueryFarbtastic.Farbtastic
import typingsSlinky.farbtastic.JQueryFarbtastic.Options
import typingsSlinky.farbtastic.JQueryFarbtastic.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def farbtastic(placeholder: Placeholder): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, callback: Callback): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, options: Options): Farbtastic = js.native
}
