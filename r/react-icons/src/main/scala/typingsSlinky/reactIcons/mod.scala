package typingsSlinky.reactIcons

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactIcons.iconBaseMod.IconBaseProps
import typingsSlinky.reactIcons.iconBaseMod.IconTree
import typingsSlinky.reactIcons.iconsManifestMod.IconManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-icons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DefaultContext: typingsSlinky.reactIcons.iconContextMod.IconContext = js.native
  val IconContext: Context[typingsSlinky.reactIcons.iconContextMod.IconContext] = js.native
  val icons: IconManifest = js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, ReactElement] = js.native
  def IconBase(props: IconBasePropsattrundefine): ReactElement = js.native
}

