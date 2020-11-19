package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.CheckBoxProps>> */
@js.native
trait RecursivePartialPartialCh extends js.Object {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var center: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var checked: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var checkedColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var checkedIcon: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var checkedTitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var fontFamily: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var iconRight: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var iconType: js.UndefOr[RecursivePartial[js.UndefOr[IconType]]] = js.native
  
  var onIconPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLongIconPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var right: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialTextProperties]]] = js.native
  
  var uncheckedColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var uncheckedIcon: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
}
object RecursivePartialPartialCh {
  
  @scala.inline
  def apply(): RecursivePartialPartialCh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialCh]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialChOps[Self <: RecursivePartialPartialCh] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setCenter(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setChecked(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckedColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedColor: Self = this.set("checkedColor", js.undefined)
    
    @scala.inline
    def setCheckedIcon(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    
    @scala.inline
    def setCheckedTitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("checkedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedTitle: Self = this.set("checkedTitle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setIconRight(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    
    @scala.inline
    def setIconType(value: RecursivePartial[js.UndefOr[IconType]]): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setOnIconPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onIconPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnIconPress: Self = this.set("onIconPress", js.undefined)
    
    @scala.inline
    def setOnLongIconPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onLongIconPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLongIconPress: Self = this.set("onLongIconPress", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setRight(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setSize(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleProps(value: RecursivePartial[js.UndefOr[PartialTextProperties]]): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setUncheckedColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("uncheckedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedColor: Self = this.set("uncheckedColor", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedIcon: Self = this.set("uncheckedIcon", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
