package typingsSlinky.reactNativeReadMoreText.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeReadMoreText.mod.ReadMoreProps
import typingsSlinky.reactNativeReadMoreText.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeReadMoreText {
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onReady(value: () => Unit): this.type = set("onReady", js.Any.fromFunction0(value))
  }
  
  def withProps(p: ReadMoreProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => ReactElement,
    renderTruncatedFooter: js.Function0[Unit] => ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReadMoreProps]))
  }
}

