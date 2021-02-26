package typingsSlinky.rcTabs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.Tab
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OperationNodeProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait OperationNodeProps extends StObject {
    
    var activeKey: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(key: Key, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(key: Key, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
  
  type _To = ForwardRefExoticComponent[OperationNodeProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `operationNodeMod.foo` */
  override def _to: ForwardRefExoticComponent[OperationNodeProps with RefAttributes[HTMLDivElement]] = default
}
