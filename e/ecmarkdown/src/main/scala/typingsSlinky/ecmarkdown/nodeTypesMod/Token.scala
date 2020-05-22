package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownBooleans.`true`
import typingsSlinky.ecmarkdown.ecmarkdownStrings.EOF
import typingsSlinky.ecmarkdown.ecmarkdownStrings.comment
import typingsSlinky.ecmarkdown.ecmarkdownStrings.linebreak
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.opaqueTag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.parabreak
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.text
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import typingsSlinky.ecmarkdown.ecmarkdownStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.EOFToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.FormatToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.ParabreakToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.LinebreakToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.WhitespaceToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.TextToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.CommentToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.TagToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListToken
  - typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagToken
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def WhitespaceToken(contents: String, name: whitespace, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def LinebreakToken(contents: String, name: linebreak, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def OrderedListToken(contents: String, name: ol, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def CommentToken(contents: String, name: comment, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def EOFToken(done: `true`, name: EOF, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def TagToken(contents: String, name: tag, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ParabreakToken(contents: String, name: parabreak, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def FormatToken(contents: String, name: Format, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def TextToken(contents: String, name: text, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def UnorderedListToken(contents: String, name: ul, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def OpaqueTagToken(contents: String, name: opaqueTag, location: LocationRange = null): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

