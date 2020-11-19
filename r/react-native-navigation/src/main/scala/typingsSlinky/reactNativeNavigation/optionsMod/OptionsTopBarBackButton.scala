package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNative.mod.ImageRequireSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarBackButton extends js.Object {
  
  /**
    * Back button icon and text color
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Set subtitle font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  
  /**
    * Set subtitle font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Image to show as the back button
    */
  var icon: js.UndefOr[ImageRequireSource] = js.native
  
  /**
    * Button id for reference press event
    * #### (Android specific)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Show title or just the icon
    * #### (iOS specific)
    */
  var showTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  
  /**
    * Set the back button title
    * #### (iOS specific)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Weither the back button is visible or not
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsTopBarBackButton {
  
  @scala.inline
  def apply(): OptionsTopBarBackButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarBackButton]
  }
  
  @scala.inline
  implicit class OptionsTopBarBackButtonOps[Self <: OptionsTopBarBackButton] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageRequireSource): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
