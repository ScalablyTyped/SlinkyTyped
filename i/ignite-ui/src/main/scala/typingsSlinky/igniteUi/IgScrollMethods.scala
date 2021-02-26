package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgScrollMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * This method overrides the base method and does nothing, because the scoll container shouldn't change the container locales
    * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def option(optionName: js.Object, value: js.Object): Unit = js.native
  
  def refresh(): Unit = js.native
}
object IgScrollMethods {
  
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: () => Unit,
    option: (js.Object, js.Object) => Unit,
    refresh: () => Unit
  ): IgScrollMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), option = js.Any.fromFunction2(option), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[IgScrollMethods]
  }
  
  @scala.inline
  implicit class IgScrollMethodsMutableBuilder[Self <: IgScrollMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOption(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
