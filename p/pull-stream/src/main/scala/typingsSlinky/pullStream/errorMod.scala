package typingsSlinky.pullStream

import typingsSlinky.pullStream.mod.EndOrError
import typingsSlinky.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  @JSImport("pull-stream/sources/error", JSImport.Namespace)
  @js.native
  def apply(err: EndOrError): Source[scala.Nothing] = js.native
}
