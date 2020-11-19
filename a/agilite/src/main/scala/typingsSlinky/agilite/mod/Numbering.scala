package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("agilite", "Numbering")
@js.native
class Numbering protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  
  def deleteData(recordId: String): js.Any = js.native
  
  def generate(profileKey: String, outputFormat: String, data: js.Any): js.Any = js.native
  
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  
  var outputFormat: typingsSlinky.agilite.mod.outputFormat = js.native
  
  def postData(data: js.Any): js.Any = js.native
  
  def putData(recordId: String, data: js.Any): js.Any = js.native
  
  def resetCounters(recordId: String): js.Any = js.native
}
