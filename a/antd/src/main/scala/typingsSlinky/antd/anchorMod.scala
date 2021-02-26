package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.anon.Affix
import typingsSlinky.antd.anon.TypeofAnchorLink
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorMod {
  
  @JSImport("antd/lib/anchor", JSImport.Default)
  @js.native
  class default ()
    extends typingsSlinky.antd.anchorAnchorMod.default
  /* static members */
  object default {
    
    @JSImport("antd/lib/anchor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/anchor", "default.Link")
    @js.native
    def Link: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink = js.native
    @scala.inline
    def Link_=(x: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor", "default.defaultProps")
    @js.native
    def defaultProps: Affix = js.native
    @scala.inline
    def defaultProps_=(x: Affix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
