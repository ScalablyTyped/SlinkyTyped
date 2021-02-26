package typingsSlinky.antd

import typingsSlinky.antd.anon.Current
import typingsSlinky.antd.antdStrings.checkedKeys
import typingsSlinky.antd.antdStrings.handleClear
import typingsSlinky.antd.antdStrings.handleFilter
import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferListMod.TransferListProps
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import typingsSlinky.antd.typeMod.ElementOf
import typingsSlinky.antd.typeMod.Omit
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBodyMod {
  
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  class default[RecordType /* <: KeyWiseTransferItem */] () extends ListBody[RecordType]
  object default {
    
    /* static member */
    @JSImport("antd/lib/transfer/ListBody", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps[T](hasFilteredRenderItemsPagination: TransferListBodyProps[T], hasCurrent: TransferListBodyState): Current | Null = js.native
  }
  
  @JSImport("antd/lib/transfer/ListBody", "OmitProps")
  @js.native
  val OmitProps: js.Tuple3[handleFilter, handleClear, checkedKeys] = js.native
  
  @js.native
  trait ListBody[RecordType /* <: KeyWiseTransferItem */]
    extends Component[TransferListBodyProps[RecordType], TransferListBodyState, js.Any] {
    
    def getItems(): js.Array[RenderedItem[RecordType]] = js.native
    
    def onItemRemove(item: RecordType): Unit = js.native
    
    def onItemSelect(item: RecordType): Unit = js.native
    
    def onPageChange(current: Double): Unit = js.native
    
    @JSName("state")
    var state_ListBody: Current = js.native
  }
  
  type OmitProp = ElementOf[js.Tuple3[handleFilter, handleClear, checkedKeys]]
  
  type PartialTransferListProps[RecordType] = Omit[TransferListProps[RecordType], OmitProp]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps<RecordType>, antd.antd/lib/transfer/ListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps<RecordType>[P]} */ @js.native
  trait TransferListBodyProps[RecordType] extends StObject {
    
    var filteredItems: js.Array[RecordType] = js.native
    
    var filteredRenderItems: js.Array[RenderedItem[RecordType]] = js.native
    
    var selectedKeys: js.Array[String] = js.native
  }
  object TransferListBodyProps {
    
    @scala.inline
    def apply[RecordType](
      filteredItems: js.Array[RecordType],
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      selectedKeys: js.Array[String]
    ): TransferListBodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyProps[RecordType]]
    }
    
    @scala.inline
    implicit class TransferListBodyPropsMutableBuilder[Self <: TransferListBodyProps[_], RecordType] (val x: Self with TransferListBodyProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value :_*))
      
      @scala.inline
      def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransferListBodyState extends StObject {
    
    var current: Double = js.native
  }
  object TransferListBodyState {
    
    @scala.inline
    def apply(current: Double): TransferListBodyState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyState]
    }
    
    @scala.inline
    implicit class TransferListBodyStateMutableBuilder[Self <: TransferListBodyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
