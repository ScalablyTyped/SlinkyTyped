package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsAnchorMod.AnchorProps
import typingsSlinky.grommet.componentsRoutedAnchorMod.RoutedAnchorProps
import typingsSlinky.grommet.grommetStrings.href
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RoutedAnchor")
@js.native
class RoutedAnchor protected ()
  extends Component[RoutedAnchorProps with (Omit[AnchorProps, href]), ComponentState, js.Any] {
  def this(props: RoutedAnchorProps with (Omit[AnchorProps, href])) = this()
  def this(props: RoutedAnchorProps with (Omit[AnchorProps, href]), context: js.Any) = this()
}

@JSImport("grommet", "RoutedAnchor")
@js.native
object RoutedAnchor extends TopLevel[ComponentClass[RoutedAnchorProps with (Omit[AnchorProps, href]), ComponentState]]

