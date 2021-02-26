package typingsSlinky.domelementtype

import typingsSlinky.domelementtype.anon.Type
import typingsSlinky.domelementtype.domelementtypeStrings.cdata
import typingsSlinky.domelementtype.domelementtypeStrings.comment
import typingsSlinky.domelementtype.domelementtypeStrings.directive
import typingsSlinky.domelementtype.domelementtypeStrings.doctype
import typingsSlinky.domelementtype.domelementtypeStrings.script
import typingsSlinky.domelementtype.domelementtypeStrings.style
import typingsSlinky.domelementtype.domelementtypeStrings.tag
import typingsSlinky.domelementtype.domelementtypeStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domelementtype", "CDATA")
  @js.native
  val CDATA: String | Double = js.native
  
  @JSImport("domelementtype", "Comment")
  @js.native
  val Comment: String | Double = js.native
  
  @JSImport("domelementtype", "Directive")
  @js.native
  val Directive: String | Double = js.native
  
  @JSImport("domelementtype", "Doctype")
  @js.native
  val Doctype: String | Double = js.native
  
  @JSImport("domelementtype", "Script")
  @js.native
  val Script: String | Double = js.native
  
  @JSImport("domelementtype", "Style")
  @js.native
  val Style: String | Double = js.native
  
  @JSImport("domelementtype", "Tag")
  @js.native
  val Tag: String | Double = js.native
  
  @JSImport("domelementtype", "Text")
  @js.native
  val Text: String | Double = js.native
  
  @JSImport("domelementtype", "isTag")
  @js.native
  def isTag(elem: Type): Boolean = js.native
  
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
  trait ElementType extends StObject
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
}
