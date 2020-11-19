package typingsSlinky.nodeRal.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.nodeRal.mod.RAL.NormalizerManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def clearConf(): Unit = js.native
  
  def disableUpdate(): Unit = js.native
  
  def enableUpdate(interval: Double, all: Boolean, cb: js.Function2[/* err */ js.Any, /* confs */ js.Any, _]): Unit = js.native
  
  def getConf(name: String): Service = js.native
  
  def getConfNames(): js.Array[String] = js.native
  
  def getContext(serviceID: String): Service = js.native
  def getContext(serviceID: String, options: Service): Service = js.native
  
  def getRawConf(): js.Any = js.native
  
  def getUpdateNeededRawConf(): js.Any = js.native
  
  def isAutoUpdateEnabled(): Boolean = js.native
  
  def load(confPath: String): js.Object = js.native
  
  def loadRawConf(): Service = js.native
  def loadRawConf(config: Service): Service = js.native
  
  def normalize(): js.Object = js.native
  def normalize(config: Service): js.Object = js.native
  
  var normalizerManager: NormalizerManager = js.native
}
@JSImport("node-ral", "Config")
@js.native
object Config extends TopLevel[Config]
