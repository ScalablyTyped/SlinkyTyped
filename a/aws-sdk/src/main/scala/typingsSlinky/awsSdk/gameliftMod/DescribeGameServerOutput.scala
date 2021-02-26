package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameServerOutput extends StObject {
  
  /**
    * Object that describes the requested game server.
    */
  var GameServer: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameServer] = js.native
}
object DescribeGameServerOutput {
  
  @scala.inline
  def apply(): DescribeGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerOutput]
  }
  
  @scala.inline
  implicit class DescribeGameServerOutputMutableBuilder[Self <: DescribeGameServerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
