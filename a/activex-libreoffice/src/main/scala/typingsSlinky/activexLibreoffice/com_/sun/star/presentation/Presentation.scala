package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service is a presentation that is available from a {@link PresentationDocument} via the {@link XPresentationSupplier} interface. */
@js.native
trait Presentation
  extends XPresentation
     with XPropertySet {
  
  /** enables/disables the shape animations. */
  var AllowAnimations: Boolean = js.native
  
  /** If this string is not empty, it contains the name of a customized show that is used for the presentation. */
  var CustomShow: String = js.native
  
  /** If this string is not empty, it contains the name of the page where the presentation is started. */
  var FirstPage: String = js.native
  
  /** If this property is set to `TRUE` , the window of the presentation is always on top of all other windows. */
  var IsAlwaysOnTop: Boolean = js.native
  
  /**
    * If this property is `TRUE` , all pages are changed automatically.
    *
    * This overrides the properties of the pages.
    */
  var IsAutomatic: Boolean = js.native
  
  /** If this property is set to `TRUE` , the presentation is repeated endlessly. */
  var IsEndless: Boolean = js.native
  
  /** If this property is set to `TRUE` , the presentation runs in full-screen mode. */
  var IsFullScreen: Boolean = js.native
  
  /**
    * With this property, you can set the presentation to live mode.
    *
    * Implementations that have no live mode capability may ignore this property and always return false.
    */
  var IsLivePresentation: Boolean = js.native
  
  /** If this property is `TRUE` , the mouse is visible during the presentation. */
  var IsMouseVisible: Boolean = js.native
  
  /**
    * is the duration of the black screen after the presentation has finished.
    *
    * If this is set to `0` , no black screen is shown.
    */
  var Pause: Double = js.native
  
  /** If this is set to `TRUE` , the Navigator is opened at the start of the presentation. */
  var StartWithNavigator: Boolean = js.native
  
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: Boolean = js.native
}
object Presentation {
  
  @scala.inline
  def apply(
    AllowAnimations: Boolean,
    CustomShow: String,
    FirstPage: String,
    IsAlwaysOnTop: Boolean,
    IsAutomatic: Boolean,
    IsEndless: Boolean,
    IsFullScreen: Boolean,
    IsLivePresentation: Boolean,
    IsMouseVisible: Boolean,
    Pause: Double,
    PropertySetInfo: XPropertySetInfo,
    StartWithNavigator: Boolean,
    UsePen: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    end: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    start: () => Unit
  ): Presentation = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations.asInstanceOf[js.Any], CustomShow = CustomShow.asInstanceOf[js.Any], FirstPage = FirstPage.asInstanceOf[js.Any], IsAlwaysOnTop = IsAlwaysOnTop.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsEndless = IsEndless.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], IsLivePresentation = IsLivePresentation.asInstanceOf[js.Any], IsMouseVisible = IsMouseVisible.asInstanceOf[js.Any], Pause = Pause.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StartWithNavigator = StartWithNavigator.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Presentation]
  }
  
  @scala.inline
  implicit class PresentationOps[Self <: Presentation] (val x: Self) extends AnyVal {
    
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
    def setAllowAnimations(value: Boolean): Self = this.set("AllowAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomShow(value: String): Self = this.set("CustomShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPage(value: String): Self = this.set("FirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlwaysOnTop(value: Boolean): Self = this.set("IsAlwaysOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomatic(value: Boolean): Self = this.set("IsAutomatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEndless(value: Boolean): Self = this.set("IsEndless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("IsFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLivePresentation(value: Boolean): Self = this.set("IsLivePresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMouseVisible(value: Boolean): Self = this.set("IsMouseVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: Double): Self = this.set("Pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWithNavigator(value: Boolean): Self = this.set("StartWithNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePen(value: Boolean): Self = this.set("UsePen", value.asInstanceOf[js.Any])
  }
}
