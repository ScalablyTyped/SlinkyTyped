package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.ListStyle
import typingsSlinky.antd.anon.SourceSelectedKeys
import typingsSlinky.antd.anon.TypeofList
import typingsSlinky.antd.anon.TypeofSearch
import typingsSlinky.antd.operationMod.TransferOperationProps
import typingsSlinky.antd.transferMod.TransferProps
import typingsSlinky.antd.transferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Transfer")
@js.native
class Transfer protected () extends default {
  def this(props: TransferProps) = this()
}
/* static members */
@JSImport("antd", "Transfer")
@js.native
object Transfer extends js.Object {
  
  var List: TypeofList = js.native
  
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): ReactElement = js.native
  
  var Search: TypeofSearch = js.native
  
  var defaultProps: ListStyle = js.native
  
  def getDerivedStateFromProps(hasSelectedKeysTargetKeysPaginationChildren: TransferProps): SourceSelectedKeys | Null = js.native
}
