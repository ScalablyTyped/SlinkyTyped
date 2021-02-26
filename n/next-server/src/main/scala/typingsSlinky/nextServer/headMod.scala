package typingsSlinky.nextServer

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headMod {
  
  object default {
    
    /**
      * This component injects elements to `<head>` of your page.
      * To avoid duplicated `tags` in `<head>` you can use the `key` property, which will make sure every tag is only rendered once.
      */
    @JSImport("next-server/dist/lib/head", JSImport.Default)
    @js.native
    def apply(hasChildren: Children): ReactElement = js.native
    @JSImport("next-server/dist/lib/head", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next-server/dist/lib/head", "default.rewind")
    @js.native
    def rewind: js.Function0[js.UndefOr[js.Array[ReactElement]]] = js.native
    @scala.inline
    def rewind_=(x: js.Function0[js.UndefOr[js.Array[ReactElement]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewind")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("next-server/dist/lib/head", "defaultHead")
  @js.native
  def defaultHead(): js.Array[ReactElement] = js.native
  @JSImport("next-server/dist/lib/head", "defaultHead")
  @js.native
  def defaultHead(inAmpMode: Boolean): js.Array[ReactElement] = js.native
}
