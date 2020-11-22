package typingsSlinky.domelementtype.mod

import typingsSlinky.domelementtype.domelementtypeStrings.cdata
import typingsSlinky.domelementtype.domelementtypeStrings.comment
import typingsSlinky.domelementtype.domelementtypeStrings.directive
import typingsSlinky.domelementtype.domelementtypeStrings.doctype
import typingsSlinky.domelementtype.domelementtypeStrings.script
import typingsSlinky.domelementtype.domelementtypeStrings.style
import typingsSlinky.domelementtype.domelementtypeStrings.tag
import typingsSlinky.domelementtype.domelementtypeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.domelementtype.domelementtypeStrings.text
  - typingsSlinky.domelementtype.domelementtypeStrings.directive
  - typingsSlinky.domelementtype.domelementtypeStrings.comment
  - typingsSlinky.domelementtype.domelementtypeStrings.script
  - typingsSlinky.domelementtype.domelementtypeStrings.style
  - typingsSlinky.domelementtype.domelementtypeStrings.tag
  - typingsSlinky.domelementtype.domelementtypeStrings.cdata
  - typingsSlinky.domelementtype.domelementtypeStrings.doctype
*/
trait ElementType extends js.Object
object ElementType {
  
  /** Type for <![CDATA[ ... ]]> */
  @scala.inline
  def CDATA: cdata = "cdata".asInstanceOf[cdata]
  
  /** Type for <!-- ... --> */
  @scala.inline
  def Comment: comment = "comment".asInstanceOf[comment]
  
  /** Type for <? ... ?> */
  @scala.inline
  def Directive: directive = "directive".asInstanceOf[directive]
  
  /** Type for <!doctype ...> */
  @scala.inline
  def Doctype: doctype = "doctype".asInstanceOf[doctype]
  
  /** Type for <script> tags */
  @scala.inline
  def Script: script = "script".asInstanceOf[script]
  
  /** Type for <style> tags */
  @scala.inline
  def Style: style = "style".asInstanceOf[style]
  
  /** Type for Any tag */
  @scala.inline
  def Tag: tag = "tag".asInstanceOf[tag]
  
  /** Type for Text */
  @scala.inline
  def Text: text = "text".asInstanceOf[text]
}
