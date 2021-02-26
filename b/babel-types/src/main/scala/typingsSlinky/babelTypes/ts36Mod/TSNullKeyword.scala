package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNullKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSNullKeyword: typingsSlinky.babelTypes.babelTypesStrings.TSNullKeyword = js.native
}
object TSNullKeyword {
  
  @JSImport("babel-types/ts3.6", "TSNullKeyword")
  @js.native
  def apply(): TSNullKeyword = js.native
  
  @scala.inline
  implicit class TSNullKeywordMutableBuilder[Self <: TSNullKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
