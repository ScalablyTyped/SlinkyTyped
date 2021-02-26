package typingsSlinky.pinoMultiStream

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.pino.mod.DestinationStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Level extends StObject {
    
    var level: js.UndefOr[typingsSlinky.pinoMultiStream.mod.Level] = js.native
    
    var stream: DestinationStream | WritableStream = js.native
  }
  object Level {
    
    @scala.inline
    def apply(stream: DestinationStream | WritableStream): Level = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: typingsSlinky.pinoMultiStream.mod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setStream(value: DestinationStream | WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
