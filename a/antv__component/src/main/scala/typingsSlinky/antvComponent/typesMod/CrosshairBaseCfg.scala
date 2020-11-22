package typingsSlinky.antvComponent.typesMod

import typingsSlinky.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairBaseCfg extends GroupComponentCfg {
  
  /**
    * 线的样式
    * @type {CrosshairLineCfg}
    */
  var line: js.UndefOr[CrosshairLineCfg] = js.native
  
  /**
    * 附加文本的样式
    * @type {CrosshairTextCfg}
    */
  var text: js.UndefOr[CrosshairTextCfg] = js.native
  
  /**
    * 文本背景的配置项
    * @type {CrosshairTextBackgroundCfg}
    */
  var textBackground: js.UndefOr[CrosshairTextBackgroundCfg] = js.native
}
object CrosshairBaseCfg {
  
  @scala.inline
  def apply(container: IGroup): CrosshairBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairBaseCfg]
  }
  
  @scala.inline
  implicit class CrosshairBaseCfgOps[Self <: CrosshairBaseCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLine(value: CrosshairLineCfg): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setText(value: CrosshairTextCfg): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextBackground(value: CrosshairTextBackgroundCfg): Self = this.set("textBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBackground: Self = this.set("textBackground", js.undefined)
  }
}
