package typingsSlinky.nodeRal.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ral", "RAL")
@js.native
object RAL extends js.Object {
  
  def apply(serviceName: String): RalRunner = js.native
  def apply(serviceName: String, options: js.Object): RalRunner = js.native
  
  def appendExtPath(extPath: String): Unit = js.native
  
  def getConf(name: String): Config = js.native
  
  def getRawConf(name: String): Config = js.native
  
  def init(): Unit = js.native
  def init(options: js.Object): Unit = js.native
  
  def reload(): Unit = js.native
  def reload(options: js.Object): Unit = js.native
  
  def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
  
  @js.native
  class NormalizerManager () extends js.Object {
    
    @JSName("apply")
    def apply(config: js.Object): js.Object = js.native
    
    def needUpdate(config: js.Any): Boolean = js.native
    
    var normalizers: js.Array[String] = js.native
    
    def setConfigNormalizer(normalizers: js.Array[String]): Unit = js.native
  }
  
  @js.native
  class RalRunner protected () extends EventEmitter {
    def this(serviceName: String) = this()
    def this(serviceName: String, options: js.Object) = this()
    
    def callRetry(err: js.Any): Unit = js.native
    
    def doRequest(): Unit = js.native
    
    def getLogInfo(): LogInfo = js.native
    
    def throwError(err: js.Any): Unit = js.native
  }
}
