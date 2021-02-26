package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyNameMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", "getPropertyNameText")
  @js.native
  def getPropertyNameText(node: PropertyName): String | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", "hasPropertyNameText")
  @js.native
  def hasPropertyNameText(node: PropertyName): /* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean = js.native
  
  /** Type that describes a property name with an obtainable text. */
  /* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.angularCore.angularCoreStrings.escapedText
    - typingsSlinky.angularCore.angularCoreStrings.text
    - typingsSlinky.angularCore.angularCoreStrings.originalKeywordKind
    - typingsSlinky.angularCore.angularCoreStrings.isInJSDocNamespace
  */
  trait PropertyNameWithText extends StObject
  object PropertyNameWithText {
    
    @scala.inline
    def escapedText: typingsSlinky.angularCore.angularCoreStrings.escapedText = "escapedText".asInstanceOf[typingsSlinky.angularCore.angularCoreStrings.escapedText]
    
    @scala.inline
    def isInJSDocNamespace: typingsSlinky.angularCore.angularCoreStrings.isInJSDocNamespace = "isInJSDocNamespace".asInstanceOf[typingsSlinky.angularCore.angularCoreStrings.isInJSDocNamespace]
    
    @scala.inline
    def originalKeywordKind: typingsSlinky.angularCore.angularCoreStrings.originalKeywordKind = "originalKeywordKind".asInstanceOf[typingsSlinky.angularCore.angularCoreStrings.originalKeywordKind]
    
    @scala.inline
    def text: typingsSlinky.angularCore.angularCoreStrings.text = "text".asInstanceOf[typingsSlinky.angularCore.angularCoreStrings.text]
  }
}
