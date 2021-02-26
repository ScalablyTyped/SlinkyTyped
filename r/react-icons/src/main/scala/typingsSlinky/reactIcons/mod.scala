package typingsSlinky.reactIcons

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactIcons.anon.IconBasePropsattrundefine
import typingsSlinky.reactIcons.iconBaseMod.IconBaseProps
import typingsSlinky.reactIcons.iconBaseMod.IconTree
import typingsSlinky.reactIcons.iconsManifestMod.IconManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icons", "DefaultContext")
  @js.native
  val DefaultContext: typingsSlinky.reactIcons.iconContextMod.IconContext = js.native
  
  @JSImport("react-icons", "GenIcon")
  @js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, ReactElement] = js.native
  
  @JSImport("react-icons", "IconBase")
  @js.native
  def IconBase(props: IconBasePropsattrundefine): ReactElement = js.native
  
  @JSImport("react-icons", "IconContext")
  @js.native
  val IconContext: Context[typingsSlinky.reactIcons.iconContextMod.IconContext] = js.native
  
  @JSImport("react-icons", "icons")
  @js.native
  val icons: IconManifest = js.native
}
