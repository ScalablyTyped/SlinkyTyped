package typingsSlinky.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event context extension for tasks + transactions;
// See: http://vitaly-t.github.io/pg-promise/global.html#TaskContext
@js.native
trait ITaskContext extends StObject {
  
  val connected: Boolean = js.native
  
  // these are set in the beginning of each task/transaction:
  val context: js.Any = js.native
  
  val dc: js.Any = js.native
  
  val duration: js.UndefOr[Double] = js.native
  
  // these are set at the end of each task/transaction:
  val finish: js.UndefOr[js.Date] = js.native
  
  val inTransaction: Boolean = js.native
  
  val isTX: Boolean = js.native
  
  val level: Double = js.native
  
  val parent: ITaskContext | Null = js.native
  
  val result: js.UndefOr[js.Any] = js.native
  
  // Version of PostgreSQL Server to which we are connected;
  // This property is not available with Native Bindings!
  val serverVersion: String = js.native
  
  val start: js.Date = js.native
  
  val success: js.UndefOr[Boolean] = js.native
  
  val tag: js.Any = js.native
  
  // this exists only inside transactions (isTX = true):
  val txLevel: js.UndefOr[Double] = js.native
  
  val useCount: Double = js.native
}
object ITaskContext {
  
  @scala.inline
  def apply(
    connected: Boolean,
    context: js.Any,
    dc: js.Any,
    inTransaction: Boolean,
    isTX: Boolean,
    level: Double,
    serverVersion: String,
    start: js.Date,
    tag: js.Any,
    useCount: Double
  ): ITaskContext = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], inTransaction = inTransaction.asInstanceOf[js.Any], isTX = isTX.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskContext]
  }
  
  @scala.inline
  implicit class ITaskContextMutableBuilder[Self <: ITaskContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFinish(value: js.Date): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    @scala.inline
    def setInTransaction(value: Boolean): Self = StObject.set(x, "inTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTX(value: Boolean): Self = StObject.set(x, "isTX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ITaskContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setServerVersion(value: String): Self = StObject.set(x, "serverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxLevel(value: Double): Self = StObject.set(x, "txLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxLevelUndefined: Self = StObject.set(x, "txLevel", js.undefined)
    
    @scala.inline
    def setUseCount(value: Double): Self = StObject.set(x, "useCount", value.asInstanceOf[js.Any])
  }
}
