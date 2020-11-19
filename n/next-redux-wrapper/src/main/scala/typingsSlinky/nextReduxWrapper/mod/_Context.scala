package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Context extends js.Object
object _Context {
  
  @scala.inline
  def GetStaticPropsContext(): _Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Context]
  }
  
  @scala.inline
  def GetServerSidePropsContext(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse): _Context = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Context]
  }
}
