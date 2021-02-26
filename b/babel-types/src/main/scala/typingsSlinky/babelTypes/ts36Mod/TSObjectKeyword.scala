package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSObjectKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSObjectKeyword: typingsSlinky.babelTypes.babelTypesStrings.TSObjectKeyword = js.native
}
object TSObjectKeyword {
  
  @JSImport("babel-types/ts3.6", "TSObjectKeyword")
  @js.native
  def apply(): TSObjectKeyword = js.native
  
  @scala.inline
  implicit class TSObjectKeywordMutableBuilder[Self <: TSObjectKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
