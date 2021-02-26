package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.abort
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ReplyContent[T] extends StObject
object _ReplyContent {
  
  @scala.inline
  def IReplyAbortContent(status: abort): typingsSlinky.jupyterlabServices.messagesMod.IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabServices.messagesMod.IReplyAbortContent]
  }
  
  @scala.inline
  def IReplyErrorContent(ename: String, evalue: String, status: error, traceback: js.Array[String]): typingsSlinky.jupyterlabServices.messagesMod.IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabServices.messagesMod.IReplyErrorContent]
  }
}
