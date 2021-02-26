package typingsSlinky.foreverAgent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.foreverAgent.anon.TypeofForeverAgent
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.AgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("forever-agent", JSImport.Namespace)
  @js.native
  class ^ () extends Agent {
    def this(options: ForeverAgentOptions) = this()
  }
  @JSImport("forever-agent", JSImport.Namespace)
  @js.native
  val ^ : TypeofForeverAgent with (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) with typingsSlinky.foreverAgent.anon.SSL = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("forever-agent", "SSL")
  @js.native
  class SSL () extends Agent {
    def this(options: ForeverAgentOptions) = this()
  }
  
  type ForeverAgent = Agent
  
  @js.native
  trait ForeverAgentOptions extends AgentOptions {
    
    var minSockets: js.UndefOr[Double] = js.native
  }
  object ForeverAgentOptions {
    
    @scala.inline
    def apply(): ForeverAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForeverAgentOptions]
    }
    
    @scala.inline
    implicit class ForeverAgentOptionsMutableBuilder[Self <: ForeverAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinSockets(value: Double): Self = StObject.set(x, "minSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSocketsUndefined: Self = StObject.set(x, "minSockets", js.undefined)
    }
  }
  
  type ForeverAgentSSL = ForeverAgent
  
  type _To = TypeofForeverAgent with (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) with typingsSlinky.foreverAgent.anon.SSL
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TypeofForeverAgent with (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) with typingsSlinky.foreverAgent.anon.SSL = ^
}
