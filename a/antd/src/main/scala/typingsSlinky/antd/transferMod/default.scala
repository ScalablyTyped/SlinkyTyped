package typingsSlinky.antd.transferMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.SourceSelectedKeys
import typingsSlinky.antd.anon.TypeofList
import typingsSlinky.antd.anon.TypeofSearch
import typingsSlinky.antd.operationMod.TransferOperationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
class default protected () extends Transfer {
  def this(props: TransferProps) = this()
}
/* static members */
@JSImport("antd/lib/transfer", JSImport.Default)
@js.native
object default extends js.Object {
  
  var List: TypeofList = js.native
  
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): ReactElement = js.native
  
  var Search: TypeofSearch = js.native
  
  var defaultProps: typingsSlinky.antd.anon.ListStyle = js.native
  
  def getDerivedStateFromProps(hasSelectedKeysTargetKeysPaginationChildren: TransferProps): SourceSelectedKeys | Null = js.native
}
