package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antd.uploadInterfaceMod.ItemRender
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListProgressProps
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadListListItemMod extends Shortcut {
  
  @JSImport("antd/lib/upload/UploadList/ListItem", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ListItemProps extends StObject {
    
    def actionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String): ReactElement = js.native
    def actionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String, title: String): ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])] = js.native
    
    var file: UploadFile[_] = js.native
    
    def iconRender(file: UploadFile[_]): ReactElement = js.native
    
    var isImgUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[_]] = js.native
    
    var items: js.Array[UploadFile[_]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    def onClose(file: UploadFile[_]): Unit = js.native
    
    def onDownload(file: UploadFile[_]): Unit = js.native
    
    def onPreview(file: UploadFile[_], e: SyntheticEvent[Event, HTMLElement]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  
  type _To = ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `uploadListListItemMod.foo` */
  override def _to: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLDivElement]] = default
}
