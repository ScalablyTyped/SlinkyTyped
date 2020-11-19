package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.PageToken
import typingsSlinky.gapiClientGames.anon.QuestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuestsResource extends js.Object {
  
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: QuestId): Request[Quest] = js.native
  
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: PageToken): Request[QuestListResponse] = js.native
}
object QuestsResource {
  
  @scala.inline
  def apply(accept: QuestId => Request[Quest], list: PageToken => Request[QuestListResponse]): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[QuestsResource]
  }
  
  @scala.inline
  implicit class QuestsResourceOps[Self <: QuestsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccept(value: QuestId => Request[Quest]): Self = this.set("accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: PageToken => Request[QuestListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
