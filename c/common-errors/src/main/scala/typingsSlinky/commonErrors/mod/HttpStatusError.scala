package typingsSlinky.commonErrors.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "HttpStatusError")
@js.native
class HttpStatusError protected () extends js.Object {
  /**
    * @param err any instanceof Error
    * @param req the request object
    */
  def this(err: Error) = this()
  /**
    * Figure out a proper status code and message from a given error. To
    * change the mappings, modify HttpStatusError.message_map and
    * HttpStatusError.code_map
    *
    * @param status_code any HTTP status code integer
    * @param message     any message
    */
  def this(status_code: Double) = this()
  def this(err: Error, req: Request_[ParamsDictionary, _, _, Query]) = this()
  def this(status_code: Double, message: String) = this()
  
  /**
    * Status code for this error.
    */
  var statusCode: Double = js.native
}
