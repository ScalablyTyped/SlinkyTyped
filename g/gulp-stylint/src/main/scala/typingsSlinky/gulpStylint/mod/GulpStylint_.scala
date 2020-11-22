package typingsSlinky.gulpStylint.mod

import typingsSlinky.gulpStylint.anon.FailOnWarning
import typingsSlinky.gulpStylint.gulpStylintStrings.fail
import typingsSlinky.gulpStylint.mod.GulpStylint.Options
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GulpStylint_ extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  def reporter(): ReadWriteStream = js.native
  def reporter(options: GulpStylint): ReadWriteStream = js.native
  @JSName("reporter")
  def reporter_fail(identifier: fail): ReadWriteStream = js.native
  @JSName("reporter")
  def reporter_fail(identifier: fail, options: FailOnWarning): ReadWriteStream = js.native
}
