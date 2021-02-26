package typingsSlinky.ckeditor.global.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.transformationTools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.filter {
  def this(editorOrRules: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
}
object filter {
  
  @JSGlobal("CKEDITOR.filter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CKEDITOR.filter.transformationTools")
  @js.native
  def transformationTools: typingsSlinky.ckeditor.CKEDITOR.filter.transformationTools = js.native
  @scala.inline
  def transformationTools_=(x: transformationTools): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformationTools")(x.asInstanceOf[js.Any])
  
  /* static member */
  object instances
}
