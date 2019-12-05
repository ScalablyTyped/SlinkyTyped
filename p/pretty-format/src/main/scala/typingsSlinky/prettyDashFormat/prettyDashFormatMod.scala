package typingsSlinky.prettyDashFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object prettyDashFormatMod extends js.Object {
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: typingsSlinky.prettyDashFormat.buildTypesMod.OptionsReceived): String = js.native
  @js.native
  object plugins extends js.Object {
    var AsymmetricMatcher: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ConvertAnsi: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var DOMCollection: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var DOMElement: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var Immutable: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ReactElement: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
    var ReactTestComponent: typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin = js.native
  }
  
  type Colors = typingsSlinky.prettyDashFormat.buildTypesMod.Colors
  type Config = typingsSlinky.prettyDashFormat.buildTypesMod.Config
  type NewPlugin = typingsSlinky.prettyDashFormat.buildTypesMod.NewPlugin
  type Options = typingsSlinky.prettyDashFormat.buildTypesMod.Options
  type OptionsReceived = typingsSlinky.prettyDashFormat.buildTypesMod.OptionsReceived
  type Plugin = typingsSlinky.prettyDashFormat.buildTypesMod.Plugin
  type Plugins = typingsSlinky.prettyDashFormat.buildTypesMod.Plugins
  type Refs = typingsSlinky.prettyDashFormat.buildTypesMod.Refs
  type Theme = typingsSlinky.prettyDashFormat.buildTypesMod.Theme
}

