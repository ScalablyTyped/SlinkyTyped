package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.anon.PartialTag
import typingsSlinky.intercomClient.tagMod.List
import typingsSlinky.intercomClient.tagMod.Tag
import typingsSlinky.intercomClient.tagMod.TagIdentifier
import typingsSlinky.intercomClient.tagMod.TagOper
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intercom-client", "Tags")
@js.native
class Tags () extends js.Object {
  
  def create(tag: PartialTag): js.Promise[ApiResponse[Tag]] = js.native
  def create(tag: PartialTag, cb: callback[ApiResponse[Tag]]): Unit = js.native
  
  def delete(tag: TagIdentifier): js.Promise[IncomingMessage] = js.native
  def delete(tag: TagIdentifier, cb: callback[IncomingMessage]): Unit = js.native
  
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  
  def tag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
  def tag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
  
  def untag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
  def untag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
}
