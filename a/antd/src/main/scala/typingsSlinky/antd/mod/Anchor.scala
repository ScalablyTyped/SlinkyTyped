package typingsSlinky.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.anchorMod.default
import typingsSlinky.antd.anon.TypeofAnchorLink
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Anchor")
@js.native
class Anchor () extends default
/* static members */
object Anchor {
  
  @JSImport("antd", "Anchor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Anchor.Link")
  @js.native
  def Link: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink = js.native
  @scala.inline
  def Link_=(x: Instantiable0[typingsSlinky.antd.anchorLinkMod.default] with TypeofAnchorLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Anchor.contextType")
  @js.native
  def contextType: Context[ConfigConsumerProps] = js.native
  @scala.inline
  def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Anchor.defaultProps")
  @js.native
  def defaultProps: typingsSlinky.antd.anon.Affix = js.native
  @scala.inline
  def defaultProps_=(x: typingsSlinky.antd.anon.Affix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
