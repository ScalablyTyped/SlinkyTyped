package typingsSlinky.markdownDashIt.markdownDashItMod

import typingsSlinky.markdownDashIt.libMod.MarkdownIt
import typingsSlinky.markdownDashIt.libMod.Options
import typingsSlinky.markdownDashIt.markdownDashItStrings.commonmark
import typingsSlinky.markdownDashIt.markdownDashItStrings.default
import typingsSlinky.markdownDashIt.markdownDashItStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it", JSImport.Namespace)
@js.native
class Class () extends MarkdownIt {
  def this(options: Options) = this()
  def this(presetName: commonmark) = this()
  def this(presetName: default) = this()
  def this(presetName: zero) = this()
  def this(presetName: commonmark, options: Options) = this()
  def this(presetName: default, options: Options) = this()
  def this(presetName: zero, options: Options) = this()
}

