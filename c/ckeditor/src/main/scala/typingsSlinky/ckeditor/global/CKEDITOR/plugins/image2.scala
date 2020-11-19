package typingsSlinky.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.anon.Removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.image2")
@js.native
object image2 extends js.Object {
  
  def checkHasNaturalRatio(image: element): Boolean = js.native
  
  def getLinkAttributesGetter(): js.Function2[/* editor */ editor, /* data */ StringDictionary[String], Removed] = js.native
  
  def getLinkAttributesParser(): js.Function2[/* editor */ editor, /* element */ element, StringDictionary[String]] = js.native
  
  def getNatural(image: element): StringDictionary[String] = js.native
}
