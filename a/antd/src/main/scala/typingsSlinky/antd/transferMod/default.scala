package typingsSlinky.antd.transferMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonListStyle
import typingsSlinky.antd.AnonSourceSelectedKeys
import typingsSlinky.antd.TypeofList
import typingsSlinky.antd.TypeofSearchInstantiable
import typingsSlinky.antd.operationMod.TransferOperationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Search: TypeofSearchInstantiable = js.native
  var defaultProps: AnonListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): ReactElement = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

