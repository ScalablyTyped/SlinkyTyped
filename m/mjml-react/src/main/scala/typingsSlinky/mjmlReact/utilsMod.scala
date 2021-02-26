package typingsSlinky.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mjml-react/utils", "addQueryParams")
  @js.native
  def addQueryParams(url: String, params: StringDictionary[js.Any]): String = js.native
  
  @JSImport("mjml-react/utils", "fixConditionalComment")
  @js.native
  def fixConditionalComment(html: String, havingContent: String, newCondition: String): String = js.native
  
  @JSImport("mjml-react/utils", "getTextAlign")
  @js.native
  def getTextAlign(value: String): TextAlignment = js.native
  @JSImport("mjml-react/utils", "getTextAlign")
  @js.native
  def getTextAlign(value: String, fallback: TextAlignment): TextAlignment = js.native
  
  @JSImport("mjml-react/utils", "namedEntityToHexCode")
  @js.native
  def namedEntityToHexCode(html: String): String = js.native
  
  @JSImport("mjml-react/utils", "toMobileFontSize")
  @js.native
  def toMobileFontSize(sizeWithUnit: String): Double = js.native
  
  @JSImport("mjml-react/utils", "useHttps")
  @js.native
  def useHttps(): js.UndefOr[String] = js.native
  @JSImport("mjml-react/utils", "useHttps")
  @js.native
  def useHttps(url: String): js.UndefOr[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mjmlReact.mjmlReactStrings.left
    - typingsSlinky.mjmlReact.mjmlReactStrings.right
    - typingsSlinky.mjmlReact.mjmlReactStrings.center
    - typingsSlinky.mjmlReact.mjmlReactStrings.justify
    - typingsSlinky.mjmlReact.mjmlReactStrings.inherit
  */
  trait TextAlignment extends StObject
  object TextAlignment {
    
    @scala.inline
    def center: typingsSlinky.mjmlReact.mjmlReactStrings.center = "center".asInstanceOf[typingsSlinky.mjmlReact.mjmlReactStrings.center]
    
    @scala.inline
    def inherit: typingsSlinky.mjmlReact.mjmlReactStrings.inherit = "inherit".asInstanceOf[typingsSlinky.mjmlReact.mjmlReactStrings.inherit]
    
    @scala.inline
    def justify: typingsSlinky.mjmlReact.mjmlReactStrings.justify = "justify".asInstanceOf[typingsSlinky.mjmlReact.mjmlReactStrings.justify]
    
    @scala.inline
    def left: typingsSlinky.mjmlReact.mjmlReactStrings.left = "left".asInstanceOf[typingsSlinky.mjmlReact.mjmlReactStrings.left]
    
    @scala.inline
    def right: typingsSlinky.mjmlReact.mjmlReactStrings.right = "right".asInstanceOf[typingsSlinky.mjmlReact.mjmlReactStrings.right]
  }
}
