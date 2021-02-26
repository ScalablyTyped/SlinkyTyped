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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Token extends StObject
object Token {
  
  @scala.inline
  def CommentToken(contents: String, location: LocationRange, name: comment): typingsSlinky.ecmarkdown.nodeTypesMod.CommentToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.CommentToken]
  }
  
  @scala.inline
  def EOFToken(done: `true`, location: LocationRange, name: EOF): typingsSlinky.ecmarkdown.nodeTypesMod.EOFToken = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.EOFToken]
  }
  
  @scala.inline
  def FormatToken(contents: String, location: LocationRange, name: Format): typingsSlinky.ecmarkdown.nodeTypesMod.FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.FormatToken]
  }
  
  @scala.inline
  def LinebreakToken(contents: String, location: LocationRange, name: linebreak): typingsSlinky.ecmarkdown.nodeTypesMod.LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.LinebreakToken]
  }
  
  @scala.inline
  def OpaqueTagToken(contents: String, location: LocationRange, name: opaqueTag): typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagToken]
  }
  
  @scala.inline
  def OrderedListToken(contents: String, location: LocationRange, name: ol): typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListToken]
  }
  
  @scala.inline
  def ParabreakToken(contents: String, location: LocationRange, name: parabreak): typingsSlinky.ecmarkdown.nodeTypesMod.ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.ParabreakToken]
  }
  
  @scala.inline
  def TagToken(contents: String, location: LocationRange, name: tag): typingsSlinky.ecmarkdown.nodeTypesMod.TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TagToken]
  }
  
  @scala.inline
  def TextToken(contents: String, location: LocationRange, name: text): typingsSlinky.ecmarkdown.nodeTypesMod.TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TextToken]
  }
  
  @scala.inline
  def UnorderedListToken(contents: String, location: LocationRange, name: ul): typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListToken]
  }
  
  @scala.inline
  def WhitespaceToken(contents: String, location: LocationRange, name: whitespace): typingsSlinky.ecmarkdown.nodeTypesMod.WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.WhitespaceToken]
  }
}
