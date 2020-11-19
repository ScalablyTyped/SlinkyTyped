package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.OQ
import typingsSlinky.minappEnv.Promise
import typingsSlinky.minappEnv.anon.RQIGetDocumentOptions
import typingsSlinky.minappEnv.anon.RQIRemoveSingleDocumentOp
import typingsSlinky.minappEnv.anon.RQISetSingleDocumentOptio
import typingsSlinky.minappEnv.anon.RQIUpdateSingleDocumentOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference extends js.Object {
  
  def field(`object`: js.Object): this.type = js.native
  
  // get(options?: IGetDocumentOptions): Promise<IQuerySingleResult> | void
  // set(options?: ISetSingleDocumentOptions): Promise<ISetResult> | void
  // update(options?: IUpdateSingleDocumentOptions): Promise<IUpdateResult> | void
  // remove(options?: IRemoveSingleDocumentOptions): Promise<IRemoveResult> | void
  // get(options?: IGetDocumentOptions): Promise<IQuerySingleResult> | void
  def get(): Promise[IQuerySingleResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): Promise[IQuerySingleResult] = js.native
  
  // remove(options?: IRemoveSingleDocumentOptions): Promise<IRemoveResult> | void
  def remove(): Promise[IRemoveResult] = js.native
  def remove(options: OQ[IRemoveSingleDocumentOptions]): Unit = js.native
  def remove(options: RQIRemoveSingleDocumentOp): Promise[IRemoveResult] = js.native
  
  // set(options?: ISetSingleDocumentOptions): Promise<ISetResult> | void
  def set(): Promise[ISetResult] = js.native
  def set(options: OQ[ISetSingleDocumentOptions]): Unit = js.native
  def set(options: RQISetSingleDocumentOptio): Promise[ISetResult] = js.native
  
  // update(options?: IUpdateSingleDocumentOptions): Promise<IUpdateResult> | void
  def update(): Promise[IUpdateResult] = js.native
  def update(options: OQ[IUpdateSingleDocumentOptions]): Unit = js.native
  def update(options: RQIUpdateSingleDocumentOp): Promise[IUpdateResult] = js.native
}
