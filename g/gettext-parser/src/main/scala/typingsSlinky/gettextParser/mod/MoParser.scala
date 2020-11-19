package typingsSlinky.gettextParser.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoParser extends js.Object {
  
  def compile(table: GetTextTranslations): Buffer = js.native
  def compile(table: GetTextTranslations, options: js.Any): Buffer = js.native
  
  def parse(buffer: String): GetTextTranslations = js.native
  def parse(buffer: String, defaultCharset: String): GetTextTranslations = js.native
  def parse(buffer: Buffer): GetTextTranslations = js.native
  def parse(buffer: Buffer, defaultCharset: String): GetTextTranslations = js.native
}
