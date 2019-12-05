package typingsSlinky.atOktaOktaDashVue.atOktaOktaDashVueMod

import typingsSlinky.atOktaOktaDashVue.atOktaOktaDashVueMod.OktaVuePlugin.OktaVueOptions
import typingsSlinky.vue.typesPluginMod.PluginFunction
import typingsSlinky.vue.typesVueMod.Vue
import typingsSlinky.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@okta/okta-vue", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): PluginFunction[VueConstructor[Vue]] = js.native
  def handleCallback(): VueConstructor[Vue] = js.native
  def install(vm: VueConstructor[Vue], options: OktaVueOptions): PluginFunction[VueConstructor[Vue]] = js.native
}

