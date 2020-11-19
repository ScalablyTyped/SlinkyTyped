package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGameSessionQueueOutput extends js.Object {
  
  /**
    * An object that describes the newly created game session queue.
    */
  var GameSessionQueue: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionQueue] = js.native
}
object CreateGameSessionQueueOutput {
  
  @scala.inline
  def apply(): CreateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionQueueOutput]
  }
  
  @scala.inline
  implicit class CreateGameSessionQueueOutputOps[Self <: CreateGameSessionQueueOutput] (val x: Self) extends AnyVal {
    
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
    def setGameSessionQueue(value: GameSessionQueue): Self = this.set("GameSessionQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionQueue: Self = this.set("GameSessionQueue", js.undefined)
  }
}
