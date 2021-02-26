package typingsSlinky.parse5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributesLocation = org.scalablytyped.runtime.StringDictionary[typingsSlinky.parse5.mod.Location]
  
  type ChildNode = typingsSlinky.parse5.mod.DefaultTreeChildNode | js.Object
  
  type CommentNode = typingsSlinky.parse5.mod.DefaultTreeCommentNode | js.Object
  
  type Document = typingsSlinky.parse5.mod.DefaultTreeDocument | js.Object
  
  type DocumentFragment = typingsSlinky.parse5.mod.DefaultTreeDocumentFragment | js.Object
  
  type DocumentType = typingsSlinky.parse5.mod.DefaultTreeDocumentType | js.Object
  
  type Element = typingsSlinky.parse5.mod.DefaultTreeElement | js.Object
  
  type Node = typingsSlinky.parse5.mod.DefaultTreeNode | js.Object
  
  type ParentNode = typingsSlinky.parse5.mod.DefaultTreeParentNode | js.Object
  
  type TextNode = typingsSlinky.parse5.mod.DefaultTreeTextNode | js.Object
  
  @scala.inline
  def parse(html: java.lang.String): typingsSlinky.parse5.mod.Document = typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.parse5.mod.Document]
  @scala.inline
  def parse(html: java.lang.String, options: typingsSlinky.parse5.mod.ParserOptions): typingsSlinky.parse5.mod.Document = (typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.parse5.mod.Document]
  
  @scala.inline
  def parseFragment(fragmentContext: typingsSlinky.parse5.mod.Element, html: java.lang.String): typingsSlinky.parse5.mod.DocumentFragment = (typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(
    fragmentContext: typingsSlinky.parse5.mod.Element,
    html: java.lang.String,
    options: typingsSlinky.parse5.mod.ParserOptions
  ): typingsSlinky.parse5.mod.DocumentFragment = (typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(html: java.lang.String): typingsSlinky.parse5.mod.DocumentFragment = typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.parse5.mod.DocumentFragment]
  @scala.inline
  def parseFragment(html: java.lang.String, options: typingsSlinky.parse5.mod.ParserOptions): typingsSlinky.parse5.mod.DocumentFragment = (typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.parse5.mod.DocumentFragment]
  
  @scala.inline
  def serialize(node: typingsSlinky.parse5.mod.Node): java.lang.String = typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def serialize(node: typingsSlinky.parse5.mod.Node, options: typingsSlinky.parse5.mod.SerializerOptions): java.lang.String = (typingsSlinky.parse5.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
