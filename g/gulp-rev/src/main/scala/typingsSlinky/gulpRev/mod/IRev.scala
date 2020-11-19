package typingsSlinky.gulpRev.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRev extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  
  def manifest(): ReadWriteStream = js.native
  def manifest(options: IOptions): ReadWriteStream = js.native
  def manifest(path: js.UndefOr[scala.Nothing], options: IOptions): ReadWriteStream = js.native
  def manifest(path: String): ReadWriteStream = js.native
  def manifest(path: String, options: IOptions): ReadWriteStream = js.native
}
