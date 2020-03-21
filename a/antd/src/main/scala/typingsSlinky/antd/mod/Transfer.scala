package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonListStyle
import typingsSlinky.antd.AnonSourceSelectedKeys
import typingsSlinky.antd.TypeofList
import typingsSlinky.antd.TypeofSearchInstantiable
import typingsSlinky.antd.operationMod.TransferOperationProps
import typingsSlinky.antd.transferMod.TransferProps
import typingsSlinky.antd.transferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Search: TypeofSearchInstantiable = js.native
  var defaultProps: AnonListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): ReactElement = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

