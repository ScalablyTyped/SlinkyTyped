package typingsSlinky.reactRouterNavigation.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouterNavigation.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Tabs")
@js.native
class Tabs ()
  extends Component[TabBarComponentProps, Key, js.Any] {
  @JSName("props")
  var props_Tabs: TabBarComponentProps = js.native
  def renderFooter(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderHeader(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderScene(sceneProps: TabSubViewProps): ReactElement | Null = js.native
  def renderTabBar(sceneProps: TabSubViewProps, props: TabSubViewProps): ReactElement | Null = js.native
}

