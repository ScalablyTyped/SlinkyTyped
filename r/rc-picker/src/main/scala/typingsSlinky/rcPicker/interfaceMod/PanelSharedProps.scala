package typingsSlinky.rcPicker.interfaceMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelSharedProps[DateType] extends js.Object {
  
  /** [Legacy] Set default display picker view date */
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  
  var generateConfig: GenerateConfig[DateType] = js.native
  
  var locale: Locale = js.native
  
  var nextIcon: js.UndefOr[ReactElement] = js.native
  
  def onPanelChange(mode: Null, viewValue: DateType): Unit = js.native
  def onPanelChange(mode: PanelMode, viewValue: DateType): Unit = js.native
  
  var onSelect: OnSelect[DateType] = js.native
  
  def onViewDateChange(value: DateType): Unit = js.native
  
  /**
    * Typescript can not handle generic type so we can not use `forwardRef` here.
    * Thus, move ref into operationRef.
    * This is little hack which should refactor after typescript support.
    */
  var operationRef: MutableRefObject[PanelRefProps] = js.native
  
  var prefixCls: String = js.native
  
  var prevIcon: js.UndefOr[ReactElement] = js.native
  
  var superNextIcon: js.UndefOr[ReactElement] = js.native
  
  var superPrevIcon: js.UndefOr[ReactElement] = js.native
  
  var value: js.UndefOr[NullableDateType[DateType]] = js.native
  
  var viewDate: DateType = js.native
}
