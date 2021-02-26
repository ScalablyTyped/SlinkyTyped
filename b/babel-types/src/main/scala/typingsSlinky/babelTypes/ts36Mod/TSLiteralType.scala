package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSLiteralType
  extends Node
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ = js.native
  
  @JSName("type")
  var type_TSLiteralType: typingsSlinky.babelTypes.babelTypesStrings.TSLiteralType = js.native
}
object TSLiteralType {
  
  @JSImport("babel-types/ts3.6", "TSLiteralType")
  @js.native
  def apply(literal: BooleanLiteral_): TSLiteralType = js.native
  @JSImport("babel-types/ts3.6", "TSLiteralType")
  @js.native
  def apply(literal: NumericLiteral_): TSLiteralType = js.native
  @JSImport("babel-types/ts3.6", "TSLiteralType")
  @js.native
  def apply(literal: StringLiteral_): TSLiteralType = js.native
  
  @scala.inline
  implicit class TSLiteralTypeMutableBuilder[Self <: TSLiteralType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiteral(value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
