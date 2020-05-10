package typingsSlinky.antd.components

import typingsSlinky.antd.operationMod.TransferOperationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransferOperation {
  @JSImport("antd", "Transfer.Operation")
  @js.native
  object component extends js.Object
  
  def withProps(p: TransferOperationProps): SharedBuilder_TransferOperationProps1870046190 = new SharedBuilder_TransferOperationProps1870046190(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TransferOperation.type): SharedBuilder_TransferOperationProps1870046190 = new SharedBuilder_TransferOperationProps1870046190(js.Array(this.component, js.Dictionary.empty))()
}

