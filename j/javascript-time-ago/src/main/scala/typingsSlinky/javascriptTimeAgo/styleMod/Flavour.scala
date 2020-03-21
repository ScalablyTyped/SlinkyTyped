package typingsSlinky.javascriptTimeAgo.styleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
  - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
  - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
  - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short
  - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long
*/
trait Flavour extends js.Object

object Flavour {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long = this.cast("long")
  @scala.inline
  def narrow: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short = this.cast("short")
  @scala.inline
  def `short-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = this.cast("short-time")
  @scala.inline
  def tiny: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = this.cast("tiny")
}

