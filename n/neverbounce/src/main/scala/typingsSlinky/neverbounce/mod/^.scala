package typingsSlinky.neverbounce.mod

import typingsSlinky.neverbounce.Anon0
import typingsSlinky.neverbounce.AnonInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neverbounce", JSImport.Namespace)
@js.native
class ^ protected () extends NeverBounce {
  def this(config: Config) = this()
  /* CompleteClass */
  override var account: Account = js.native
  /* CompleteClass */
  override var errors: js.Error = js.native
  /* CompleteClass */
  override var jobs: Jobs = js.native
  /* CompleteClass */
  override var poe: Poe = js.native
  /* CompleteClass */
  override var single: Single = js.native
  /* CompleteClass */
  override def getConfig(): Config = js.native
  /* CompleteClass */
  override def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
  /* CompleteClass */
  override def setApiKey(key: String): Unit = js.native
  /* CompleteClass */
  override def setHost(host: String): Unit = js.native
}

@JSImport("neverbounce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultConfig: Config = js.native
  var job: AnonInputType = js.native
  var result: Anon0 = js.native
}

