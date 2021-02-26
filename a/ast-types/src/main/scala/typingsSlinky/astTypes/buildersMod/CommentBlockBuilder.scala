package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Leading
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentBlockBuilder extends StObject {
  
  def apply(value: String): CommentBlock = js.native
  def apply(value: String, leading: js.UndefOr[scala.Nothing], trailing: Boolean): CommentBlock = js.native
  def apply(value: String, leading: Boolean): CommentBlock = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): CommentBlock = js.native
  
  def from(params: Leading): CommentBlock = js.native
}
