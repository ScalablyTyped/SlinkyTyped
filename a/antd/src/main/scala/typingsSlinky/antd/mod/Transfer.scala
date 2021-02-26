package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.DataSource
import typingsSlinky.antd.anon.Placeholder
import typingsSlinky.antd.anon.SourceSelectedKeys
import typingsSlinky.antd.operationMod.TransferOperationProps
import typingsSlinky.antd.transferListMod.TransferListProps
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.antd.transferMod.TransferProps
import typingsSlinky.antd.transferMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Transfer")
@js.native
class Transfer[RecordType /* <: TransferItem */] protected () extends default[RecordType] {
  def this(props: TransferProps[RecordType]) = this()
}
object Transfer {
  
  @JSImport("antd", "Transfer")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Transfer.List")
  @js.native
  class List[RecordType /* <: KeyWiseTransferItem */] protected ()
    extends typingsSlinky.antd.transferListMod.default[RecordType] {
    def this(props: TransferListProps[/* import warning: RewrittenClass.unapply cls was tparam RecordType */ _]) = this()
  }
  /* static member */
  /* was `typeof List` */
  object List {
    
    @JSImport("antd", "Transfer.List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.List.defaultProps")
    @js.native
    def defaultProps: DataSource = js.native
    @scala.inline
    def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("antd", "Transfer.Operation")
  @js.native
  def Operation: js.Function1[
    /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
    ReactElement
  ] = js.native
  @scala.inline
  def Operation_=(
    x: js.Function1[
      /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
      ReactElement
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Transfer.Search")
  @js.native
  class Search ()
    extends typingsSlinky.antd.transferSearchMod.default
  /* static member */
  /* was `typeof Search` */
  object Search {
    
    @JSImport("antd", "Transfer.Search")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.Search.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    @scala.inline
    def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd", "Transfer.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.defaultProps.dataSource")
    @js.native
    def dataSource: js.Array[scala.Nothing] = js.native
    @scala.inline
    def dataSource_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Transfer.defaultProps.listStyle")
    @js.native
    def listStyle(): Unit = js.native
    
    @JSImport("antd", "Transfer.defaultProps.showSearch")
    @js.native
    def showSearch: Boolean = js.native
    @scala.inline
    def showSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("antd", "Transfer.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = js.native
}
