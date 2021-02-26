package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParseOptions extends StObject {
  
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.native
  
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.native
  
  /** Use trailing comment when both leading comment and trailing comment exist. */
  var preferTrailingComment: js.UndefOr[Boolean] = js.native
}
object IParseOptions {
  
  @scala.inline
  def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  
  @scala.inline
  implicit class IParseOptionsMutableBuilder[Self <: IParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateCommentMode(value: Boolean): Self = StObject.set(x, "alternateCommentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateCommentModeUndefined: Self = StObject.set(x, "alternateCommentMode", js.undefined)
    
    @scala.inline
    def setKeepCase(value: Boolean): Self = StObject.set(x, "keepCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepCaseUndefined: Self = StObject.set(x, "keepCase", js.undefined)
    
    @scala.inline
    def setPreferTrailingComment(value: Boolean): Self = StObject.set(x, "preferTrailingComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferTrailingCommentUndefined: Self = StObject.set(x, "preferTrailingComment", js.undefined)
  }
}
