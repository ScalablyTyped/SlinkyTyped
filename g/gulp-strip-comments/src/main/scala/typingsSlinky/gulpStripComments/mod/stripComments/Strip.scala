package typingsSlinky.gulpStripComments.mod.stripComments

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strip extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(options: StripOptions): ReadWriteStream = js.native
  
  def getEOL(): String = js.native
  
  def html(): ReadWriteStream = js.native
  def html(options: StripOptions): ReadWriteStream = js.native
  
  def text(): ReadWriteStream = js.native
  def text(options: StripOptions): ReadWriteStream = js.native
}
