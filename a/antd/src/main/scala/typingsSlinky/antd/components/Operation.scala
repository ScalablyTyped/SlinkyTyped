package typingsSlinky.antd.components

import typingsSlinky.antd.operationMod.TransferOperationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Operation {
  @JSImport("antd/lib/transfer/operation", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TransferOperationProps): SharedBuilder_TransferOperationProps1870046190 = new SharedBuilder_TransferOperationProps1870046190(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Operation.type): SharedBuilder_TransferOperationProps1870046190 = new SharedBuilder_TransferOperationProps1870046190(js.Array(this.component, js.Dictionary.empty))()
}

