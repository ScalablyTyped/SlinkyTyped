package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupOptions extends IObjectOptions {
  
  /**
    * Indicates if click, mouseover, mouseout events & hoverCursor should also check for subtargets
    * @type Boolean
    */
  var subTargetCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
    * available setting this boolean to true.
    * @type Boolean
    * @since 2.0.0
    * @default
    */
  var useSetOnGroup: js.UndefOr[Boolean] = js.native
}
object IGroupOptions {
  
  @scala.inline
  def apply(): IGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupOptions]
  }
  
  @scala.inline
  implicit class IGroupOptionsMutableBuilder[Self <: IGroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubTargetCheck(value: Boolean): Self = StObject.set(x, "subTargetCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTargetCheckUndefined: Self = StObject.set(x, "subTargetCheck", js.undefined)
    
    @scala.inline
    def setUseSetOnGroup(value: Boolean): Self = StObject.set(x, "useSetOnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSetOnGroupUndefined: Self = StObject.set(x, "useSetOnGroup", js.undefined)
  }
}
