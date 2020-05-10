package typingsSlinky.reduxDevtoolsLogMonitor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.base16.mod.ColorScheme
import typingsSlinky.reduxDevtoolsLogMonitor.mod.ILogMonitorProps
import typingsSlinky.reduxDevtoolsLogMonitor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxDevtoolsLogMonitor {
  @JSImport("redux-devtools-log-monitor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def expandActionRoot(value: Boolean): this.type = set("expandActionRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def expandStateRoot(value: Boolean): this.type = set("expandStateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def preserveScrollTop(value: Boolean): this.type = set("preserveScrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def select(value: /* state */ js.Any => _): this.type = set("select", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: String | ColorScheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ILogMonitorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReduxDevtoolsLogMonitor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

