package typingsSlinky.reactJss.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jss.mod.CreateGenerateIdOptions
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.SheetsRegistry
import typingsSlinky.jss.mod.StyleSheet
import typingsSlinky.reactJss.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JssProvider {
  @JSImport("react-jss", "JssProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStylesGeneration(value: Boolean): this.type = set("disableStylesGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def generateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): this.type = set("generateId", js.Any.fromFunction2(value))
    @scala.inline
    def id(value: CreateGenerateIdOptions): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def jss(value: Jss): this.type = set("jss", value.asInstanceOf[js.Any])
    @scala.inline
    def registry(value: SheetsRegistry): this.type = set("registry", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: JssProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

