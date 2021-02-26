package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSBooleanKeyword
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSBooleanKeyword: typingsSlinky.babelTypes.babelTypesStrings.TSBooleanKeyword = js.native
}
object TSBooleanKeyword {
  
  @JSImport("babel-types/ts3.6", "TSBooleanKeyword")
  @js.native
  def apply(): TSBooleanKeyword = js.native
  
  @scala.inline
  implicit class TSBooleanKeywordMutableBuilder[Self <: TSBooleanKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSBooleanKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
