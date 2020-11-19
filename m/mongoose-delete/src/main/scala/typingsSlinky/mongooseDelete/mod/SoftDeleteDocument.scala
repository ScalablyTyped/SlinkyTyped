package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Types.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftDeleteDocument
  extends Document
     with SoftDeleteInterface {
  
  /** Soft delete this document */
  def delete(): js.Promise[this.type] = js.native
  def delete(deleteBy: js.UndefOr[scala.Nothing], fn: Callback[this.type, this.type]): js.Promise[this.type] = js.native
  def delete(deleteBy: String): js.Promise[this.type] = js.native
  def delete(deleteBy: String, fn: Callback[this.type, this.type]): js.Promise[this.type] = js.native
  def delete(deleteBy: ObjectId): js.Promise[this.type] = js.native
  def delete(deleteBy: ObjectId, fn: Callback[this.type, this.type]): js.Promise[this.type] = js.native
  def delete(deleteBy: Callback[this.type, this.type]): js.Promise[this.type] = js.native
  def delete(deleteBy: Callback[this.type, this.type], fn: Callback[this.type, this.type]): js.Promise[this.type] = js.native
  
  def restore(): js.Promise[this.type] = js.native
  def restore(fn: Callback[this.type, this.type]): js.Promise[this.type] = js.native
}
