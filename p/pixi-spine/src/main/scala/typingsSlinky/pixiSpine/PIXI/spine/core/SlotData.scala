package typingsSlinky.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotData extends StObject {
  
  var attachmentName: String = js.native
  
  var blendMode: BlendMode = js.native
  
  var boneData: BoneData = js.native
  
  var color: Color = js.native
  
  var darkColor: Color = js.native
  
  var index: Double = js.native
  
  var name: String = js.native
}
object SlotData {
  
  @scala.inline
  def apply(
    attachmentName: String,
    blendMode: BlendMode,
    boneData: BoneData,
    color: Color,
    darkColor: Color,
    index: Double,
    name: String
  ): SlotData = {
    val __obj = js.Dynamic.literal(attachmentName = attachmentName.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], boneData = boneData.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotData]
  }
  
  @scala.inline
  implicit class SlotDataMutableBuilder[Self <: SlotData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentName(value: String): Self = StObject.set(x, "attachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoneData(value: BoneData): Self = StObject.set(x, "boneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
