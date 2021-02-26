package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorParameterHintOptions extends StObject {
  
  /**
    * Enable cycling of parameter hints.
    * Defaults to false.
    */
  var cycle: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable parameter hints.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object IEditorParameterHintOptions {
  
  @scala.inline
  def apply(): IEditorParameterHintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorParameterHintOptions]
  }
  
  @scala.inline
  implicit class IEditorParameterHintOptionsMutableBuilder[Self <: IEditorParameterHintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
