package typingsSlinky.rcMentions.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMentions.mentionsContextMod.MentionsContextProps
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MentionsContextConsumer {
  @JSImport("rc-mentions/lib/MentionsContext", "MentionsContextConsumer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def unstable_observedBits(value: Double): this.type = set("unstable_observedBits", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConsumerProps[MentionsContextProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MentionsContextConsumer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

