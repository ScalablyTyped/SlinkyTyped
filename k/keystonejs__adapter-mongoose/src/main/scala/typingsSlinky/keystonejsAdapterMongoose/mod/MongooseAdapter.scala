package typingsSlinky.keystonejsAdapterMongoose.mod

import typingsSlinky.keystonejsKeystone.mod.BaseKeystoneAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/adapter-mongoose", "MongooseAdapter")
@js.native
class MongooseAdapter () extends BaseKeystoneAdapter {
  def this(options: MongooseAdaptorOptions) = this()
  
  def disconnect(): Unit = js.native
  
  def dropDatabase(): js.Any = js.native
}
