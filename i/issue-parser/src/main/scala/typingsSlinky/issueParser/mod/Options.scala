package typingsSlinky.issueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.issueParser.issueParserStrings.github
  - typingsSlinky.issueParser.issueParserStrings.gitlab
  - typingsSlinky.issueParser.issueParserStrings.bitbucket
  - typingsSlinky.issueParser.issueParserStrings.waffle
  - typingsSlinky.issueParser.mod.Overrides
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def github: typingsSlinky.issueParser.issueParserStrings.github = "github".asInstanceOf[typingsSlinky.issueParser.issueParserStrings.github]
  @scala.inline
  def gitlab: typingsSlinky.issueParser.issueParserStrings.gitlab = "gitlab".asInstanceOf[typingsSlinky.issueParser.issueParserStrings.gitlab]
  @scala.inline
  def bitbucket: typingsSlinky.issueParser.issueParserStrings.bitbucket = "bitbucket".asInstanceOf[typingsSlinky.issueParser.issueParserStrings.bitbucket]
  @scala.inline
  def waffle: typingsSlinky.issueParser.issueParserStrings.waffle = "waffle".asInstanceOf[typingsSlinky.issueParser.issueParserStrings.waffle]
  @scala.inline
  implicit def apply(value: Overrides): Options = value.asInstanceOf[Options]
}

