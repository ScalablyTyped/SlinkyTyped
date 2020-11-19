package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cascade extends js.Object {
  
  var cascade: Boolean = js.native
  
  var cols: Double = js.native
  
  def format(values: js.Array[String]): String = js.native
  
  var pickerPrefixCls: String = js.native
  
  var popupPrefixCls: String = js.native
  
  var prefixCls: String = js.native
  
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  
  var title: String = js.native
  
  var triggerType: String = js.native
}
object Cascade {
  
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    styles: StringDictionary[RegisteredStyle[_]],
    title: String,
    triggerType: String
  ): Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascade]
  }
  
  @scala.inline
  implicit class CascadeOps[Self <: Cascade] (val x: Self) extends AnyVal {
    
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Array[String] => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupPrefixCls(value: String): Self = this.set("popupPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
}
