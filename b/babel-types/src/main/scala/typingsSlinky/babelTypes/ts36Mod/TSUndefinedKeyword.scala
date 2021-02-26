package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSUndefinedKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword: typingsSlinky.babelTypes.babelTypesStrings.TSUndefinedKeyword = js.native
}
object TSUndefinedKeyword {
  
  @JSImport("babel-types/ts3.6", "TSUndefinedKeyword")
  @js.native
  def apply(): TSUndefinedKeyword = js.native
  
  @scala.inline
  implicit class TSUndefinedKeywordMutableBuilder[Self <: TSUndefinedKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
