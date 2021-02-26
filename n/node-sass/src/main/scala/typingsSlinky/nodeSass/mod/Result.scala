package typingsSlinky.nodeSass.mod

import typingsSlinky.node.Buffer
import typingsSlinky.nodeSass.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var css: Buffer = js.native
  
  var map: Buffer = js.native
  
  var stats: Duration = js.native
}
object Result {
  
  @scala.inline
  def apply(css: Buffer, map: Buffer, stats: Duration): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: Buffer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: Buffer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
