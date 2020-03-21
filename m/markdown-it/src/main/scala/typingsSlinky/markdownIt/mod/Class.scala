package typingsSlinky.markdownIt.mod

import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.libMod.Options
import typingsSlinky.markdownIt.markdownItStrings.commonmark
import typingsSlinky.markdownIt.markdownItStrings.default
import typingsSlinky.markdownIt.markdownItStrings.zero
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

